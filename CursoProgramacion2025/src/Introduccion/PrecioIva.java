package Introduccion;

import java.util.Scanner;

public class PrecioIva {
    public static void main(String[] args) {
        int iva = 21;
        double precio = 0;
        double pvpFinal = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Indica el precio: ");

        precio = sc.nextDouble();

        pvpFinal = precio + (precio * ((double) iva / 100));

        System.out.println("Precio final: " + pvpFinal + "€");

    }
}
