<%--
  Created by IntelliJ IDEA.
  User: sayan
  Date: 25.02.2024
  Time: 23:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Three numbers</title>
</head>
<body>
    <h1>Enter three numbers</h1>
    <form action="<%=request.getContextPath()%>/MaxServlet" method="post">
        First number: <input type="text" name="firstNumber"><br><br>
        Second number: <input type="text" name="secondNumber"><br><br>
        Third number: <input type="text" name="thirdNumber"><br><br>
        <input type="submit" value="Register">
    </form>


</body>
</html>
