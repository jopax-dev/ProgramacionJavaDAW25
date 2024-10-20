package EstructurasAlternativas;

import java.util.Scanner;

public class Ejercicio4 {

    /*
            Realiza un algoritmo que calcule la potencia, para ello pide por teclado la base y el
            exponente. Pueden ocurrir tres cosas:
            El exponente sea positivo, sólo tienes que imprimir la potencia.
            El exponente sea 0, el resultado es 1.
            El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el numero: ");
        double numero = sc.nextDouble();
        System.out.println("Escribe el potencia: ");
        int exponente = sc.nextInt();

        if (exponente > 0){
            System.out.println("El resultado es: " + Math.pow(numero, exponente));
        }else if (exponente < 0){
            System.out.println("El resultado es: " + (1 / Math.pow(numero, -exponente)));
        } else {
            System.out.println("El resultado es 1");
        }
    }
}
