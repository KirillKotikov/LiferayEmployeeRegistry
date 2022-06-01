<%@include file="/html/init.jsp" %>

<jsp:useBean id="currentPosition" type="ru.kotikov.registry.model.Position" scope="request"/>

<portlet:actionURL name="updatePosition" var="updatePositionURL"/>
<aui:form action="<%= updatePositionURL %>" name="<portlet:namespace />fm">

    <aui:fieldset>
        <aui:input name="Position id" value="<%= currentPosition.getPositionId() %>" type="hidden"/>
        <aui:input name="Position name" value="<%= currentPosition.getPositionName() %>"/>
        <aui:input name="Archive status" value="<%= currentPosition.getArchiveStatus() %>"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" value="Save"/>
    </aui:button-row>
</aui:form>