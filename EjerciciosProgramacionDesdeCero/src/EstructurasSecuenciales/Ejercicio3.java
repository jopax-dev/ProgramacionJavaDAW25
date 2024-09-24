package EstructurasSecuenciales;

import java.util.Scanner;

public class Ejercicio3 {

    // Dados dos números, mostrar la suma, resta, división y multiplicación de ambos.

    public static void main(String[] args) {
        double primerNumero;
        double segundoNumero;
        double suma;
        double resta;
        double division;
        double multiplicacion;
        Scanner sc = new Scanner(System.in);

        System.out.println("Indica el primer numero: ");
        primerNumero = sc.nextDouble();

        System.out.println("Indica el segundo numero: ");
        segundoNumero = sc.nextDouble();

        suma = primerNumero + segundoNumero;
        System.out.println("la suma de " + primerNumero + " y " + segundoNumero + " es: " + suma);


        resta = primerNumero - segundoNumero;
        System.out.println("la resta de " + primerNumero + " y " + segundoNumero + " es: " + resta);


        division = primerNumero / segundoNumero;
        System.out.println("la division de " + primerNumero + " y " + segundoNumero + " es: " + division);

        multiplicacion = primerNumero * segundoNumero;
        System.out.println("la multiplicacion de " + primerNumero + " y " + segundoNumero + " es: " + multiplicacion);

    }
}
