package EjerciciosTema3.Practica4ArraysYMatrices;

import static EjerciciosTema3.Practica4ArraysYMatrices.Ejercicio1.numAleatorio;
import static EjerciciosTema3.Practica4ArraysYMatrices.Ejercicio14.printMatriz;

public class Ejercicio15 {
    /*
        Crear dos matrices 3x3 de números enteros (generadas aleatoriamente), pintarlas, sumarlas y mostrar
        su suma. El resultado será también una matriz (suma) donde cada elemento será la suma de los
        elementos de las otras matrices en la misma posición.
     */

    public static void fillMatriz(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = numAleatorio(1,100);
            }
        }
    }

    public static int[][] sumMatriz(int arr1[][], int arr2[][]){

        int sum[][] = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr1[][] = new int[3][3];
        int arr2[][] = new int[3][3];
        int arr3[][];

        fillMatriz(arr1);
        fillMatriz(arr2);

        System.out.println("Arr 1");
        printMatriz(arr1);
        System.out.println("Arr 2");
        printMatriz(arr2);

        System.out.println("Arr 3");
        arr3 = sumMatriz(arr2, arr1);
        printMatriz(arr3);

    }
}
