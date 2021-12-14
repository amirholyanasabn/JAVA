<%--
  Created by IntelliJ IDEA.
  User: Amirhossein
  Date: 12/12/2021
  Time: 8:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
  <form method="post" action="/register-save.do">
    <label for="ssn" >SSN</label>
    <input type="text" name="ssn" id="ssn">
    <br/>
    <label for="name">NAME</label>
    <input type="text" name="name" id="name">
    <br>
    <label for="family">FAMILY</label>
    <input type="text" name="family" id="family">
    <br/>
    <label for="major">MAJOR</label>
    <input type="text" name="major" id="major">
    <br>
    <input type="submit" value="register">
  </form>
</body>
</html>
