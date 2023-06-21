<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/Style.css">
    <title>Index</title>
</head>
<body>
    
    <div class="container">
        <div class="title">Vamos a calcular el area o el perimetro de las distintas figuras de esta sección</div>
        <div class="row">
            <div class="img1 columns a">
                <div class="word1">Rectángulo</div>
                <img src="img/rectangulo.png" alt="Rectángulo" class="img">
                <a href="servlet?accion=eleccionrec"><button type="button" class="button">Rectangulo</button></a>
            </div>
            <div class="img1 columns a">
                <div class="word1">Circulo</div>
                <img src="img/circulo.png" alt="Circulo" class="img">
                <a href="servlet?accion=eleccioncir"><button type="button" class="button">Circulo</button></a>
            </div>
            <div class="img1 triangulo columns a">
                <div class="word1">Triangulo</div>
                <img src="img/triangulo.png" alt="Triangulo" class="img">
                <a href="servlet?accion=elecciontri"><button type="button" class="button">Triangulo</button></a>
            </div>
            


        </div>
        <br>
        <div class="row">

            <div class="img1 columns a">
                <div class="word1">Trapecio</div>
                <img src="img/trapecio.png" alt="Trapecio" class="img">
                <a href="servlet?accion=elecciontra"><button type="button" class="button">Trapecio</button></a>
            </div>
        </div>

<!-- 
        <h1>Prueba incluir expresiones</h1>
        <p><%=new String("Hola mundo").toUpperCase()%></p>
        <h1>Prueba Scriptlets</h1>
        <p>
            <% 
            for(int i=0;i<4;i++){
                out.println("<br>Iteracion"  + i);
            }
            %>
        </p>
        <%!
        private int res;
        public int sumar(int n1, int n2){
        res = n1+n2;
        return res;}
        %>

        <p>El resultado de la suma es: <%= sumar(15,25)%></p> -->
        
    </div>
</body>
</html>