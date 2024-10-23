package EjerciciosTema2.Ejercicios1_Unidad2.EjerciciosdeBucles;

import java.util.Scanner;

public class Ejercicio10 {
    /*
        Programa (utilizando bucles) que muestre por pantalla la siguiente figura. Debe funcionar para n =
        número de líneas, que se pida por teclado.
            *
            **
            ***
            ****
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("De cuantas filas quieres la figura?");
        int filas = sc.nextInt();

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
