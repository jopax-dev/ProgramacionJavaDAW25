package EjerciciosTema3.Practica4ArraysYMatrices;

import java.util.Arrays;
import java.util.Scanner;

import static EjerciciosTema3.Practica4ArraysYMatrices.Ejercicio1.numAleatorio;

public class Ejercicio8 {
    /*
        Genera aleatoriamente una tabla de 10 elementos numéricos enteros, guardalos en una array. Luego
        pide por teclado una posición (entre 0 y 9). Eliminar el elemento situado en la posición dada sin
        dejar huecos.
     */

    static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void arrTrim(int[] arr, int pos){
        for (int i = pos; i < arr.length -1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
    }

    static void delPosArr(int[] arr, int pos){
        arr[pos] = 0;
    }

    static void delTrimArr(int[] arr, int pos){
        delPosArr(arr, pos);
        arrTrim(arr, pos);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = numAleatorio(1, 50);
        }

        System.out.println("introduce una posicion a borrar [0 - 9]");
        int pos = sc.nextInt();

        System.out.println("Original:");
        printArr(arr);

        delTrimArr(arr, pos);

        System.out.println("Modificado:");
        printArr(arr);
    }
}
