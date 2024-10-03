package EstructurasSecuenciales;

import java.util.Scanner;

public class Ejercicio7 {

//    Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber
//    cuánto deberá pagar finalmente por su compra.

    public static void main(String[] args) {
        double descuento = 15;
        double precioFinal, precio;
        Scanner sc = new Scanner(System.in);

        System.out.println("Indica el precio: ");
        precio = sc.nextDouble();

        precioFinal = precio + (precio * (15/100f));
        System.out.printf("Precio final: %.2f€",precioFinal);
    }
}
