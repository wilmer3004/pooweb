package figuras;

// Indicamos con la palabra reservada extends que la clase Trapecio pertenece a la super clase Figura

public class Trapecio extends Figura {
    // Declaramos los atributos
    private Double ladoA;
    private Double ladoB;
    private Double altura;
    public Trapecio() {
    }
    public Trapecio(Double ladoA, Double ladoB, Double altura) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.altura = altura;
    }
    public Double getLadoA() {
        return ladoA;
    }
    public void setLadoA(Double ladoA) {
        this.ladoA = ladoA;
    }
    public Double getLadoB() {
        return ladoB;
    }
    public void setLadoB(Double ladoB) {
        this.ladoB = ladoB;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    @Override
    public Double calcularArea() {
         // Declaramos las variables
        Double area = 0.0;
        // Calculamos el area
        area = ((ladoA+ladoB)*altura)/2;
        return area;
    }
    
}
