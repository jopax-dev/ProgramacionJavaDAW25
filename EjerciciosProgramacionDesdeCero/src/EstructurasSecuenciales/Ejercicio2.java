package EstructurasSecuenciales;

import java.util.Scanner;

public class Ejercicio2 {

    // Calcular el perímetro y área de un rectángulo dada su base y su altura.

    public static void main(String[] args) {

        double base;
        double altura;
        double perimetroRectangulo;
        double areaRectangulo;

        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es la base de tu rectangulo? : ");
        base = sc.nextDouble();
        System.out.println("Y la altura? : ");
        altura = sc.nextDouble();

        perimetroRectangulo = 2 * base + 2 * altura;
        System.out.println("El perimetro es : " + perimetroRectangulo);

        areaRectangulo = base * altura;
        System.out.println("El area de tu rectangulo es : " + areaRectangulo);
    }
}
