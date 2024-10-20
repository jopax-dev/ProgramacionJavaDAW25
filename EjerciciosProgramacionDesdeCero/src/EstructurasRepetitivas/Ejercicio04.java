package EstructurasRepetitivas;

import java.util.Scanner;

public class Ejercicio04 {
    /*
        Escribir un programa que imprima todos los números pares entre dos números que se le
        pidan al usuario.
     */
    public static void main(String[] args) {
        int numIni, numFin;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el numero desde el que quieres empezar");
        numIni = sc.nextInt();

        System.out.println("Escribe el ultimo numero");
        numFin = sc.nextInt();

        for (int i = numIni; i <= numFin; i++) {
            if(i % 2 == 0) { System.out.println(i); }
        }
    }
}
