package Introduccion;

import java.util.Scanner;

public class PrecioProducto {

    // Crea un programa que pida por teclado el precio de un producto
    // Pide tambien la cantidad de ese producto.
    // Devuelve el precio final, con el iva (21%) incluido

    public static void main(String[] args) {
        double precio, pvpFinal;
        int cantidadProducto, iva = 21;
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuanto vale el producto?: ");
        precio = sc.nextDouble();

        System.out.println("Que cantidad quieres comprar? ");
        cantidadProducto = sc.nextInt();

        pvpFinal = (precio + (precio * iva)/100) * cantidadProducto;

        System.out.printf("Total a pagar (IVA incl): %.2f€", pvpFinal);

    }
}
