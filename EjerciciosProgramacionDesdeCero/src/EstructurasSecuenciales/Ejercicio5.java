package EstructurasSecuenciales;

import java.util.Scanner;

public class Ejercicio5 {

    // Calcular la media de tres números pedidos por teclado.

    public static void main(String[] args) {
        double primerNumero;
        double segundoNumero;
        double tercerNumero;
        double media;
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserta el primer numero: ");
        primerNumero = sc.nextDouble();

        System.out.println("Inserta el segundo numero: ");
        segundoNumero = sc.nextDouble();

        System.out.println("Inserta el tercer numero: ");
        tercerNumero = sc.nextDouble();

        media = (primerNumero + segundoNumero + tercerNumero) / 3;
        System.out.println("La media es: " + media);
    }
}
