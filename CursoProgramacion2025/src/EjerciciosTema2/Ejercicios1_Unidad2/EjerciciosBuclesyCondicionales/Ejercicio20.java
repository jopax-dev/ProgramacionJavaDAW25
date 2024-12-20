package EjerciciosTema2.Ejercicios1_Unidad2.EjerciciosBuclesyCondicionales;

import java.util.Scanner;

public class Ejercicio20 {
    /*
        Programa que, dado un número entero positivo introducido por teclado, visualice por pantalla todos los
        números primos menores que él. Utiliza la función del ejercicio anterior
     */

    public static String esPrimo(int numero){
        String primos = "";
        boolean primo = true;


        for (int i = 1; i < numero; i++) {
            primo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }

            }
            if(primo) primos += i + ", ";
        }
        return primos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Escribe un numero: ");
        numero = Integer.parseInt(sc.nextLine());
        System.out.printf("\nLos primos menores de %d son: %s", numero, esPrimo(numero));
    }
}
