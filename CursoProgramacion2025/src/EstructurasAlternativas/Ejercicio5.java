package EstructurasAlternativas;

import java.util.Scanner;

public class Ejercicio5 {
    /*
        Escribir un programa que lea un año indicar si es bisiesto. Nota: un año es bisiesto si es un
        número divisible por 4, pero no si es divisible por 100, excepto que también sea divisible por
        400
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un año: ");
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }
}
