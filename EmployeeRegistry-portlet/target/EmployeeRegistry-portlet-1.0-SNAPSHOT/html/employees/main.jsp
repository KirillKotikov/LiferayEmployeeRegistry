<%@include file="/html/init.jsp" %>

<aui:button-row cssClass="employeesMain">

    <portlet:renderURL var="showAllEmployees">
        <portlet:param name="mvcPath" value="/html/employees/allEmployees.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= showAllEmployees %>" value="Show all employees"/>

    <portlet:renderURL var="Archive">
        <portlet:param name="mvcPath" value="/html/employees/archive.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= Archive %>" value="Archive"/>

    <portlet:renderURL var="backViewURL">
        <portlet:param name="mvcPath" value="/view.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= backViewURL %>" value="Back"/>

</aui:button-row>
