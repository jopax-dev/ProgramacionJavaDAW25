package EjerciciosTema2.Ejercicios1_Unidad2.EjerciciosBuclesyCondicionales;

import java.util.Scanner;

public class Ejercicio15 {

    /*
         Programa que lea números hasta que le den el cero, y que diga cuál ha sido el mayor y cuál el menor de
        los números introducidos (sin tener en cuenta el cero).
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1, numMax = 0, numMin = 0;

        while (num != 0) {
            System.out.println("Escribe un numero");
            num = sc.nextInt();
            if(num != 0) {
                if (num > numMax || numMax == 0) numMax = num;
                if (num < numMin || numMin == 0) numMin = num;
            }
        }

        System.out.printf("""
                El numero mayor ha sido %d
                Y el numero menor ha sido %d
                """, numMax, numMin);
    }
}
