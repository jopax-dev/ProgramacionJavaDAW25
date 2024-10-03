package EstructurasSecuenciales;

import java.util.Scanner;

public class Ejercicio8 {

//    Pide al usuario dos números y muestra la “distancia” entre ellos (el valor absoluto de su
//    diferencia, de modo que el resultado sea siempre positivo).
    public static void main(String[] args) {
        double num1, num2, total;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el 1er numero:");
        num1 = sc.nextDouble();

        System.out.println("Introduce el 2º numero:");
        num2 = sc.nextDouble();

        total = Math.abs(num1 - num2);

        System.out.println("Diferencia entre los 2 numeros: " + total);

    }
}
