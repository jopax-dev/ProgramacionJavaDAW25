package EjerciciosRepasoT1yT2;

import java.util.Scanner;

public class Ejercicio13 {
    /*
        Escribe un programa que lea un número N e imprima una pirámide de números con N filas como en la
        siguiente figura:
               1
              121
             12321
            1234321
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un numero mayor de 0");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {

            for (int j = numero - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            if (numero > 1) {
                for (int j = i - 1; j > 0; j--) {
                    System.out.print(j);
                }
            }
            System.out.println("");
        }
    }
}
