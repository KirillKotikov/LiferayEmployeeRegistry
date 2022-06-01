<%@include file="/html/init.jsp" %>

<portlet:renderURL var="addPositionURL">
    <portlet:param name="mvcPath" value="/html/employees/allPositions.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="addPosition" var="addPositionURL"/>

<aui:form action="<%= addPositionURL %>" name="<portlet:namespace />fm">
    <aui:fieldset>
        <aui:input name="Position name"/>
        <aui:input name="Archive status"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"/>
        <aui:button type="cancel" onClick="<%= addPositionURL %>"/>
    </aui:button-row>
</aui:form>