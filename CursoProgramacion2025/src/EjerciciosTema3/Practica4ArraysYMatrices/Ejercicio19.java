package EjerciciosTema3.Practica4ArraysYMatrices;

import java.util.Scanner;

import static EjerciciosTema3.Practica4ArraysYMatrices.Ejercicio1.numAleatorio;
import static EjerciciosTema3.Practica4ArraysYMatrices.Ejercicio7.printArr;

public class Ejercicio19 {
    /*
        Implementación de una Pila con un vector de 20 elementos. Una Pila se basa en el concepto “Primero
        en entrar Último en salir”. De modo que se saca siempre el último que se añadió. Implementa métodos
        para crear una pila vacía, insertar elemento en la pila, sacar elemento de la pila (lo muestra y
        lo quita), comprobar si la pila está llena.
     */

    /***
     * Devuelve true si la pila esta llena
     * @param arr
     * @return
     */
    static boolean isFull(int arr[]){
        return arr[arr.length - 1] != 0;
    }

    /***
     * Si el stack no esta lleno
     * Busca la ultima posicion vacía y añade un elemento
     * @param arr
     */
    static void addToStack(int arr[]){
        if(isFull(arr)){
            System.out.println("El stack está lleno");
            return;
        }

        for (int i = arr.length - 1; i >= 0; i--){
            if(arr[i] == 0){
                if(i - 1 >= 0){
                    if(arr[i - 1] != 0){
                        arr[i] = numAleatorio(1,100);
                    }
                } else {
                    arr[i] = numAleatorio(1,100);
                }
            }
        }
    }

    /***
     * Elimina el primer elemento que aparece al final de la pila
     * @param arr
     */
    static void deleteFromStack(int arr[]){
        for (int i = arr.length - 1; i >= 0; i--){
            if(arr[i] != 0){
                System.out.println("Eliminado elemento: " + arr[i]);
                arr[i] = 0;
                break;
            }
        }
    }

    /***
     * Reinicializa el stack
     * @param arr
     * @return
     */
    static int[] initializeStack(int arr[]){
        return new int[arr.length];
    }

    static int menu(){
        int opcion;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("""
                    ################################
                    ###                          ###
                    ###    Manipulacion stack:   ###
                    ###                          ###
                    ################################
                    ###                          ###
                    ###     Elije una opcion     ###
                    ###                          ###
                    ###     1.- Reset            ###
                    ###     2.- Añadir           ###
                    ###     3.- Eliminar         ###
                    ###     4.- Imprimir stack   ###
                    ###     0.- Salir            ###
                    ###                          ###
                    ################################
                    """);

            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                opcion = 0;
                System.out.println();
            }catch (Exception e) {
                opcion = 0;
                System.out.println(e.getMessage());
            }

        }while (opcion < 0 || opcion > 4);


        return opcion;
    }

    public static void main(String[] args) {
        int stack[] = new int[20];
        int opcion;


        do {
            opcion = menu();
            switch (opcion){
                case 1:
                    stack = initializeStack(stack);
                    printArr(stack);
                    break;
                case 2:
                    addToStack(stack);
                    printArr(stack);
                    break;
                case 3:
                    deleteFromStack(stack);
                    printArr(stack);
                    break;
                case 4:
                    printArr(stack);
                    break;
            }
        } while (opcion != 0);

    }
}
