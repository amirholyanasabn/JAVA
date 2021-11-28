<%--
  Created by IntelliJ IDEA.
  User: Amirhossein
  Date: 11/22/2021
  Time: 7:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="../assets/css/main.css" rel="stylesheet">
    <link rel="stylesheet" href="../assets/bootstrap-3.3.7-dist/css/bootstrap.css">
    <script src="../assets/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
    <link href="../assets/css/main.css">
    <title>Register</title>
</head>
<body>
<div class="jumbotron" id="title-top">
    <h2 class="title-top-text" >Please registration</h2>
</div>
<nav class="navbar navbar-inverse" id="nav-top">
    <div class="container-fluid">
        <ul class="nav navbar-nav">
            <li class="active"><a href="/home.do">Home</a></li>
            <li><a href="/register.do">Register</a></li>
            <li><a href="/student-list.do">List</a></li>
            <li><a href="/student-find.do">Search</a></li>
        </ul>
    </div>
</nav>
<div class="container" id="form-div">
    <form action="/register-student.do"  method="post" class="form-group" id="input-form">
        <div style="border: 10px">
        <input type="text" class="form-control" placeholder="Name" name="name">
        </div>
        <br/>
        <div style="border: 10px">
        <input type="text" class="form-control" placeholder="Family" name="family">
        </div>
        <br/>
       <div style="border: 10px">
        <input type="text" class="form-control" placeholder="Major" name="major">
       </div>
        <br/>
        <input type="submit" class="btn btn-primary" value="Register">
    </form>
</div>
</body>
</html>
