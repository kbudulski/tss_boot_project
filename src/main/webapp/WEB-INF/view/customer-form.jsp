<%@include file="shared/navbar.jspf" %>
<%@include file="shared/header.jspf" %>

<div class="container d-flex justify-content-center" style="height: 90%">
    <div class="row align-self-center w-75">
        <div class="col-12">
            <form:form id="myForm" action="saveCustomer" modelAttribute="customer" method="post">
                <form:hidden path="id"/>
                <div class="row">
                    <div class="input-field col s6">
                        <form:input path="firstName" type="text" class="validate"/>
                        <label for="firstName">First Name</label>
                    </div>
                    <div class="input-field col s6">
                        <form:input path="lastName" type="text" class="validate"/>
                        <label for="lastName">Last Name</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col">
                        <form:input path="email" type="email" class="validate"/>
                        <label for="email">Email</label>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <button class="waves-effect waves-light btn deep-orange">save</button>
                    </div>
                </div>
            </form:form>
        </div>
    </div>
</div>

<%@include file="shared/footer.jspf" %>