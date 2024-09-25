package Introduccion;

import java.util.Scanner;

public class EjercicioSuma {

    // Crea un programa que pida 2 numeros por teclado y devuelva la suma de ambos

    public static void main(String[] args) {
        double numero1, numero2, suma;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el primer numero: ");
        numero1 = sc.nextDouble();

        System.out.println("Escribe el segundo numero: ");
        numero2 = sc.nextDouble();

        suma = numero1 + numero2;
        System.out.printf("La suma de %f y %f es %f", numero1, numero2, suma);

        sc.close();
    }
}
