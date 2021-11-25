<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Home Page</title>
    <link href="../assets/main.css" rel="stylesheet">
    <link rel="stylesheet" href="../assets/bootstrap-3.3.7-dist/css/bootstrap.css">
    <script src="../assets/bootstrap-3.3.7-dist/js/bootstrap.js"></script>

</head>
<body>
<div class="jumbotron" id="title-top">
<h2 class="title-top-text" >Welcome to Gucci page</h2>
</div>
<nav class="navbar navbar-inverse" id="nav-top">
    <div class="container-fluid">
        <ul class="nav navbar-nav">
<%--            <li class="active"><a href="#">Home</a></li>--%>
            <li><a href="/register.do">Register</a></li>
            <li><a href="/student-list.do">List</a></li>
        </ul>
    </div>
</nav>
<h1 style="margin: 10px">Ich bin Gucci</h1>
<p style="margin: 10px">Hallo,mein Name ist Gucci und bin 6 Jahre alt...</p>
<div class="div-transition"></div>
<footer class="page-footer font-small" style="background-color: #0f0f0f;padding: 50px 0; border-radius: 5px;margin-bottom: 0;margin-top: 15%">
    <div class="footer-copyright text-center py-3" style="color: white">Gucci Firma</div>
</footer>

</body>
</html>
