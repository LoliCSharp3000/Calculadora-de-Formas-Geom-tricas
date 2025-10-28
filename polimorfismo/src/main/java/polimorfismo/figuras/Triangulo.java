package polimorfismo.figuras;

public class Triangulo extends Figura{
    private double base;
    private double altura;
    private double A;
    private double P;
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public double getBase(){
        return base;
    }
    public void setA(double a) {
        A = a;
    }
    @Override
    public double getA() {
        return A;
    }
    @Override
    public double perimetro(){
        P = base + altura + Math.sqrt(base*base + altura*altura);
        return P;
    }
}
