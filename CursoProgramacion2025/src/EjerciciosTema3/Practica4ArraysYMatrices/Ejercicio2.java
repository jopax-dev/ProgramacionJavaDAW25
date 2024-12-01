package EjerciciosTema3.Practica4ArraysYMatrices;

public class Ejercicio2 {
    /*
        Crea una función que reciba como parámetro un array de 10 enteros, debe devolver el mismo array donde se
        hayan intercambiado el primer elemento y el último elemento
     */

    public static void changePos(int arr[]){
        int var = arr[arr.length - 1];
        arr[arr.length - 1] = arr[0];
        arr[0] = var;

    }

    public static void main(String[] args) {
        int array[] = new  int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
        changePos(array);

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }

    }
}
