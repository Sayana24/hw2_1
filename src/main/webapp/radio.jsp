<%--
  Created by IntelliJ IDEA.
  User: sayan
  Date: 26.02.2024
  Time: 0:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Three numbers</title>
</head>
<body>
    <h1>Enter three numbers</h1>
    <form action="<%=request.getContextPath()%>/RadioServlet" method="post">
        First number: <input type="text" name="firstNumber"><br><br>
        Second number: <input type="text" name="secondNumber"><br><br>
        Third number: <input type="text" name="thirdNumber"><br><br>

        <p><b>Max, min or average?</b></p>
        <p><input name="select" type="radio" value="max"> Maximum</p>
        <p><input name="select" type="radio" value="min"> Minimum</p>
        <p><input name="select" type="radio" value="average" checked> Average</p>
        <p><input type="submit" value="Select"></p>
    </form>

</body>
</html>
