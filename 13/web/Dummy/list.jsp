<%@ page import="com.example.util.Storage" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 8/26/2021
  Time: 9:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
    <h1> List of Person</h1>
    <table style="border: 5px solid ">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Family</th>
            <th>Age</th>
            <th>Action</th>
        </tr>

            <%
                for (int i = 0; i < Storage.list.size(); i++) {

            %>

            <tr>
                <td><%= i+1 %></td>
                <td><%= Storage.list.get(i).getName() %></td>
                <td><%= Storage.list.get(i).getFamily() %></td>
                <td><%= Storage.list.get(i).getAge() %></td>
                <td><a href="delete.jsp?id=<%=i%>">Delete</a></td>
            </tr>


            <%
                }
            %>

    </table>
    <a href="/index.jsp">Back</a>
</body>
</html>
