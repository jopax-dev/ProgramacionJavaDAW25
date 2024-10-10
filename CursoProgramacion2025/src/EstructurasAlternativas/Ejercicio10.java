package EstructurasAlternativas;

import java.util.Scanner;

public class Ejercicio10 {
    /*
        Escribe un programa que resuelva una ecuación de segundo grado del tipo AX2 + BX + C
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos a resolver una ecuacion de segundo grado usando ax² + bx + c");
        System.out.println("Para ello, indica el valor de a: ");

        double a = sc.nextDouble();
        System.out.println("Ahora indica el valor de b: ");

        double b = sc.nextDouble();
        System.out.println("Y por ultimo, el valor de c: ");

        double c = sc.nextDouble();

        double discriminante = Math.pow(b, 2) - 4 * a * c;
        double operacion = (-1 * b + Math.sqrt(discriminante));

        if (a != 0) {
            if (discriminante > 0) {
                double x = (operacion / (2 * a));
                System.out.println("El 1er valor de x es: " + x);
                x = ((-1 * b - Math.sqrt(discriminante)) / (2 * a));
                System.out.println("El 2º valor de x es: " + x);

            } else if (discriminante == 0) {
                double x = (operacion / 2 * a);
                System.out.println("X solo tiene un valor y es: " + x);

            } else {
                System.out.println("La solucion no tiene numeros reales");
            }
        } else {
            System.out.println("Error: division por 0, a tiene que ser distinto de 0");
        }
    }
}
