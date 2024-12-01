package EjerciciosTema3.Practica4ArraysYMatrices;

public class Ejercicio11 {
    /*
        Crear una tabla bidimensional de tamaño 5x5 y rellenarla de forma que los elementos de la diagonal
        principal sean 1 y el resto 0. Mostrarla.
     */

    public static void main(String[] args) {
        int arr[][] = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if( i == j){
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
