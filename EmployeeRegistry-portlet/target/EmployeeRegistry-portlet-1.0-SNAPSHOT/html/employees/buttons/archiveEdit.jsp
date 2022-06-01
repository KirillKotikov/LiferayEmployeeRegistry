<%@include file="/html/init.jsp" %>

<%
    ResultRow res = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Employee employee = (Employee) res.getObject();
    String employeeId = String.valueOf(employee.getPrimaryKey());
    String employeeArchiveStatus = String.valueOf(employee.getArchiveStatus());
%>

<liferay-ui:icon-menu>
    <portlet:actionURL name="changeEmployeeArchiveStatus" var="changeArchiveStatusURL">
        <portlet:param name="currentEmployeeId" value="<%=employeeId%>"/>
        <portlet:param name="currentEmployeeArchiveStatus" value="<%=employeeArchiveStatus%>"/>
    </portlet:actionURL>
    <liferay-ui:icon image="edit" message="Change archive status" url="<%= changeArchiveStatusURL %>"/>
</liferay-ui:icon-menu>