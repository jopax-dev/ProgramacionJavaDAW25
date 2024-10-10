package EjerciciosTema2;

import java.util.Scanner;

public class EjercicioClase2 {
    /*
        Implementa un programa en java que dada una fecha, nos indique cual es la estacion del año
        El dia del mes, y el mes del año se debe introducir como numeros enteros a traves del teclado
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes, dia;

        System.out.println("Indica el mes: [1-12]");
        mes = sc.nextInt();

        System.out.println("Indica el dia [1-31]");
        dia = sc.nextInt();

        // Invierno
        if ((mes == 12 && dia >= 22) || mes < 3 || (mes == 3 && dia <= 19)){
            System.out.println("Estamos en invierno");

        // Primavera
        } else if (mes < 6 || (mes == 6 && dia <= 19)){
            System.out.println("estamos en primavera");

        // Verano
        } else if (mes < 9 || (mes == 9 && dia <= 21)){
            System.out.println("Estamos en verano");

        // otoño
        } else {
            System.out.println("Estamos en otoño");
        }
    }
}
