package polimorfismo;

public class Rectangulo extends Figura{
    private double base;
    private double altura;
    private double A;
    private double P;
    public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public double  getAltura(){
        return altura;
    }
    @Override
    public double area(){
        A = base * altura;
        return A;
    }
    @Override
    public double perimetro(){
        P = 2*base + 2*altura;
        return P;
    }
}
