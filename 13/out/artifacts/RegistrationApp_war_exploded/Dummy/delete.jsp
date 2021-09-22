<%@ page import="com.example.util.Storage" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 8/26/2021
  Time: 2:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        String id = request.getParameter("id");
        Storage.list.remove(Integer.parseInt(id));
//        request.getRequestDispatcher("list.jsp").forward(request,response);
        response.sendRedirect("list.jsp");
    %>
</body>
</html>
