<%@include file="/html/init.jsp" %>

<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%= PositionLocalServiceUtil.getByArchiveStatus(false) %>"/>

    <aui:fieldset label="Archive positions"/>
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

    <portlet:renderURL var="backViewURL">
        <portlet:param name="mvcPath" value="/html/positions/archive.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= backViewURL %>" value="Back"/>
</aui:button-row>