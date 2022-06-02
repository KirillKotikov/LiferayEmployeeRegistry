<%@include file="/html/init.jsp" %>

<jsp:useBean id="currentPosition" type="ru.kotikov.registry.model.Position" scope="request"/>
<jsp:useBean id="employeesAvailable" type="java.lang.Integer" scope="request"/>

<aui:script use="aui-dialog">
    if (<%=employeesAvailable%> == 1 ) alert("Attention! There are employees with this position!");
</aui:script>

<portlet:actionURL name="updatePosition" var="updatePositionURL"/>
<aui:form action="<%= updatePositionURL %>" name="<portlet:namespace />fm">

    <aui:fieldset>
        <aui:input name="Position id" value="<%= currentPosition.getPosition_id() %>" type="hidden"/>
        <aui:input name="Position name" value="<%= currentPosition.getPosition_name() %>"/>
        <aui:input name="Archive status" value="<%= currentPosition.getArchive_status() %>"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" value="Save"/>
        <portlet:renderURL var="backViewURL">
            <portlet:param name="mvcPath" value="/html/positions/allPositions.jsp"/>
        </portlet:renderURL>

        <aui:button onClick="<%= backViewURL %>" value="Back"/>
    </aui:button-row>
</aui:form>