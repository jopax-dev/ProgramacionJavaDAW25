package EjerciciosTema1;

import java.util.Scanner;

public class EjercicioClase03_10_24 {

//    Nos dicen una cantidad en euros y tenemos que
//    devolverla en dolares y en pesos argentinos

    public static void main(String[] args) {
        final double euroDolar = 1.10, euroPesoArgenitno = 1071.75;
        double euro = 0, dolar, peso;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que cantidad de euros quieres pasar?: ");
        euro = sc.nextDouble();

        dolar = euro * euroDolar;
        peso = euro * euroPesoArgenitno;

        System.out.printf("%.2f€ son %.2f$ y %.2f(ARS) Pesos Argentinos", euro, dolar, peso);
    }
}
