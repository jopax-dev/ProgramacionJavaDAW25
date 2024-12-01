package EjerciciosTema3.Practica4ArraysYMatrices;

public class Ejercicio12 {
    /*
    Crear una matriz “marco” de tamaño 8x6. Una matriz “marco” es aquella que todos sus elementos son 0
    salvo los de los bordes que deben ser 1. Mostrarla.
     */

    public static void main(String[] args) {
        int arr[][] = new int[8][6];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if( i == 0 || i == arr.length - 1 || j == 0 || j == arr[i].length - 1) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
