package EjerciciosTema2.Bucles;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        /*
            Introduce un numero y di si es primo o no
         */

        Scanner sc = new Scanner(System.in);
        int num;
        boolean primo= true;
        String textPrimo = " ";

        System.out.println("Introduce un numero");
        num = sc.nextInt();

        for (int i = num - 1; i > 1 ; i--) {
            if ( num % i == 0){
                primo = false;
                textPrimo = " no ";
                break;
            }
        }
        System.out.printf("El numero %d%ses primo", num, textPrimo);

    }
}
