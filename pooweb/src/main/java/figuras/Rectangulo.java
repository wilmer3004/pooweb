package figuras;

public class Rectangulo extends Figura{
    private Double base;
    private Double altura;

    public Rectangulo() {
    }

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
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

    @Override
    public Double calcularArea(){
        Double area = 0.0;
        area = base*altura;
        return area;
    }
     public Double calcularPerimetro(){
        Double perimetro = 0.0;
        perimetro=base*2+altura*2;
        return perimetro;
    }

    
}
