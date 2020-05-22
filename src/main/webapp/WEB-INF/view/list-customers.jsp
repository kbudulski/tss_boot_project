<%@include file="shared/navbar.jspf" %>
<%@include file="shared/header.jspf" %>
<div class="container d-flex justify-content-center" style="height: 90%">
    <div class="row align-self-center w-100">
        <div class="col">

            <a class="waves-effect waves-light btn deep-orange"
               onclick="window.location.href='addCustomerForm'; return false"><i
                    class="material-icons left">person_add</i>Add customer</a>

            <table class="striped highlight centered responsive-table w-100">
                <tr class="orange text-center">
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>Option</th>
                </tr>
                <c:forEach var="customer" items="${customers}">

                    <c:url var="updateLink" value="/customer/showUpdateForm">
                        <c:param name="customerId" value="${customer.id}"/>
                    </c:url>
                    <c:url var="deleteLink" value="/customer/delete">
                        <c:param name="customerId" value="${customer.id}"/>
                    </c:url>

                    <tr>
                        <td>${customer.firstName}</td>
                        <td>${customer.lastName}</td>
                        <td>${customer.email}</td>
                        <td>
                            <a href="${updateLink}">Update</a>
                            |
                            <a href="${deleteLink}" onclick="if (!(confirm('Are you sure?'))) return false">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</div>
<%@include file="shared/footer.jspf" %>