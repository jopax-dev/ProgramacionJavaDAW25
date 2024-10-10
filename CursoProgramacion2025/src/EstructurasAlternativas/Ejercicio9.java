package EstructurasAlternativas;

import java.util.Scanner;

public class Ejercicio9 {
    /*
        Escribe un programa que pida un número entero entre uno y doce e imprima el número de
        días que tiene el mes correspondiente
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero del 1 al 12: ");
        int mes = sc.nextInt();
        if (mes > 0 && mes <= 12) {
            int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                    "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

            System.out.printf("%s tiene %d dias (con arrays)\n", meses[mes  - 1], diasMes[mes  - 1]);
        }

        /*
            ************************
            ** Haciendolo con ifs **
            * **********************

         */
        if (mes == 1){
            System.out.println("Enero tiene 31 dias");
        } else if (mes == 2) {
            System.out.println("Febrero tiene 28 dias");
        } else if (mes == 3) {
            System.out.println("Marzo tiene 31 dias");
        } else if (mes == 4) {
            System.out.println("Abril tiene 30 dias");
        } else if (mes == 5) {
            System.out.println("Mayo tiene 31 dias");
        } else if (mes == 6) {
            System.out.println("Junio tiene 30 dias");
        } else if (mes == 7) {
            System.out.println("Julio tiene 31 dias");
        } else if (mes == 8) {
            System.out.println("Agosto tiene 31 dias");
        } else if (mes == 9) {
            System.out.println("Septiembre tiene 30 dias");
        } else if (mes == 10) {
            System.out.println("Octubre tiene 31 dias");
        } else if (mes == 11) {
            System.out.println("Noviembre tiene 30 dias");
        } else if (mes == 12) {
            System.out.println("Diciembre tiene 31 dias");
        } else {
            System.out.println("No existe un numero del 1 al 12");
        }
    }
}
