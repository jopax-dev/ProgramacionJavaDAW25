package EstructurasRepetitivas;

import java.util.Scanner;

public class Ejercicio02 {
    /*
        Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a
        introducir). El programa debe informar de cuantos números introducidos son mayores que
        0, menores que 0 e iguales a 0.
     */
    public static void main(String[] args) {
        int poasitivos = 0, negativos = 0, igualCero = 0, total, num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos numeros quieres introducir?");
        total = sc.nextInt();

        for (int i = total; i > 0; i--) {
            System.out.println("Introduce el primer numero");
            num = sc.nextInt();
            if( num > 0){
                poasitivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                igualCero++;
            }
        }
        System.out.printf("""
                Total:
                - Positivos: %d
                - Negativos: %d
                - Igual a cero: %d
                """, poasitivos, negativos, igualCero);
    }
}
