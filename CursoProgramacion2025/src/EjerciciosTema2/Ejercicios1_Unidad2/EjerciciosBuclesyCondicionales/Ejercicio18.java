package EjerciciosTema2.Ejercicios1_Unidad2.EjerciciosBuclesyCondicionales;

import java.util.Scanner;

public class Ejercicio18 {
    /*
        Diseña un metodo que indique si un número entero pasado como parámetro es o no un número primo
        (devuelve un boolean). Un número primo es aquel que tiene por divisores el 1 y el propio número,
        únicamente.
     */

    public static boolean esPrimo(double numero){
        boolean primo = true;

        for (double i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo = false;
                break;
            }
        }
        return primo;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero;

        System.out.println("Ingrese un numero: ");
        numero = Double.parseDouble(sc.nextLine());

        if(esPrimo(numero)){
            System.out.printf("\n%.0f es primo",numero);
        } else {
            System.out.printf("\n%.0f no es primo",numero);
        }
    }

}
