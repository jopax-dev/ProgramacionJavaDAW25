package EjerciciosTema2.Ejercicios1_Unidad2.EjerciciosdeBucles;

import java.util.Scanner;

public class Ejercicio7 {
    /*
        Función que calcule el factorial de un número entero positivo pasado como parámetro.
     */
    public static double factorial(int numero){
       if(numero > 0) {
           double factorial = 1;
           for (int i = numero; i > 1; i--) {
               factorial *= i;
           }
           return factorial;
       } else {
           System.out.println("El numero es negativo");
           System.exit( 1);
           return 0;
       }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero para calcular el factorial");
        int num = sc.nextInt();
        System.out.println("El factorial de !" + num + " es: " + factorial(num));
    }
}
