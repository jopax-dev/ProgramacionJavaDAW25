package EjerciciosTema3.arrays;

import java.util.Scanner;

public class Ejercicio1 {
    /*
        Pide 5 numeros double por teclado
        Guardalos directamente en un array
        Pinta el array entero
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numeros[] = new double[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Escribe un numero");
            numeros[i] = Double.parseDouble(sc.nextLine());
        }

        System.out.println("Imprimiendo.....");

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Numero %f en la posicion %d", numeros[i], i);
            System.out.println();
        }
    }
}
