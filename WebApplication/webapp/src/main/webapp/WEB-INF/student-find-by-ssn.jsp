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
  <link href="../assets/css/main.css" rel="stylesheet">
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
      <li><a href="/student-find.do">Search</a></li>
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
  <%--    <% int i = 1;%>--%>
  <c:forEach  items="${list}" var="st" varStatus="loopStatus">
    <tr>
        <%--        <td ><%=i++%></td>--%>
      <td>${loopStatus.index+1}</td>
      <td>${st.name}</td>
      <td>${st.family}</td>
      <td>${st.major}</td>
      <td>
        <a href="/student-delete.do?id=${st.id}" class="btn btn-sm btn-danger" onclick= "return confirmToDelete()">Delete</a>
        <a href="/student-edit.do?id=${st.id}" class="btn btn-sm btn-success" onclick="return confirmToEdit()">Edit</a>
      </td>
    </tr>

  </c:forEach>

</table>
<script src="../assets/js/modal.js" type="application/ecmascript"></script>

</body>
</html>
