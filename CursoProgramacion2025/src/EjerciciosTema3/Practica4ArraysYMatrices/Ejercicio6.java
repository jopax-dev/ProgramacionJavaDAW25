package EjerciciosTema3.Practica4ArraysYMatrices;

import static EjerciciosTema3.Practica4ArraysYMatrices.Ejercicio1.numAleatorio;

public class Ejercicio6 {
    /*
        Generar 10 números enteros aleatorios. Debemos mostrarlos en el siguiente orden: el primero, el
        último, el segundo, el penúltimo, el tercero, etc… Pista: primero los guardas en un array y luego
        lo recorres como indica.
     */
    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = numAleatorio(1, 100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
