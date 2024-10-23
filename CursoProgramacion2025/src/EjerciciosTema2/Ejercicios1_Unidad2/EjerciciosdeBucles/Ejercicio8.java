package EjerciciosTema2.Ejercicios1_Unidad2.EjerciciosdeBucles;

import java.util.Scanner;

public class Ejercicio8 {
    /*
    Programa que imprima la tabla de multiplicar de cualquier número entre el 1 y el 10 introducido por teclado.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero del 1 al 10");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", num, i, num*i);
        }
    }
}
