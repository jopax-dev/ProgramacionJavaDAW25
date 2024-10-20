package EjerciciosRepasoT1yT2;

import java.util.Scanner;

public class Ejercicio01 {
    /*
        Realiza un programa que vaya pidiendo números enteros mientras no introduzcas el -1. Como resultado
        debe devolver la cantidad de números introducidos y la suma de esos números.
     */
    public static void main(String[] args) {
        int num, total = 0, count = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce un numero:");
            num = sc.nextInt();

            total += num;
            count++;

        } while (num != -1);

        System.out.printf("Has introducido un total de %d numeros que suman %d", count, total);
    }
}
