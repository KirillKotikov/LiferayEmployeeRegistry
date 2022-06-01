<%@include file="/html/init.jsp" %>

<portlet:renderURL var="addEmployee">
    <portlet:param name="mvcPath" value="/html/employees/addEmployee.jsp"/>
</portlet:renderURL>

<aui:button onClick="<%= addEmployee %>" value="Add Employee"/>

<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%= EmployeeLocalServiceUtil.getByArchiveStatus(true)%>"/>

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

<aui:button-row cssClass="back">
    <portlet:renderURL var="Archive">
        <portlet:param name="mvcPath" value="/html/employees/archive.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= Archive %>" value="Archive"/>

    <portlet:renderURL var="backViewURL">
        <portlet:param name="mvcPath" value="/html/employees/main.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= backViewURL %>" value="Back"/>
</aui:button-row>