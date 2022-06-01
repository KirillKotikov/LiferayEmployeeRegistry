<%@include file="/html/init.jsp" %>

<portlet:renderURL var="addBankURL">
    <portlet:param name="mvcPath" value="/html/employees/allBanks.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="addBank" var="addBank"/>

<aui:form action="<%= addBank %>" name="<portlet:namespace />fm">
    <aui:fieldset>
        <aui:input name="Bank name"/>
        <aui:input name="BIK"/>
        <aui:input name="Bank address"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"/>
        <portlet:renderURL var="allBanksURL">
            <portlet:param name="mvcPath" value="/html/banks/allBanks.jsp"/>
        </portlet:renderURL>
        <aui:button type="cancel" onClick="<%= allBanksURL %>"/>

    </aui:button-row>
</aui:form>