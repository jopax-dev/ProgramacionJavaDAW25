package EjerciciosTema2.Ejercicios1_Unidad2.EjerciciosdeBucles;

import java.util.Scanner;

public class Ejercicio5 {
    /*
    Programa que pida al usuario un número repetidamente hasta que esté entre 1 y 10.
     */
    public static void main(String[] args) {
        boolean num10 = false, num1 = false;
        Scanner sc = new Scanner(System.in);
        int numero;
        while (!num10 || !num1) {
            System.out.println("Introduce el siguiente numero");
            numero = sc.nextInt();

            if(numero == 10){
                num10 = true;
            } else if (numero == 1) {
                num1 = true;
            }
        }
        System.out.println("Has introducido 1 y 10");
    }
}
