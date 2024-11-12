package EjerciciosTema3.arrays;

import java.util.Scanner;

public class EjerciciosArrays2 {
    /*
        Ejercicio 2
            - Programa que declare tres vectores de enteros de 10 elementos cada uno, pìda por teclado los valores del
            vector 1 y vector 2 y calcule vector 3 con los valores de los anteriores y los pinte por pantalla
     */
    public static void main(String[] args) {
        int vector1[] = new int[10], vector2[] = new int[10], vector3[] = new int[10];
        Scanner sc = new Scanner(System.in);

        try {
            for (int i = 0; i < vector1.length; i++){
                System.out.println("Introduce el valor para la posicion " + i);
                vector1[i] = Integer.parseInt(sc.nextLine());
            }

            System.out.println("Ahora introduc e los valores para el segundo vector:");

            for (int i = 0; i < vector2.length; i++){
                System.out.println("Introduce el valor para la posicion " + i);
                vector2[i] = Integer.parseInt(sc.nextLine());
            }

            for (int i = 0; i < vector3.length; i++){
                vector3[i] = vector1[i] + vector2[i];
                System.out.printf("El valor de vector3[%d] es %d\n", i, vector3[i]);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
