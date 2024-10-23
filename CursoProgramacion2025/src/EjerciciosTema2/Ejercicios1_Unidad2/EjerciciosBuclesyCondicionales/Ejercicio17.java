package EjerciciosTema2.Ejercicios1_Unidad2.EjerciciosBuclesyCondicionales;

import java.util.Scanner;

public class Ejercicio17 {
    /*
        Programa que lea un entero positivo introducido por el usuario y que muestre por pantalla todos sus
        divisores.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt();

        for (int i = numero; i >= 1; i--) {
            if(numero % i == 0){
                System.out.printf("%d es divisor de %d\n", i, numero);
            }
        }
    }
}
