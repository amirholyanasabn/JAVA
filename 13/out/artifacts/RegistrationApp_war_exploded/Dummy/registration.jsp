<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 8/26/2021
  Time: 9:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
    <form action="save.jsp" method="post">
        <label>name</label>
        <br>
        <input type="text" name="name" id="name">
        <br>
        <label>family</label>
        <br>
        <input type="text" name="family" id="family">
        <br>
        <label>age</label>
        <br>
        <input type="text" name="age" id="age">
        <br>
        <br>
        <input type="submit" value="send" onclick=" return isEmpty()">
    </form>
    <p id="error" style="color: red;font-weight: bold;display: none">Your field is empty !</p>
    <script src="/JavaScript/index.js"  rel="script"></script>


</body>
</html>
