<%@include file="/html/init.jsp" %>

<jsp:useBean id="currentEmployee" type="ru.kotikov.registry.model.Employee" scope="request"/>

<portlet:actionURL name="updateEmployee" var="updateEmployeeURL"/>
<aui:form action="<%= updateEmployeeURL %>" name="<portlet:namespace />fm">

    <aui:fieldset>
        <aui:input name="Employee id" value="<%= currentEmployee.getEmployee_id() %>" type="hidden"/>
        <aui:input name="Last name" value="<%= currentEmployee.getLast_name() %>"/>
        <aui:input name="First name" value="<%= currentEmployee.getFirst_name() %>"/>
        <aui:input name="Patronymic" value="<%= currentEmployee.getPatronymic() %>"/>
        <aui:input name="Sex" value="<%= currentEmployee.getSex() %>"/>
        <aui:input name="Date of birth" value="<%= currentEmployee.getDate_of_birth() %>"/>
        <aui:input name="Position id" value="<%= currentEmployee.getPosition_id() %>"/>
        <aui:input name="Date of employment" value="<%= currentEmployee.getDate_of_employment() %>"/>
        <aui:input name="Salary" value="<%= currentEmployee.getSalary() %>"/>
        <aui:input name="Work phone number" value="<%= currentEmployee.getWork_phone_number() %>"/>
        <aui:input name="Mobile phone number" value="<%= currentEmployee.getMobile_phone_number() %>"/>
        <aui:input name="Bank id" value="<%= currentEmployee.getBank_id() %>"/>
        <aui:input name="Archive status" value="<%= currentEmployee.getArchive_status() %>"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" value="Save"/>
        <portlet:renderURL var="backViewURL">
            <portlet:param name="mvcPath" value="/html/employees/allEmployees.jsp"/>
        </portlet:renderURL>
        <aui:button onClick="<%= backViewURL %>" value="Cancel"/>
    </aui:button-row>
</aui:form>