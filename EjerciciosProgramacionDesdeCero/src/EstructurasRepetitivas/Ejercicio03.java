package EstructurasRepetitivas;

import java.util.Scanner;

public class Ejercicio03 {
    /*
        Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso
        contrario, el programa termina cuando se introduce un espacio.
     */
    public static void main(String[] args) {
        char caracter;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Escribe un caracter");
            caracter = sc.nextLine().toLowerCase().charAt(0);

            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                System.out.println("VOCAL");
            } else if (caracter == ' ') {
                break;
            } else {
                System.out.println("NO VOCAL");
            }
        }
        System.out.println("FIN");
    }
}
