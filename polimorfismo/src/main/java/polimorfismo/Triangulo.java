package polimorfismo;

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
    @Override
    public double area(){
        A = (base * altura) / 2;
        return A;
    }
    @Override
    public double perimetro(){
        P = base + altura + Math.sqrt(base*base + altura*altura);
        return P;
    }
}
