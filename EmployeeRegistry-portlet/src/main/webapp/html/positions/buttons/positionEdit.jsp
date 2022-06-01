<%@include file="/html/init.jsp" %>

<%
    ResultRow res = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Position position = (Position) res.getObject();
    String positionId = String.valueOf(position.getPrimaryKey());
%>

<liferay-ui:icon-menu>
    <portlet:actionURL name="getCurrentPosition" var="getCurrentPositionURL">
        <portlet:param name="currentPositionId" value="<%=positionId%>"/>
    </portlet:actionURL>
    <liferay-ui:icon image="edit" message="Edit" url="<%=getCurrentPositionURL %>"/>
</liferay-ui:icon-menu>