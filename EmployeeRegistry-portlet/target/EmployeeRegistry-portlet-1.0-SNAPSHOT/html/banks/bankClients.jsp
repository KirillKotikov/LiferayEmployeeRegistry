<%@include file="/html/init.jsp" %>

<jsp:useBean id="currentBankClients" type="ru.kotikov.registry.model.Bank" scope="request"/>

<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%= EmployeeLocalServiceUtil.getBankClients(currentBankClients.getBankId()) %>"/>

    <liferay-ui:search-container-row
            className="ru.kotikov.registry.model.Employee" modelVar="employees">

        <liferay-ui:search-container-column-jsp path="/html/employees/buttons/employeeEdit.jsp" align="left"/>
        <liferay-ui:search-container-column-text property="lastName" name="Last name"/>
        <liferay-ui:search-container-column-text property="firstName" name="First name"/>
        <liferay-ui:search-container-column-text property="patronymic" name="Patronymic"/>
        <liferay-ui:search-container-column-text property="sex" name="Sex"/>
        <liferay-ui:search-container-column-text property="dateOfBirth" name="Date of birth"/>
        <liferay-ui:search-container-column-text property="positionId" name="Position id"/>
        <liferay-ui:search-container-column-text property="dateOfEmployment" name="Date of employment"/>
        <liferay-ui:search-container-column-text property="salary" name="Salary"/>
        <liferay-ui:search-container-column-text property="workPhoneNumber" name="Work phone number"/>
        <liferay-ui:search-container-column-text property="mobilePhoneNumber" name="Mobile phone number"/>
        <liferay-ui:search-container-column-text property="bankId" name="Bank id"/>
        <liferay-ui:search-container-column-text property="archiveStatus" name="Archive status"/>
        <liferay-ui:search-container-column-jsp path="/html/employees/buttons/archiveEdit.jsp" align="right"/>
    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator/>
</liferay-ui:search-container>

<aui:button-row cssClass="menu-buttons">

    <portlet:renderURL var="backURL">
        <portlet:param name="mvcPath" value="/html/employees/allEmployees.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= backURL %>" value="Back"/>
</aui:button-row>