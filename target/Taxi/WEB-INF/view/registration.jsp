<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>

<h2> Dear User, please enter your data </h2>

<form:form action="save_user" modelAttribute="userAttribute">

    Telephone number <form:input path="telephoneNumber"/>
    <br><br>
    Email <form:input path="email"/>
    <br><br>
    Login <form:input path="login"/>
    <br><br>
    Password <form:input path="password"/>
    <br><br>
    Role <form:select path="role">
    <form:option value="Customer"/>
    <form:option value="Employee"/>
    <form:option value="Admin"/>
</form:select>
    <br><br>

    <input type="submit" value="OK">

</form:form>

</body>
</html>