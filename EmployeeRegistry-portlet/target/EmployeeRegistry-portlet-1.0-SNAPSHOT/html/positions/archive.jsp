<%@include file="/html/init.jsp" %>

<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%= PositionLocalServiceUtil.getByArchiveStatus(false) %>"/>

    <liferay-ui:search-container-row
            className="ru.kotikov.registry.model.Position" modelVar="position">

        <liferay-ui:search-container-column-jsp path="/html/positions/buttons/positionEdit.jsp" align="left"/>
        <liferay-ui:search-container-column-text property="positionName" name="Position name"/>
        <liferay-ui:search-container-column-text property="archiveStatus" name="Archive status"/>
        <liferay-ui:search-container-column-jsp path="/html/positions/buttons/archiveEdit.jsp" align="right"/>

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator/>
</liferay-ui:search-container>

<aui:button-row cssClass="back">

    <portlet:renderURL var="backViewURL">
        <portlet:param name="mvcPath" value="/html/positions/main.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= backViewURL %>" value="Back"/>
</aui:button-row>