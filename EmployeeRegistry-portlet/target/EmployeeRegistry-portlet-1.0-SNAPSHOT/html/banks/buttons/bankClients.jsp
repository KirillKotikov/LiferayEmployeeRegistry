<%@include file="/html/init.jsp" %>

<%
    ResultRow res = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Bank bank = (Bank) res.getObject();
    String bankId = String.valueOf(bank.getBank_id());
%>
<liferay-ui:icon-menu>
    <portlet:actionURL name="getCurrentBankClients" var="getCurrentBankClientsURL">
        <portlet:param name="currentBankClientsId" value="<%=bankId%>"/>
    </portlet:actionURL>
    <liferay-ui:icon image="Employees" message="Employees" url="<%=getCurrentBankClientsURL %>"/>
</liferay-ui:icon-menu>