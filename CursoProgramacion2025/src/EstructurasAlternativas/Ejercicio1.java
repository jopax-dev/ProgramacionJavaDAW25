package EstructurasAlternativas;

import java.util.Scanner;

public class Ejercicio1 {
    /*
        Algoritmo que pida dos números e indique si el primero es mayor que el segundo o no.
     */
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Escribe el segundo numero: ");
        num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("El primer numero es mayor que el segundo");
        } else if (num1 < num2) {
            System.out.println("El segundo numero es mas grande que el primero");
        } else {
            System.out.println("Los numeros son iguales");
        }
    }
}
