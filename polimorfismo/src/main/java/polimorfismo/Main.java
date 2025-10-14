package polimorfismo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> figura = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int elec;
        boolean func = true;

        while(func){
            System.out.println("1. Agregar Circulo   2. Rectangulo   3. Triangulo   4. Salir   5.Mostrar");
            elec = sc.nextInt();
            switch (elec) {
                case 1:
                    System.out.println("Pon el radio");
                    Circulo circulo = new Circulo();
                    circulo.setRadio(sc.nextDouble());
                    figura.add(circulo);
                    break;
                case 2:
                    System.out.println("Pon la base");
                    Rectangulo rectangulo = new Rectangulo();
                    rectangulo.setBase(sc.nextDouble());
                    System.out.println("Pon altura");
                    rectangulo.setAltura(sc.nextDouble());
                    figura.add(rectangulo);
                    break;
                case 3:
                    System.out.println("Pon la base");
                    Triangulo triangulo = new Triangulo();
                    triangulo.setBase(sc.nextDouble());
                    System.out.println("Pon altura");
                    triangulo.setAltura(sc.nextDouble());
                    figura.add(triangulo);
                    break;
                case 4:
                    func = false;
                    break;
                case 5:
                    if(figura.isEmpty()) System.out.println("no hay figuras");
                    else{
                        for (Figura f : figura) {
                            System.out.println(f.getClass().getSimpleName() + " - Area: " + f.area() + "   Perimetro: " + f.perimetro());
                        }
                    }
                    
                    break;
                default:
                    System.out.println("Incorrecto");
            }
        }
    }
}