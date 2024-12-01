package EjerciciosTema3.Practica4ArraysYMatrices;

import java.util.Scanner;

public class Ejercicio5 {
    /*
        Leer 10 números enteros y a continuación mostrar la media de los números introducidos, el mayor
        valor y el menor valor. Usar un array para almacenar los valores y sacar toda la información en una
        sola iteración del array. Si puedes mejóralo implementando una función para cada tarea (media,
        mayor, menor), pasando el array
     */

    static final int arrLength = 10;

    static int menor(int num1, int num2){
        return num1 > num2 ? num2 : num1;
    }

    static int mayor(int num1, int num2){
        return num2 > num1 ? num2 : num1;
    }

    static double media(int num, int nums){
        return (double)num / nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[arrLength + 3];
        System.out.println(arr.length);
        int num;

        for (int i = 0; i < arrLength; i++) {
            try {
                System.out.println("Introduce un numero");
                num = Integer.parseInt(sc.nextLine());

                if(i == 0){
                    arr[arr.length - 1] = num;
                    arr[arr.length - 2] = num;
                } else {
                    arr[arr.length - 1] = mayor(arr[i], num);
                    arr[arr.length - 2] = menor(arr[i], num);
                }
                arr[arr.length - 3] += num;

            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.printf("La suma media es %.2f, el numero minimo es %d y el maximo es %d",
                media(arr[arr.length - 3], arrLength), arr[arr.length - 2], arr[arr.length - 1]);
    }

}