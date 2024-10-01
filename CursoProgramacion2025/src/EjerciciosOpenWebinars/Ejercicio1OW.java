package EjerciciosOpenWebinars;

import java.util.Scanner;

public class Ejercicio1OW {
    // Pedimos por teclado el coste de fabricacion de un producto
    // Queremos pintar por pantalla el precio que le vamos a  poner al producto para el cliente
    // Al coste de fabricacion hay que sumarle la ganancia del vendedor (30%)
    // Al precio resultante hay que añadirle el iva (21%)
    // Por ultimo imprimo por pantalla el precio final

    public static void main(String[] args) {
        double iva = 21, ganancia = 30, precioFabr, pvpFinal, pvpSinIva;
        Scanner sc = new Scanner(System.in);

        System.out.println("Indica el coste de fabricacion: ");
        precioFabr = sc.nextDouble();

        pvpSinIva = precioFabr * (1 + ganancia/100);

        pvpFinal = pvpSinIva * (1 + iva/100);
        System.out.printf("Precio final (IVA inc.): %.2f", pvpFinal);
    }
}
