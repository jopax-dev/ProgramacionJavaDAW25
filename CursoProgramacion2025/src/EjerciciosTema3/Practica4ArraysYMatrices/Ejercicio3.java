package EjerciciosTema3.Practica4ArraysYMatrices;

import java.util.ArrayList;
import java.util.Scanner;

import static EjerciciosTema3.Practica4ArraysYMatrices.Ejercicio1.numAleatorio;

public class Ejercicio3 {
    /*
        Crea un array de números de un tamaño pasado por teclado, el array contendrá números aleatorios
        entre 1 y 300 y mostrar aquellos números que acaben en un dígito que nosotros le indiquemos por
        teclado (debes controlar que se introduce un numero correcto), estos deben guardarse en un nuevo
        array.
        Por ejemplo, en un array de 10 posiciones e indicamos mostrar los números acabados en 5, podría
        salir 155, 25, etc. Cuando llene el segundo array finalizamos.
     */

    static int min = 1;
    static int max = 300;

    public static void randomArr(int[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = numAleatorio(min, max);
        }

    }

    public static int[] filterArray(int[] arr, int filter){
        ArrayList<Integer> filtered = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            if(arr[i]%10 == filter)
                filtered.add(arr[i]);
        }

        int newArr[] = new int[filtered.size()];

        for (int i = 0; i < filtered.size(); i++){
            newArr[i] = filtered.get(i);
        }

        return newArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[], filtererdArr[];

        System.out.println("De cuantos numeros quieres el array?");
        try {
            int arrLength = Integer.parseInt(sc.nextLine());
            if (arrLength < 1)
                    throw new IllegalArgumentException("El numero debe ser mayor que 1");

            arr = new int[arrLength];
            randomArr(arr);

            System.out.println("En que digito quieres que acaben los numeros a mostrar?");

            int digitoFinal = Integer.parseInt(sc.nextLine());
            if (digitoFinal < 0)
                throw new IllegalArgumentException("El numero debe ser mayor que 0");

            filtererdArr = filterArray(arr, digitoFinal);

            if(filtererdArr.length == 0){
                System.out.println("No hay ningun numero terminado en " + digitoFinal);
            } else {
                for (int i = 0; i < filtererdArr.length; i++){
                    System.out.printf("%d ",filtererdArr[i]);
                }
            }
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error");
            System.out.println(e.getMessage());
        }
    }
}
