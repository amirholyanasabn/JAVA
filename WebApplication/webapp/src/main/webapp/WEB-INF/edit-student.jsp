<%--
  Created by IntelliJ IDEA.
  User: Amirhossein
  Date: 11/26/2021
  Time: 10:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="../assets/main.css" rel="stylesheet">
    <link rel="stylesheet" href="../assets/bootstrap-3.3.7-dist/css/bootstrap.css">
    <script src="../assets/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
    <title>Edit</title>
</head>
<body>
<div class="jumbotron" id="title-top">
    <h2 class="title-top-text" >Edit information</h2>
</div>
<div class="container" id="form-div">
    <form action="/student-edit-save.do"  method="post" class="form-group" id="input-form">
        <div style="border: 10px" hidden>
            <input type="text" class="form-control" placeholder="id" name="id" value="${student.id}">
        </div>
        <div style="border: 10px">
            <input type="text" class="form-control" placeholder="Name" name="name" value="${student.name}">
        </div>
        <br/>
        <div style="border: 10px">
            <input type="text" class="form-control" placeholder="Family" name="family" value="${student.family}">
        </div>
        <br/>
        <div style="border: 10px">
            <input type="text" class="form-control" placeholder="Major" name="major" value="${student.major}">
        </div>
        <br/>
        <input type="submit" class="btn btn-success" value="Save">
    </form>
</div>
</body>
</html>
