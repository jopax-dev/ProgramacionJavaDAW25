package EjerciciosTema2.Bucles;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        /*
            Factorial:
            5! = 5 * 4 * 3 * 2 * 1
            8! = 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el numero para calcular su factorial");
        int num = sc.nextInt();
        double factorial = 1;

        for (int i = num; i >= 2 ; i--) {
            factorial *= i;
        }

        System.out.printf("Factorial de %d => %.0f", num, factorial);
    }
}
