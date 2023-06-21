package figuras;
// Indicamos con la palabra reservada extends que la clase circulo pertenece a la super clase Figura
public class Circulo extends Figura {
    // Declaramos los atributos e inicializamos pi
    private Double radio;
    private Double pi = 3.1416;
   
    // Creamos el método constructor sin parámetros
    public Circulo() {
    }
    // Creamos el método constructor con parámetros
    public Circulo( Double radio) {
        this.radio = radio;
    }
    public Double getPi() {
        return pi;
    }
    public void setPi(Double pi) {
        this.pi = pi;
    }
    public Double getRadio() {
        return radio;
    }
    public void setRadio(Double radio) {
        this.radio = radio;
    }
    public Double calcularArea() {
        // Declaramos variables
        Double area = 0.0;
        // Realizamos la operación para hallar el area del circulo 
        area = pi * Math.pow(radio, 2);
        return area;
    }
    public Double calcularPerimetro(){
        Double perimetro = 0.0;
        perimetro = 2*pi*radio;
        return perimetro;
    }
}
