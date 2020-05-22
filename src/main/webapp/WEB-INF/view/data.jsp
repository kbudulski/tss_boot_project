<%@include file="shared/navbar.jspf" %>
<%@include file="shared/header.jspf" %>

<h2>Authentication</h2>
<h4>Current user: <security:authentication property="principal.username"/></h4>
<h4>Role: <security:authentication property="principal.authorities"/></h4>

<a class="waves-effect waves-light btn deep-orange"
   onclick="window.location.href='rest/getCustomers'">Get Database REST</a>

<%@include file="shared/footer.jspf" %>
