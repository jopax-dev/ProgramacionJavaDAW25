package EstructurasSecuenciales;

import java.util.Scanner;

public class Ejercicio4 {

    // Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius.
    //Recordar que la fórmula para la conversión es:
    //C = (F-32)*5/9

    public static void main(String[] args) {
        double gradosC;
        double gradosF;
        Scanner sc = new Scanner(System.in);

        System.out.println("Indica la temperatura en ºF a convertir");
        gradosF = sc.nextDouble();

        gradosC = (gradosF - 32) * 5 / 9;

        System.out.println("la temperatura en ºC es: " + gradosC);
    }
}
