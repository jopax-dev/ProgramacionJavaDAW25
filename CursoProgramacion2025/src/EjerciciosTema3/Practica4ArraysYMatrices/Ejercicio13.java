package EjerciciosTema3.Practica4ArraysYMatrices;

import java.util.Scanner;

public class Ejercicio13 {
    /*
        Crear una tabla bidimensional de tamaño 3x4 de números enteros (leídos desde teclado). Mostrar la
        matriz y la suma de los valores de cada fila
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum;
        int arr[][] = new int[3][4];

        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            System.out.println("Fila 1");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Ingrese un numero: ");
                try {
                    arr[i][j] = Integer.parseInt(sc.nextLine());
                    sum += arr[i][j];
                } catch (NumberFormatException e) {
                    j--;
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("Suma fila " + (i + 1) + ": " + sum);
        }
    }


}
