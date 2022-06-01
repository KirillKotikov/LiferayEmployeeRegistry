<%@include file="/html/init.jsp" %>

<portlet:renderURL var="addPosition">
    <portlet:param name="mvcPath" value="/html/positions/addPosition.jsp"/>
</portlet:renderURL>

<aui:button onClick="<%= addPosition %>" value="Add Position"/>

<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%= PositionLocalServiceUtil.getByArchiveStatus(true)%>"/>

    <liferay-ui:search-container-row
            className="ru.kotikov.registry.model.Position" modelVar="Position">
        <liferay-ui:search-container-column-jsp path="/html/positions/buttons/positionEdit.jsp" align="left"/>
        <liferay-ui:search-container-column-text property="position_name" name="Position name"/>
        <liferay-ui:search-container-column-text property="archive_status" name="Archive status"/>
        <liferay-ui:search-container-column-jsp path="/html/positions/buttons/archiveEdit.jsp" align="right"/>
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator/>
</liferay-ui:search-container>

<aui:button-row cssClass="back">
    <portlet:renderURL var="showAllPositions">
        <portlet:param name="mvcPath" value="/html/positions/allPositions.jsp"/>
    </portlet:renderURL>
    <aui:button onClick="<%= showAllPositions %>" value="Show all positions"/>

    <portlet:renderURL var="Archive">
        <portlet:param name="mvcPath" value="/html/positions/archive.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= Archive %>" value="Archive"/>
    <portlet:renderURL var="backViewURL">
        <portlet:param name="mvcPath" value="/html/positions/main.jsp"/>
    </portlet:renderURL>
    <aui:button onClick="<%= backViewURL %>" value="Back"/>
</aui:button-row>