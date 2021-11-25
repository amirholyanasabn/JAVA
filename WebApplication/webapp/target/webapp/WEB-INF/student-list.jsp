<%@ page import="java.util.List" %>
<%@ page import="entities.Student" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="entities.Student" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--

  Created by IntelliJ IDEA.
  User: Amirhossein
  Date: 11/25/2021
  Time: 10:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="../assets/main.css" rel="stylesheet">
    <link rel="stylesheet" href="../assets/bootstrap-3.3.7-dist/css/bootstrap.css">
    <script src="../assets/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
    <title>List</title>
</head>
<body>
<%--<%List<Student> list = (List<Student>) request.getAttribute("list"); %>--%>
<div class="jumbotron" id="title-top">
    <h2 class="title-top-text" >List of students</h2>
</div>
<nav class="navbar navbar-inverse" id="nav-top">
    <div class="container-fluid">
        <ul class="nav navbar-nav">
            <li class="active"><a href="/home.do">Home</a></li>
            <li><a href="/register.do">Register</a></li>
        </ul>
    </div>
</nav>
<table class="table table-striped table-dark">

    <tr>
        <th scope="col">#</th>
        <th scope="col">Name</th>
        <th scope="col">Family</th>
        <th scope="col">Major</th>
        <th scope="col">Action</th>
    </tr>

    <c:forEach  items="${list}" var="st">
    <tr>
        <td >${st.id}</td>
        <td>${st.name}</td>
        <td>${st.family}</td>
        <td>${st.major}</td>
        <td>
            <a href="#" class="btn btn-sm btn-danger">Delete</a>
            <a href="#" class="btn btn-sm btn-success">Edit</a>
        </td>
    </tr>

    </c:forEach>
</table>


<%--<table class="table table-dark" style="margin:10px 10px 10px 10px ;">--%>
<%--    <thead>--%>
<%--    <tr>--%>
<%--        <th scope="col">Id</th>--%>
<%--        <th scope="col">Name</th>--%>
<%--        <th scope="col">Family</th>--%>
<%--        <th scope="col">Major</th>--%>
<%--        <th scope="col">Action</th>--%>
<%--    </tr>--%>
<%--    </thead>--%>
<%--    <tbody>--%>
<%--    <% for (int i = 0; i <list.size() ; i++) { %>--%>


<%--    <tr>--%>
<%--        <th scope="row"><%=list.get(i).getId() %></th>--%>
<%--        <td><%=list.get(i).getName()%></td>--%>
<%--        <td><%=list.get(i).getFamily()%></td>--%>
<%--        <td><%=list.get(i).getMajor()%></td>--%>
<%--        <td><a class="btn btn-sm btn-danger" href="#">Delete</a>  <a href="#" class="btn btn-sm btn-success">Edit</a></td>--%>
<%--    </tr>--%>
<%--    <% }%>--%>
<%--    </tbody>--%>
<%--</table>--%>
</body>
</html>
