package EjerciciosTema3.Practica4ArraysYMatrices;

import static EjerciciosTema3.Practica4ArraysYMatrices.Ejercicio1.numAleatorio;
import static EjerciciosTema3.Practica4ArraysYMatrices.Ejercicio14.printMatriz;

public class Ejercicio18 {
    /*
        Escribe un programa que genere al azar 20 números enteros comprendidos entre 0 y 9. Estos números
        se deben introducir en un array de 4 filas por 5 columnas. El programa mostrará las sumas parciales
        de filas y columnas igual que si de una hoja de cálculo se tratara. La suma total debe aparecer en
        la esquina inferior derecha.
     */

    static final int rows = 4;
    static final int cols = 5;

    static void clearMatriz(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            arr[i][arr[i].length - 1] = 0;
        }

        for (int j = 0; j < arr[0].length; j++) {
            arr[arr.length-1][j] = 0;
        }
    }

    public static void fillMatriz(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = numAleatorio(0, 9);
            }
        }
    }

    static int sum(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static void sumRow(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            arr[i][arr[0].length -1] = sum(arr[i]);
        }
    }

    static void sumCol(int arr[][]){
        int col[] = new int[arr.length - 1];
        for (int cols = 0; cols < arr[0].length; cols++) {
            for (int rows = 0; rows < arr.length - 1; rows++) {

                col[rows] = arr[rows][cols];
            }
            arr[arr.length - 1][cols] = sum(col);

        }
        arr[arr.length - 1][arr[0].length -1] = 0;
    }

    static void sumTotal(int arr[][]){
        int totalCols = 0;
        int totalRows = 0;

        for (int i = 0; i < arr.length-1; i++) {
            totalRows += arr[i][arr[0].length - 1];
        }
        System.out.println("Filas: " + totalRows);
        for (int cols = 0; cols < arr[0].length-1; cols++) {
            totalCols += arr[arr.length-1][cols];
        }

        System.out.println("Columnas: " + totalCols);

        arr[arr.length-1][arr[0].length-1] = totalRows + totalCols;


    }

    public static void main(String[] args) {
        int arr[][] = new int[rows + 1][cols + 1];

        fillMatriz(arr);
        clearMatriz(arr);
        printMatriz(arr);

        System.out.println();

        sumRow(arr);
        printMatriz(arr);

        System.out.println();

        sumCol(arr);
        printMatriz(arr);

        System.out.println();

        sumTotal(arr);
        printMatriz(arr);

    }
}
