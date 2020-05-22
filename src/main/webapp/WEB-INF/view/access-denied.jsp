<%@include file="shared/navbar.jspf" %>
<%@include file="shared/header.jspf" %>

<div class="d-flex justify-content-center align-items-center text-center" style="background: #7986cb">
    <div style="padding: 100px 0">
        <h2>Access denied. You are not authorized to view this page. Please contact the
            administrator.</h2><br>
        <h4>Role: <security:authentication property="principal.authorities"/></h4><br>
        <a class="waves-effect waves-light btn deep-orange" onclick="window.location.href='welcome-page'">Go back to
            main page.</a>
    </div>
</div>

<%@include file="shared/footer.jspf" %>