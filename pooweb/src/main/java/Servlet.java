import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import figuras.Circulo;
import figuras.Rectangulo;
import figuras.Trapecio;
import figuras.Triangulo;

public class Servlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entro al Servlet");
        String accion=req.getParameter("accion");
        System.out.println(accion);
        switch (accion) {
            case "rectangulo":
                req.getRequestDispatcher("Rectangulo.jsp").forward(req,resp);
                break;
            case "triangulo":
                req.getRequestDispatcher("Triangulo.jsp").forward(req,resp);
                break;
            case "trapecio":
                req.getRequestDispatcher("Trapecio.jsp").forward(req,resp);
                break;
            case "circulo":
                req.getRequestDispatcher("Circulo.jsp").forward(req,resp);
                break;
            default:
            System.out.println("No se trajo un valor valido");
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String control1=req.getParameter("control1");
        System.out.println(control1);
        switch(control1){
            case "arearectangulo":
            double base=Double.parseDouble(req.getParameter("base"));
            double altura=Double.parseDouble(req.getParameter("altura"));
            Rectangulo rect=new Rectangulo(base,altura);
            req.setAttribute("area", rect.calcularArea());
            req.getRequestDispatcher("Area.jsp").forward(req, resp);
            System.out.println("La base es "+base+" la altura es "+altura+" y el área es ");
                break;
            case "areatriangulo":
            double baset=Double.parseDouble(req.getParameter("base"));
            double alturat=Double.parseDouble(req.getParameter("altura"));
            Triangulo tri=new Triangulo(baset,alturat);
            req.setAttribute("area", tri.calcularArea());
            req.getRequestDispatcher("Area.jsp").forward(req, resp);
            System.out.println("La base es "+baset+" la altura es "+alturat);
                break;
            case "areatrapecio":
            double ladoA=Double.parseDouble(req.getParameter("ladoA"));
            double ladoB=Double.parseDouble(req.getParameter("ladoB"));
            double alturatra=Double.parseDouble(req.getParameter("altura"));
            Trapecio tra=new Trapecio(ladoA,ladoB,alturatra);
            req.setAttribute("area", tra.calcularArea());
            req.getRequestDispatcher("Area.jsp").forward(req, resp);
            System.out.println("El ladoA es "+ladoA+" el ladoB es "+ladoB+" la altura es "+alturatra);
                break;

            case "areaciculo":
           double radio=Double.parseDouble(req.getParameter("radio"));
            Circulo circ=new Circulo(radio);
            System.out.println(radio);
            req.setAttribute("area", circ.calcularArea());
            req.getRequestDispatcher("Area.jsp").forward(req, resp);
            System.out.println("El radio es "+radio);
                break;

        }
    }
    
}
