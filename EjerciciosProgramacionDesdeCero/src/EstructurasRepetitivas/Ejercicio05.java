package EstructurasRepetitivas;

import java.util.Scanner;

public class Ejercicio05 {
    /*
        Escribe un programa que dados dos números, uno real (base) y un entero positivo
        (exponente), saque por pantalla el resultado de la potencia. No se puede utilizar el operador
        de potencia.
     */

    public static void main(String[] args) {

        double base, acumulador;
        int exponente;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe la base");
        base = sc.nextDouble();

        System.out.println("Escribe el exponente. Numero positivo");
        exponente = sc.nextInt();

        if (exponente < 1){
            System.out.println("El exponente debe ser mayor que 0");
        } else {
            for (int i = 1; i <= exponente; i++){
                acumulador = base;
                for (int j = 1; j < i; j++){
                    acumulador *= base;
                }
                System.out.printf("\n%.2f^%d => %.2f", base, i, acumulador);
            }
        }

    }

}
