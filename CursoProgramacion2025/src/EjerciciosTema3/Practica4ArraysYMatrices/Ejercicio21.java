package EjerciciosTema3.Practica4ArraysYMatrices;

import java.sql.SQLOutput;
import java.util.Scanner;

import static EjerciciosTema3.Practica4ArraysYMatrices.Ejercicio14.printMatriz;
import static EjerciciosTema3.Practica4ArraysYMatrices.Ejercicio18.fillMatriz;

public class Ejercicio21 {
    /*
        Crea un metodo que dada una determinada matriz nxm devuelva su matriz traspuesta.
     */

    /***
     * Crea la matriz traspuesta
     * @param arr
     * @return
     */
    static int[][] newArr(int arr[][]){
        return new int[arr[0].length][arr.length];
    }

    /***
     * Llena la nueva matriz con los datos de la original
     * @param initArr
     * @param newArr
     */
    static void reverseArr(int[][] initArr, int[][] newArr){
        for (int i = 0; i < initArr.length; i++) {
            for (int j = 0; j < initArr[i].length; j++) {
                newArr[j][i] = initArr[i][j];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, cols;

        try{
            System.out.println("Indica las dimensiones de tu matriz");
            System.out.print("Filas: ");
            rows = Integer.parseInt(sc.nextLine());
            System.out.print("Columnas: ");
            cols = Integer.parseInt(sc.nextLine());

            int arr[][] = new int[rows][cols];
            int newArr[][] = newArr(arr);

            fillMatriz(arr);
            printMatriz(arr);

            System.out.println();

            reverseArr(arr, newArr);
            printMatriz(newArr);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
