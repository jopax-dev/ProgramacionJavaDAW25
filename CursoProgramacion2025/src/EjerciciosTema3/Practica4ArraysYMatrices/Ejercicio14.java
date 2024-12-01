package EjerciciosTema3.Practica4ArraysYMatrices;

import static EjerciciosTema3.Practica4ArraysYMatrices.Ejercicio1.numAleatorio;

public class Ejercicio14 {
    /*
        Crear una matriz 5x3 de números enteros (aleatorios) y mostrar el menor, el mayor y la media de los
        elementos.
     */

    public static void printMatriz(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int menor(int num1, int num2){
        return num1 < num2 ? num1 : num2;
    }

    static int mayor(int num1, int num2){
        return num1 > num2 ? num1 : num2;
    }

    public static void main(String[] args) {
        int menor = 100, mayor = 0, numNums = 0;
        double total = 0;
        int arr[][] = new int[5][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = numAleatorio(1, 100);
                menor = menor(menor, arr[i][j]);
                mayor = mayor(mayor, arr[i][j]);
                total += arr[i][j];
                numNums++;
            }
        }


        printMatriz(arr);

        System.out.println("Menor es: " + menor);
        System.out.println("Mayor es: " + mayor);
        System.out.println("La media es : " + total/numNums);

    }
}
