<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>

<h2> All Users </h2>
<br>

<table>

    <tr> <%--строка--%>
        <th> Id </th><%--столбец--%>
        <th> Role </th>
        <th> Telephone number </th>
        <th> Email </th>
    </tr>

    <c:forEach var="customer" items="${allUsersAttribute}">

        <tr>
            <td>${customer.id} </td> <%--ячейка--%>
            <td>${customer.role} </td>
            <td>${customer.telephoneNumber} </td>
            <td>${customer.email} </td>
        </tr>

    </c:forEach>

</table>
<br>
<input type="button" value="Add user"
onclick="window.location.href = 'add_new_user'"/>

</body>

</html>