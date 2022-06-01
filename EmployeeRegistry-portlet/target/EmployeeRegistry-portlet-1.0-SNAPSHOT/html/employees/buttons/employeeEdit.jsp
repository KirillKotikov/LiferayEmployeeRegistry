<%@include file="/html/init.jsp" %>

<%
    ResultRow res = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Employee employee = (Employee) res.getObject();
    String employeeId = String.valueOf(employee.getPrimaryKey());
%>

<liferay-ui:icon-menu>
    <portlet:actionURL name="getCurrentEmployee" var="getCurrentEmployeeURL">
        <portlet:param name="currentEmployeeId" value="<%=employeeId%>"/>
    </portlet:actionURL>
    <liferay-ui:icon image="edit" message="Edit" url="<%=getCurrentEmployeeURL %>"/>
</liferay-ui:icon-menu>