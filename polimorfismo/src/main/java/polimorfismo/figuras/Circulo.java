package polimorfismo.figuras;

public class Circulo extends Figura{
    private double radio;
    private double A;
    private double P;

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
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
        P = 2 * Math.PI * radio;
        return P;
    }
}
