package EstructurasAlternativas;

import java.util.Scanner;

public class Ejercicio8 {
    /*
        Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un
        dado de seis caras y muestre por pantalla el número en letras (dato cadena) de la cara
        opuesta al resultado obtenido.
        Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
        Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el
        mensaje: “ERROR: número incorrecto.”.
        Ejemplo:
        Introduzca número del dado: 5
        En la cara opuesta está el "dos".
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu tirada de dado");
        int resultDado = sc.nextInt();

        if (resultDado < 1 || resultDado > 6) {
            System.out.println("ERROR: numero incorrecto");
        } else {
            resultDado--;
            String[] caraOpuesta = {"Seis", "Cinco", "Cuatro", "Tres", "Dos", "Uno"};
            System.out.printf("En la cara opuesta esta el: \"%s\"", caraOpuesta[resultDado]);
        }
    }
}
