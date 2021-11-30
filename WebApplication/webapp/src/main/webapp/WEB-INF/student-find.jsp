<%--
  Created by IntelliJ IDEA.
  User: Amirhossein
  Date: 11/28/2021
  Time: 2:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="../assets/css/main.css" rel="stylesheet">
    <link rel="stylesheet" href="../assets/bootstrap-3.3.7-dist/css/bootstrap.css">
    <script src="../assets/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <title>Student-find</title>
</head>
<body>
<div class="jumbotron" id="title-top">
    <h2 class="title-top-text" >Find Student</h2>
</div>
<nav class="navbar navbar-inverse" id="nav-top">
    <div class="container-fluid">
        <ul class="nav navbar-nav">
            <li class="active"><a href="/home.do">Home</a></li>
            <li><a href="/register.do">Register</a></li>
            <li><a href="/student-list.do">List</a></li>
        </ul>
    </div>
</nav>
<div class="container">
    <div class="row">
        <div class="col-lg-12">
            <div class="page-header">
                <h1>Searching</h1>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-md-6 col-md-offset-3">
                <h1>Expandable Search Form</h1>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4 col-md-offset-3">
                <form action="" class="search-form">
                    <div class="form-group has-feedback">
                        <form action="/student-find-by-ssn.do" method="post">
                        <label for="ssn" class="sr-only">Search</label>
                        <input type="text" class="form-control" name="search" id="ssn" placeholder="search by ssn">
                        <span class="glyphicon glyphicon-search form-control-feedback"></span>
                        </form>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-12">
            <table class="table" id="table">
                <thead>
                <tr>
                    <th>#</th>
                    <th>Name</th>
                    <th>Family</th>
                    <th>Major</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${list}" var="st" varStatus="loopStatus">
                    <tr>${loopStatus.index}</tr>
                    <tr>${st.name}</tr>
                    <tr>${st.family}</tr>
                    <tr>${st.major}</tr>
                </c:forEach>
                </tbody>
            </table>
            <hr>
        </div>
    </div>
</div>
<script src="../assets/js/searchBox.js" type="application/javascript"/>
</body>
</html>
