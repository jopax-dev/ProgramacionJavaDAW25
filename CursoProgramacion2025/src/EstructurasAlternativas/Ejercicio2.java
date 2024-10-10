package EstructurasAlternativas;

import java.util.Scanner;

public class Ejercicio2 {
    // Escribe un programa que lea un número e indique si es par o impar.
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}
