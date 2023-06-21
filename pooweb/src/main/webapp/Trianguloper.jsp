<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/Style.css">
    <title>Triangulo</title>
</head>
<body>
    <div class="container">
        <div class="title">Triangulo</div>
        <div class="columns a">
            <form action="servlet" method="post">
                
                <label for="ladoA" class="word1">Ingrese el ladoA de su triangulo:  </label>
                <br>
                <input type="number" name="ladoA" id="ladoA" class="input" value="Numero" required>
                <br>
                <label for="ladoB" class="word1">Ingrese el ladoB de su triangulo:  </label>
                <br>
                <input type="number" name="ladoB" id="ladoB" class="input" value="Numero" required>
                <br>
                <label for="ladoA" class="word1">Ingrese el ladoC de su triangulo:  </label>
                <br>
                <input type="number" name="ladoC" id="ladoC" class="input" value="Numero" required>
                <br>
                <button type="submit" class="button" name="control1" value="trianguloper">Enviar</button>
                <br>
               <a href="index.jsp"> <button type="button" class="button">Regresar</button></a>
            </form>


        </div>
      


    </div>
</body>
</html>