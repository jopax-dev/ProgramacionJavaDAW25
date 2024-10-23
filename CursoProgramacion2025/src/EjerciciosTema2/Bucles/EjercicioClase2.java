package EjerciciosTema2.Bucles;

import java.util.Scanner;

public class EjercicioClase2 {
    /*
        Hay que pintar la siguiente figura

            00000000
            00000000
            00000000
            00000000
            00000000
            00000000
            00000000
            00000000

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("De cuantas filas quieres la figura?");
        int filas = sc.nextInt();

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= filas; j++) {
                System.out.print("0");
            }
            System.out.print("\n");
        }
    }

     */
    /*
        Hay que pintar la siguiente figura

            10000000
            01000000
            00100000
            00010000
            00001000
            00000100
            00000010
            00000001
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("De cuantas filas quieres la figura?");
        int filas = sc.nextInt();

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= filas; j++) {
                if(i == j){
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
