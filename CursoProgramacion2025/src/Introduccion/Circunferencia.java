package Introduccion;

import java.util.Scanner;

public class Circunferencia {
    public static void main(String[] args) {

        // Inicializamos las variables
        int radio = 0;
        double circunferencia = 0;
        double longitud = 0;

        // Declaramos scanner para leer de la terminal
        Scanner sc = new Scanner(System.in);

        //Pedimos al usuario que inserte un numero

        System.out.println("Indica el radio: ");

        /*
            Si no introducimos un numero valido, mostramos mensaje de error
            y terminamos el programa
         */
        if (!sc.hasNextInt()){
            System.out.println("No has introducido un numero valido");
            System.exit(1);
        }

        // Guardamos el dato introducido en radio
        radio = sc.nextInt();

        // Calculamos lo que nos piden y lo guardamos en su variable
        circunferencia = Math.PI * radio * radio;
        longitud = 2 * Math.PI * radio;

        // Mostramos por pantalla los valores finales
        System.out.println("El valor de la circunferencia es " + circunferencia);
        System.out.println("El valor de la longitud es " + longitud);
    }
}
