<%--
  Created by IntelliJ IDEA.
  User: Amirhossein
  Date: 11/12/2021
  Time: 10:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>registration</title>
    <link rel="stylesheet" href="../bootstrap-4.6.1-dist/css/bootstrap.min.css">
    <script rel="script" src="../bootstrap-4.6.1-dist/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="../style/style.css">
</head>
<body>
<div class="container" >
    <div class="row jumbotron">
        <h1 id="top-text">
            Please enroll
        </h1>
    </div>
</div>
<div class="container">
    <div class="row">
        <form method="post" action="/enroll.do" >
            <div>
                <label for="name">Please enter your firstname</label>
                <input class="form-control form-control-lg" placeholder="Firstname" name="name" type="text" id="name">
            </div>
            <br>
            <div>
                <label for="family">Please enter your family</label>
                <input class="form-control form-control-lg" placeholder="Lastname" name="family" type="text" id="family">
            </div>
            <br>
            <div>
                <label for="major">Please enter your major</label>
                <input class="form-control form-control-lg" placeholder="Your Major" name="major" type="text" id="major">
            </div>
            <br>
            <div>
                <input type="submit" value="Enroll" class="btn-lg btn btn-success">
            </div>
        </form>
    </div>
</div>

</body>
</html>
