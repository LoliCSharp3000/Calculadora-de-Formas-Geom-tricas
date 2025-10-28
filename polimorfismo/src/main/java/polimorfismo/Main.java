package polimorfismo;

import java.util.ArrayList;
import java.util.Scanner;
import polimorfismo.figuras.*;
import polimorfismo.utilidades.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> figura = new ArrayList<>();   
        Scanner sc = new Scanner(System.in);

        int elec;
        final int algo = 3;
        double base;
        double altura;
        boolean func = true;

        while(func){
            System.out.println("1. Agregar Circulo   2. Rectangulo   3. Triangulo   4. Salir   5.Mostrar");
            elec = sc.nextInt();
            switch (elec) {
                case 1:
                    System.out.println("Pon el radio");
                    Circulo circulo = new Circulo();
                    double radio = sc.nextDouble();
                    circulo.setRadio(radio);
                    circulo.setA(Calculadora.area(radio));
                    figura.add(circulo);
                    break;
                case 2:
                    System.out.println("Pon la base");
                    base = sc.nextDouble();
                    Rectangulo rectangulo = new Rectangulo();
                    rectangulo.setBase(base);
                    System.out.println("Pon altura");
                    altura = sc.nextDouble();
                    rectangulo.setAltura(altura);
                    rectangulo.setA(Calculadora.area(base, altura));
                    figura.add(rectangulo);
                    break;
                case 3:
                    System.out.println("Pon la base");
                    Triangulo triangulo = new Triangulo();
                    base = sc.nextDouble();
                    triangulo.setBase(base);
                    System.out.println("Pon altura");
                    altura = sc.nextDouble();
                    triangulo.setAltura(altura);
                    triangulo.setA(Calculadora.area(base, altura, func));
                    figura.add(triangulo);
                    break;
                case 4:
                    func = false;
                    break;
                case 5:
                    if(figura.isEmpty()) System.out.println("no hay figuras");
                    else{
                        for (Figura f : figura) {
                            System.out.println(f.getClass().getSimpleName() + " - Area: " + f.getA() + "   Perimetro: " + f.perimetro());
                        }
                    }
                    
                    break;
                default:
                    System.out.println("Incorrecto" + algo);
                    break;

            }
        }
        sc.close();
    }
}