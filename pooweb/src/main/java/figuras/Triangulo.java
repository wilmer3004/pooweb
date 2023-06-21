package figuras;

    public class Triangulo extends Figura{
    private Double base;
    private Double altura;
    private Double ladoA;
    private Double ladoB;
    private Double ladoC;
    public Triangulo() {
    }
    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;

    }
    public Triangulo( Double ladoA,Double ladoB,Double ladoC) {
       
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    public Double getBase() {
        return base;
    }
    public void setBase(Double base) {
        this.base = base;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
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
    public Double getLadoC() {
        return ladoC;
    }
    public void setLadoC(Double ladoC) {
        this.ladoC = ladoC;
    }
    @Override
    public Double calcularArea(){
        Double area = 0.0;
        area = base*altura/2;
        return area;
    }
    public Double calcularPerimetro(){
        Double perimetro = 0.0;
        perimetro = ladoA+ladoB+ladoC;
        return perimetro;
    }

    
}
