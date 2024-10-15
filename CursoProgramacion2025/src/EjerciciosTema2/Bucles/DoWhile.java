package EjerciciosTema2.Bucles;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        /*
        // Pass >= 8
        Scanner sc = new Scanner(System.in);
        String pass;

        do {
            System.out.println("Escribe una contraseña");
            pass = sc.nextLine();
        } while (pass.length() < 8);

        */

        // Muestra los numeros del 1 al 10
        int num=1;

        do {
            System.out.println(num);
            num++;
        } while (num <= 10);
    }
}
