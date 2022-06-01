<%@include file="/html/init.jsp" %>

<%
    ResultRow res = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Bank bank = (Bank) res.getObject();
    String bankId = String.valueOf(bank.getPrimaryKey());
%>

<liferay-ui:icon-menu>
    <portlet:actionURL name="getCurrentBank" var="getCurrentBankURL">
        <portlet:param name="currentBankId" value="<%=bankId%>"/>
    </portlet:actionURL>
    <liferay-ui:icon image="edit" message="Edit" url="<%=getCurrentBankURL %>"/>
</liferay-ui:icon-menu>