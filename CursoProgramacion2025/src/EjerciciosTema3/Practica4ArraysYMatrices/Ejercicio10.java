package EjerciciosTema3.Practica4ArraysYMatrices;

import java.util.Scanner;

import static EjerciciosTema3.Practica4ArraysYMatrices.Ejercicio1.numAleatorio;

public class Ejercicio10 {
    /*
        Realiza una función que devuelva un array con una combinación de la Lotería Primitiva (6 números
        entre 1 y 49). La particularidad es que los números no deben estar repetidos.
     */

    static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int menu(){
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        while (opcion != 1 && opcion != 2) {
            System.out.print("""
                    ################################
                    ###                          ###
                    ###      Nueva apuesta:      ###
                    ###                          ###
                    ################################
                    ###                          ###
                    ###     Elije una opcion     ###
                    ###                          ###
                    ###     1.- Automática       ###
                    ###     2.- Manual           ###
                    ###                          ###
                    ################################
                    """);

            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println();
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return opcion;
    }

    static boolean numExists(int arr[], int num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    static void apuestaAleatoria(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int num = 0;
            do {
                num = numAleatorio(1, 49);
            } while (numExists(arr, num));
            arr[i] = num;
        }
    }

    static void apuestaManual(int arr[]){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            int num = 0;
            do {
                System.out.println("Introduce el "+ (i + 1) +" numero entre 1 y 49");
                try {
                    num = Integer.parseInt(sc.nextLine());
                    if (num < 1 || num > 49) {
                        System.out.println("Numero no valido");
                        i--;
                    }

                    if (numExists(arr, num)) {
                        System.out.println("El numero ya existe");
                        i--;
                    }
                } catch (NumberFormatException e) {
                    num = 0;
                    System.out.println();
                }
            } while (numExists(arr, num));
            arr[i] = num;
        }
    }

    public static void main(String[] args) {
        int apuesta[] = new int[6];
        int opcion =  menu();

        switch (opcion){
            case 1:
                apuestaAleatoria(apuesta);
                break;
            case 2:
                apuestaManual(apuesta);
                break;
        }

        printArr(apuesta);
    }
}
