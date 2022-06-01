<%@include file="/html/init.jsp" %>

<jsp:useBean id="currentBank" type="ru.kotikov.registry.model.Bank" scope="request"/>

<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%= EmployeeLocalServiceUtil.getBankClients(currentBank.getBank_id()) %>"/>

    <liferay-ui:search-container-row
            className="ru.kotikov.registry.model.Employee" modelVar="employees">

        <liferay-ui:search-container-column-jsp path="/html/employees/buttons/employeeEdit.jsp" align="left"/>
        <liferay-ui:search-container-column-text property="last_name" name="Last name"/>
        <liferay-ui:search-container-column-text property="first_name" name="First name"/>
        <liferay-ui:search-container-column-text property="patronymic" name="Patronymic"/>
        <liferay-ui:search-container-column-text property="sex" name="Sex"/>
        <liferay-ui:search-container-column-text property="date_of_birth" name="Date of birth"/>
        <liferay-ui:search-container-column-text property="position_id" name="Position id"/>
        <liferay-ui:search-container-column-text property="date_of_employment" name="Date of employment"/>
        <liferay-ui:search-container-column-text property="salary" name="Salary"/>
        <liferay-ui:search-container-column-text property="work_phone_number" name="Work phone number"/>
        <liferay-ui:search-container-column-text property="mobile_phone_number" name="Mobile phone number"/>
        <liferay-ui:search-container-column-text property="bank_id" name="Bank id"/>
        <liferay-ui:search-container-column-text property="archive_status" name="Archive status"/>
        <liferay-ui:search-container-column-jsp path="/html/employees/buttons/archiveEdit.jsp" align="right"/>
    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator/>
</liferay-ui:search-container>

<aui:button-row cssClass="back">

    <portlet:renderURL var="backURL">
        <portlet:param name="mvcPath" value="/html/banks/allBanks.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= backURL %>" value="Back"/>
</aui:button-row>