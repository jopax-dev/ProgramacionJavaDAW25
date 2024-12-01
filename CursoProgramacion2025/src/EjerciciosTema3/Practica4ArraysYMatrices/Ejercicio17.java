package EjerciciosTema3.Practica4ArraysYMatrices;

import java.util.Arrays;

import static EjerciciosTema3.Practica4ArraysYMatrices.Ejercicio1.numAleatorio;
import static EjerciciosTema3.Practica4ArraysYMatrices.Ejercicio14.printMatriz;

public class Ejercicio17 {
    /*
        Ordenar matrices. Crea una matriz de enteros de dos dimensiones de 50x50 elementos, rellénala con
        números aleatorios entre 1 y 500. A continuación, realiza dos funciones:
            A. ordenaFilas(matriz): que ordene la matriz por filas, cada fila de la matriz quedará ordenada
                de menor a mayor.
            B. ordenaColumnas(matriz): que ordene la matriz por columnas, cada columna quedará ordenada de
                menor a mayor, independientemente de las demás
     */

    public static void fillMatriz(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = numAleatorio(1,500);
            }
        }
    }

    public static void orderRows(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }
    }

    public static void orderColumns(int arr[][]){
        int columnas[] = new int[arr.length];
        for (int j = 0; j < arr[0].length; j++) {

            for (int i = 0; i < arr.length; i++) {
                columnas[i] = arr[i][j];
            }

            Arrays.sort(columnas);

            for (int i = 0; i < arr.length; i++) {
                arr[i][j] = columnas[i];
            }

        }
    }
    public static void main(String[] args) {
        int arr[][] = new int[50][50];
        fillMatriz(arr);

        System.out.println("Matriz original");
        printMatriz(arr);
        System.out.println();

        System.out.println("Matriz filas ordenadas");
        orderRows(arr);
        printMatriz(arr);
        System.out.println();

        System.out.println("Matriz columnas ordenadas");
        orderColumns(arr);
        printMatriz(arr);
    }
}
