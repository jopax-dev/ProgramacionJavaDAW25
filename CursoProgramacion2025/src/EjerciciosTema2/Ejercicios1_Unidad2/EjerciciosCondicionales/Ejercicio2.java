package EjerciciosTema2.Ejercicios1_Unidad2.EjerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio2 {
    /*
        Programa que lea un número por teclado e indique si es múltiplo de 2, 3, 5 o 7.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce un numero");
        num = sc.nextInt();

        sc.close();

        if(num % 2 == 0){
            System.out.println("Es multiplo de 2");
        }
        if(num % 3 == 0){
            System.out.println("Es multiplo de 3");
        }
        if(num % 5 == 0){
            System.out.println("Es multiplo de 5");
        }
        if(num % 7 == 0){
            System.out.println("Es multiplo de 7");
        }
    }
}
