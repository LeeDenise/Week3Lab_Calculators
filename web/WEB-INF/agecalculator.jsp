<%-- 
    Document   : agecalculator
    Created on : Sep 24, 2020, 3:12:29 PM
    Author     : 807785
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="arithmetic">
        Enter your age: <input type="text" name="age" value="${age}"><br>
        <input type="submit" value="Age Next Birthday"><br>
        </form>
        <p>${message}</p>
        <a href="./arithmetic">Arithmetic Calculator</a>
    </body>
</html>
