<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 8/26/2021
  Time: 2:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
    <%
        String firstStr = request.getParameter("first-number");
        String secondStr = request.getParameter("second-number");
        int firstNum = Integer.parseInt(firstStr);
        int secondNum = Integer.parseInt(secondStr);
        String btnAdd = request.getParameter("add");
        String btnMin = request.getParameter("min");
        String btnMul = request.getParameter("mul");
        String btnDiv = request.getParameter("div");

        switch (request.getParameter("")){
            case "btnAdd" :
                int sum = firstNum+secondNum;
                out.print(sum);
                break;
            case "btnMin" :
                int min = firstNum-secondNum;
                out.print(min);
                break;
            case  "btnMul":
                int mul = firstNum*secondNum;
                out.print(mul);
                break;
            case "btnDiv" :
                int div = firstNum/secondNum;
                out.print(div);
                break;
            default:
                break;
        }
    %>
</body>
</html>
