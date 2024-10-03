package EstructurasSecuenciales;

import java.util.Scanner;

public class Ejercicio11 {

//    Dado un número de dos cifras, diseñe un algoritmo que permita obtener el número
//    invertido. Ejemplo, si se introduce 23 que muestre 32.

    public static void main(String[] args) {
        int numero, numInvertido;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el numero: ");
        numero = sc.nextInt();

        int unidadInvertida, decenasInvertida;

        unidadInvertida = (numero % 10) * 10;
        decenasInvertida = numero / 10;

        numInvertido = unidadInvertida + decenasInvertida;

        System.out.printf("numero %d invertido es %d: ",numero, numInvertido);
    }
}
