<%@include file="/html/init.jsp" %>

<portlet:renderURL var="addEmployeeURL">
    <portlet:param name="mvcPath" value="/html/employees/allEmployees.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="addEmployee" var="addEmployeeURL"/>

<aui:form action="<%= addEmployeeURL %>" name="<portlet:namespace />fm">
    <aui:fieldset>
        <aui:input name="Last name"/>
        <aui:input name="First name"/>
        <aui:input name="Patronymic"/>
        <aui:input name="Sex"/>
        <aui:input name="Date of birth"/>
        <aui:input name="Position id"/>
        <aui:input name="Date of employment"/>
        <aui:input name="Salary"/>
        <aui:input name="Work phone number"/>
        <aui:input name="Mobile phone number"/>
        <aui:input name="Bank id"/>
        <aui:input name="Archive status"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"/>
        <portlet:renderURL var="backViewURL">
            <portlet:param name="mvcPath" value="/html/employees/allEmployees.jsp"/>
        </portlet:renderURL>
        <aui:button type="cancel" onClick="<%= backViewURL %>"/>

    </aui:button-row>
</aui:form>