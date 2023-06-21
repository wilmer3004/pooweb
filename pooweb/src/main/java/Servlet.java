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
            case "eleccionrec":
                req.getRequestDispatcher("Eleccion_recta.jsp").forward(req,resp);
                break;   
            case "rectangulo":
                req.getRequestDispatcher("Rectangulo.jsp").forward(req,resp);
                break;
            case "rectanguloper":
                req.getRequestDispatcher("Rectanguloper.jsp").forward(req,resp);
                break;
            case "elecciontri":
                req.getRequestDispatcher("Eleccion_tri.jsp").forward(req,resp);
                break;
            case "triangulo":
                req.getRequestDispatcher("Triangulo.jsp").forward(req,resp);
                break;
            case "trianguloper":
                req.getRequestDispatcher("Trianguloper.jsp").forward(req,resp);
                break;
            case "elecciontra":
                req.getRequestDispatcher("Eleccion_tra.jsp").forward(req,resp);
                break;
            case "trapecio":
                req.getRequestDispatcher("Trapecio.jsp").forward(req,resp);
                break;
            case "trapecioper":
                req.getRequestDispatcher("Trapecioper.jsp").forward(req,resp);
                break;
            case "eleccioncir":
                req.getRequestDispatcher("Eleccion_cir.jsp").forward(req,resp);
                break;
            case "circulo":
                req.getRequestDispatcher("Circulo.jsp").forward(req,resp);
                break;
            case "circuloper":
                req.getRequestDispatcher("Circuloper.jsp").forward(req,resp);
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
                case "perimetrorec":
            double base3=Double.parseDouble(req.getParameter("base"));
            double altura3=Double.parseDouble(req.getParameter("altura"));
            Rectangulo rect2=new Rectangulo(base3,altura3);
            req.setAttribute("perimetro", rect2.calcularPerimetro());
            req.getRequestDispatcher("Perimetro.jsp").forward(req, resp);
            System.out.println("La base es "+base3+" la altura es "+altura3 );
            break;
            case "trianguloper":
            double ladoA1=Double.parseDouble(req.getParameter("ladoA"));
            double ladoB1=Double.parseDouble(req.getParameter("ladoB"));
            double ladoC1=Double.parseDouble(req.getParameter("ladoC"));
            Triangulo tri1=new Triangulo(ladoA1,ladoB1,ladoC1);
            req.setAttribute("perimetro", tri1.calcularPerimetro());
            req.getRequestDispatcher("Perimetro.jsp").forward(req, resp);
            System.out.println("El ladoA es "+ladoA1+"El ladoB es "+ladoB1+"El ladoC es "+ladoC1);
                break;
            case "trapecioper":
            double ladoA2=Double.parseDouble(req.getParameter("ladoA"));
            double ladoB2=Double.parseDouble(req.getParameter("ladoB"));
            double ladoC2=Double.parseDouble(req.getParameter("ladoC"));
            double ladoD2=Double.parseDouble(req.getParameter("ladoD"));
            Trapecio tra1=new Trapecio(ladoA2,ladoB2,ladoC2,ladoD2);
            req.setAttribute("perimetro", tra1.calcularPerimetro());
            req.getRequestDispatcher("Perimetro.jsp").forward(req, resp);
            System.out.println("El ladoA es "+ladoA2+"El ladoB es "+ladoB2+"El ladoC es "+ladoC2+"El ladoD es "+ladoD2);
                break;
            case "circuloper":
           double radio1=Double.parseDouble(req.getParameter("radio"));
            Circulo circ1=new Circulo(radio1);
            System.out.println(radio1);
            req.setAttribute("perimetro", circ1.calcularPerimetro());
            req.getRequestDispatcher("Perimetro.jsp").forward(req, resp);
            System.out.println("El radio es "+radio1);
                break;
        }
      
    }
    
    
}
