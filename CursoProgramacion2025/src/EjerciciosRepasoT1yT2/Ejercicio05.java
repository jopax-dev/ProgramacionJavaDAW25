package EjerciciosRepasoT1yT2;

import java.util.Scanner;

public class Ejercicio05 {
    /*
         Realiza una función que calcule el máximo de tres números. Pruébala.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero: ");
        int num1 = sc.nextInt();

        System.out.println("Introduce el segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println("Introduce el tercer numero: ");
        int num3 = sc.nextInt();

        int max = num2;

        if ( num3 > num2){
            max = num3;
        } else if (num1 > num2){
            max = num1;
        }

        System.out.printf("El numero mayor entre %d, %d y %d es %d", num1, num2, num3, max);
    }
}
