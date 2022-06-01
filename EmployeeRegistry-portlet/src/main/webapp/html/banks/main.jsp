<%@include file="/html/init.jsp" %>

<aui:button-row cssClass="banksMain">
    <portlet:renderURL var="showAllBanks">
        <portlet:param name="mvcPath" value="/html/banks/allBanks.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= showAllBanks %>" value="Show all banks"/>

    <portlet:renderURL var="backViewURL">
        <portlet:param name="mvcPath" value="/view.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= backViewURL %>" value="Back"/>
</aui:button-row>


