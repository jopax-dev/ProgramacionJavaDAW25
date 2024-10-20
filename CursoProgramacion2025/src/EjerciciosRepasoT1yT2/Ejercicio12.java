package EjerciciosRepasoT1yT2;

import java.util.Scanner;

public class Ejercicio12 {
    /*
        Genera y muestra las tiradas de tres dados (seis caras) hasta que los tres dados saquen el mismo valor.
        Muestra las tiradas y el número de tiradas necesario hasta que han salido iguales.
     */
    public static void main(String[] args) {
        int dado1, dado2, dado3, tiradas = 0;
        Boolean todas = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Quiere imprimir todas las tiradas?");
        todas  = sc.nextLine().equalsIgnoreCase("si");

        do {
            dado1 = (int) (Math.random() * 6 + 1);
            dado2 = (int) (Math.random() * 6 + 1);
            dado3 = (int) (Math.random() * 6 + 1);
            tiradas++;
            if (todas){
                System.out.printf("""
                Tirada numero: %d
                Dado 1 => %d
                Dado 2 => %d
                Dado 3 => %d
                """,tiradas, dado1, dado2, dado3);
            }

        } while (dado1 != dado2 || dado2 != dado3);
        if (!todas){
            System.out.printf("""
                Tirada final
                Dado 1 => %d
                Dado 2 => %d
                Dado 3 => %d
                """, dado1, dado2, dado3);
        }
        System.out.println("Total tiradas: " + tiradas);
    }
}
