package EjerciciosTema3.Practica4ArraysYMatrices;

import java.util.Scanner;

public class Ejercicio7 {
    /*
        Crear un programa que lea por teclado una tabla de 5 números enteros y la desplace una posición
        hacia la derecha: el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así
        sucesivamente. Igual que el anterior, pero desplazando N posiciones (N es un número introducido por
         el usuario).
     */

    /***
     * Recorre e imprime el array
     * @param arr
     */
    static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /***
     * Mueve los numeros de un array X posiciones hacia la derecha.
     * Con numeros negativos los mueve hacia la izquierda
     * @param original
     * @param newArr
     * @param numPosToDisplace
     */
    static void displaceNPos(int[] original, int[] newArr, int numPosToDisplace){
        int index;

        numPosToDisplace = numPosToDisplace % newArr.length;

        if (numPosToDisplace < 0){
            numPosToDisplace += newArr.length;
        }

        for (int i = 0; i < original.length; i++) {
           index = (i + numPosToDisplace) % newArr.length;
           newArr[index] = original[i];
        }
    }

    /***
     * Mueve 1 posicion hacia la derecha los numeros del array
     * @param original
     * @param newArr
     */
    static void displaceOnePos(int[] original, int[] newArr){
        displaceNPos(original, newArr, 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5], arrDispl = new int[5], arrNDisp = new int[5];
        for (int i = 0; i < arr.length; i++) {
            try {
                System.out.println("Introduce un numero");
                arr[i] = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Introduce un numero");
                i--;
            }
        }

        System.out.println("Array original");
        printArr(arr);

        System.out.println("Array 1 pos a la derecha");
        displaceOnePos(arr, arrDispl);
        printArr(arrDispl);

        int displace = 0;
        while (displace == 0) {
            try {
                System.out.println("Cuantas posiciones quieres moverlo a la derecha?");
                displace = Integer.parseInt(sc.nextLine());
                displaceNPos(arr, arrNDisp, displace);
                printArr(arrNDisp);
            } catch (NumberFormatException e) {
                displace = 0;
                System.out.println("Introduce un numero");
                System.out.println(e.getMessage());
            }
        }

    }
}
