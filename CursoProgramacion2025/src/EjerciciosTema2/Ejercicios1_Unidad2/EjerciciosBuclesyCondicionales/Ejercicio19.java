package EjerciciosTema2.Ejercicios1_Unidad2.EjerciciosBuclesyCondicionales;

import java.util.Scanner;

public class Ejercicio19 {
    /*
        Diseña un metodo que indique si un número entero pasado como parámetro es o no un número primo
        (devuelve un boolean). Un número primo es aquel que tiene por divisores el 1 y el propio número,
        únicamente.
     */

    public static boolean esPrimo(int numero){

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un numero: ");
        numero = Integer.parseInt(sc.nextLine());

        if(esPrimo(numero)){
            System.out.printf("\n%d es primo",numero);
        } else {
            System.out.printf("\n%d no es primo",numero);
        }
    }

}
