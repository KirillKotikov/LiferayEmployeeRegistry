<%@include file="/html/init.jsp" %>

<jsp:useBean id="currentEmployee" type="ru.kotikov.registry.model.Employee" scope="request"/>

<portlet:actionURL name="updateEmployee" var="updateEmployeeURL"/>
<aui:form action="<%= updateEmployeeURL %>" name="<portlet:namespace />fm">

    <aui:fieldset>
        <aui:input name="Employee id" value="<%= currentEmployee.getEmployeeId() %>" type="hidden"/>
        <aui:input name="Last name" value="<%= currentEmployee.getLastName() %>"/>
        <aui:input name="First name" value="<%= currentEmployee.getFirstName() %>"/>
        <aui:input name="Patronymic" value="<%= currentEmployee.getPatronymic() %>"/>
        <aui:input name="Sex" value="<%= currentEmployee.getSex() %>"/>
        <aui:input name="Date of birth" value="<%= currentEmployee.getDateOfBirth() %>"/>
        <aui:input name="Position id" value="<%= currentEmployee.getPositionId() %>"/>
        <aui:input name="Date of employment" value="<%= currentEmployee.getDateOfEmployment() %>"/>
        <aui:input name="Salary" value="<%= currentEmployee.getSalary() %>"/>
        <aui:input name="Work phone number" value="<%= currentEmployee.getWorkPhoneNumber() %>"/>
        <aui:input name="Mobile phone number" value="<%= currentEmployee.getMobilePhoneNumber() %>"/>
        <aui:input name="Bank id" value="<%= currentEmployee.getBankId() %>"/>
        <aui:input name="Archive status" value="<%= currentEmployee.getArchiveStatus() %>"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" value="Save"/>
        <portlet:renderURL var="backViewURL">
            <portlet:param name="mvcPath" value="/html/employees/allEmployees.jsp"/>
        </portlet:renderURL>
        <aui:button onClick="<%= backViewURL %>" value="Back"/>
    </aui:button-row>
</aui:form>