<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: duonghxh
  Date: 02/10/2019
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h3>Home</h3>
<form:form action="login" method="post" modelAttribute="login">
    <fieldset>
        <legend>Login</legend>
        <table>
            <tr>
                <td><form:label path="account">Account</form:label></td>
                <td><form:input path="account"/></td>
            </tr>
            <tr>
                <td><form:label path="password">Password</form:label></td>
                <td><form:input path="password"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Login"></td>
            </tr>
        </table>
    </fieldset>
</form:form>
</body>
</html>
