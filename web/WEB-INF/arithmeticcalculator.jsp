<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 24, 2020, 10:11:09 PM
    Author     : 807785
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
        First: <input type="text" name="firstNum" value="${firstNum}"><br>
        Second: <input type="text" name="secondNum" value="${secondNum}"><br>
        <input type="submit" name="calButton" value="+">
        <input type="submit" name="calButton" value="-">
        <input type="submit" name="calButton" value="*">
        <input type="submit" name="calButton" value="%">
        </form>
        <p>Result: ${message}</p>
        <a href="./age">Age Calculator</a>
    </body>
</html>
