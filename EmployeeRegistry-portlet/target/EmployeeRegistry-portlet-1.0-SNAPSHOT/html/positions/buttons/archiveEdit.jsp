<%@include file="/html/init.jsp" %>

<%
    ResultRow res = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Position position = (Position) res.getObject();
    String positionId = String.valueOf(position.getPrimaryKey());
    String positionArchiveStatus = String.valueOf(position.getArchive_status());
%>

<liferay-ui:icon-menu>
    <portlet:actionURL name="changeArchiveStatus" var="changeArchiveStatusURL">
        <portlet:param name="currentPositionId" value="<%=positionId%>"/>
        <portlet:param name="currentArchiveStatus" value="<%=positionArchiveStatus%>"/>
    </portlet:actionURL>
    <liferay-ui:icon image="edit" message="Change archive status" url="<%= changeArchiveStatusURL %>"/>
</liferay-ui:icon-menu>