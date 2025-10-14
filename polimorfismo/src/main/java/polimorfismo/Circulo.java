package polimorfismo;

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
    @Override
    public double area(){
        A = Math.PI * Math.pow(radio, 2);
        return A;
    }
    @Override
    public double perimetro(){
        P = 2 * Math.PI * radio;
        return P;
    }
}
