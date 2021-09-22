<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.models.Person" %>
<%@ page import="com.example.util.Storage" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 8/26/2021
  Time: 11:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>save</title>
</head>
<body>
<h1>Your data is successfully saved</h1>

<%
    String name = request.getParameter("name");
    String family = request.getParameter("family");
    String ageStr = request.getParameter("age");



    if (name != null && family != null && ageStr != null && ageStr.matches("[0-9]+")){
        Person person = new Person(name,family,Integer.parseInt(ageStr));
        out.print(name+" "+family+ " "+ageStr);
        Storage.list.add(person);

    }else {
        request.getRequestDispatcher("/Dummy/error.jsp").forward(request,response);
    }

%>
<br>
<a href="/index.jsp">Home</a>
</body>
</html>
