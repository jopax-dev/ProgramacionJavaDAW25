package EjerciciosTema3.arrays;

import java.util.Scanner;

public class Ejercicio2 {
    /*
        - Genera de forma aleatoria un array de doubles con 30 elementos
        - Los valores estaran entre -100 y 100
        - Pinta los valores
        - Pinta los valores al reves
        - Escribe la media
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double arr[] = new double[30];
        double total = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 201 - 100;
            total+= arr[i];
        }

        System.out.println("Del derecho");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Pos %d -> %.3f\n", i, arr[i]);
        }

        System.out.println("Del reves");
        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.printf("Pos: %d -> %.3f\n",i, arr[i]);
        }

        System.out.println("Media:");
        System.out.printf("Total: %.4f // Numeros: %d // Media: %.4f", total, arr.length, total/ arr.length);
    }
}
