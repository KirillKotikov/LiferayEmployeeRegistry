<%@include file="/html/init.jsp" %>

<portlet:renderURL var="addBank">
    <portlet:param name="mvcPath" value="/html/banks/addBank.jsp"/>
</portlet:renderURL>

<aui:button onClick="<%= addBank %>" value="Add new Bank"/>

<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%=BankLocalServiceUtil.getBanks(searchContainer.getStart(), searchContainer.getEnd())%>"/>

    <liferay-ui:search-container-row
            className="ru.kotikov.registry.model.Bank" modelVar="Bank">

        <liferay-ui:search-container-column-jsp path="/html/banks/buttons/bankEdit.jsp" align="left"/>
        <liferay-ui:search-container-column-text property="bankId" name="Bank id"/>
        <liferay-ui:search-container-column-text property="bankName" name="Bank name"/>
        <liferay-ui:search-container-column-text property="bik" name="BIK"/>
        <liferay-ui:search-container-column-text property="bankAddress" name="Bank address"/>
        <liferay-ui:search-container-column-jsp path="/html/banks/buttons/bankClients.jsp" align="right"/>

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator/>
</liferay-ui:search-container>

<aui:button-row cssClass="back">

    <portlet:renderURL var="backViewURL">
        <portlet:param name="mvcPath" value="/html/banks/main.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= backViewURL %>" value="Back"/>
</aui:button-row>

