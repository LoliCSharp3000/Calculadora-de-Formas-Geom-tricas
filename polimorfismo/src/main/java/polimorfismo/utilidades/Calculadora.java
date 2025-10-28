package polimorfismo.utilidades;

public class Calculadora {
    public static double area(double radio){
        return Math.PI * Math.pow(radio, 2);
    }
    public static double area(double base, double altura){
        return base * altura;
    }
    public static double area(double base, double altura, boolean triangulo){
        if (triangulo) {
            return (base * altura) / 2;
        }else return 0;
    }
}
