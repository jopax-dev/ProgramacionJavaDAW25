package EjerciciosTema3.Practica4ArraysYMatrices;

import static EjerciciosTema3.Practica4ArraysYMatrices.Ejercicio1.numAleatorio;
import static EjerciciosTema3.Practica4ArraysYMatrices.Ejercicio14.printMatriz;

public class Ejercicio16 {
    /*
        Crea una matriz de 3x6 números enteros aleatorios no repetidos.
     */

    static boolean numExists(int arr[][], int num){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = new int[3][6];
        int num;
        for (int i = 0; i < arr.length; i++) {
            num = 0;
            for (int j = 0; j < arr[i].length; j++) {
                do {
                    num = numAleatorio(1, 18);
                } while (numExists(arr, num));
                arr[i][j] = num;
            }
        }
        printMatriz(arr);
    }
}
