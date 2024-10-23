package EjerciciosTema2.Ejercicios1_Unidad2.EjerciciosBuclesyCondicionales;

import java.util.Scanner;

public class Ejercicio16 {
    /*
        Programa que lea por teclado una serie de números enteros hasta que introduzca el -1 y obtenga su
        media. Deberá mostrarla por pantalla.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0, numNums = 0, suma = 0;
        Double media;

        while ( numero != -1){
            System.out.print("Escribe un numero: ");
            numero = sc.nextInt();

            if(numero!= -1) {
                suma += numero;
                numNums++;
            }
        }
        media = (double)suma / numNums;
        System.out.printf("la media de los %d numeros es %.2f", numNums, media);
    }
}
