<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 8/26/2021
  Time: 2:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Home</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
    <link href="Style/main.css" rel="stylesheet">
  </head>
  <body>
  <div class="container">
  <form action="/Dummy/result.jsp" method="post" >
    <input type="text" id="first-number" name="first-number" class="form-control col-md-6" placeholder="FirstN Number">
    <br>
    <input type="text" id="second-number" name="second-number" class="form-control col-md-6" placeholder="Second Number">
    <br>
    <input type="submit" value="+" name="add" class="btn btn-success col-md-2 btn-cal" onclick="return isValid()">
    <input type="submit" value="-" name="min" class="btn btn-secondary col-md-2 btn-cal">
    <input type="submit" value="*" name="mul" class="btn btn-primary col-md-2 btn-cal">
    <input type="submit" value="/" name="div" class="btn btn-info col-md-2 btn-cal">
  </form>
  </div>

  <div class="col-md-6 alert alert-danger" id="div-error">
    <p id="error" >Your field is empty !</p>
  </div>
  <!-- JavaScript Bundle with Popper -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>
  <script src="Style/main.css" rel="script"></script>
  </body>
</html>
