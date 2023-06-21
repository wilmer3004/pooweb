<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/Style.css">
    <title>Area</title>
</head>
<body>
    <div class="container">
        <div class="title">Area</div>
        <div class="columns a">
            <div class="word1">El area de la figura es: </div>
            <div class="word1"><%=request.getAttribute("area")%></div>
            <a href="index.jsp"> <button type="button" class="button">Regresar</button></a>
        </div>
        </div>
        <div class="container">


</body>
</html>