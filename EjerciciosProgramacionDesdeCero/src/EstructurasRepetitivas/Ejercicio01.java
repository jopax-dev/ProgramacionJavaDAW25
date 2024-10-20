package EstructurasRepetitivas;

import java.util.Scanner;

public class Ejercicio01 {
    /*
        Crea una aplicación que permita adivinar un número. La aplicación genera un número
        aleatorio del 1 al 100. A continuación, va pidiendo números y va respondiendo si el número
        a adivinar es mayor o menor que el introducido, además de los intentos que te quedan
        (tienes 10 intentos para acertarlo). El programa termina cuando se acierta el número
        (además te dice en cuantos intentos lo has acertado), si se llega al límite de intentos te
        muestra el número que había generado.
     */
    public static void main(String[] args) {
        int respuesta, contador = 0, num;
        Scanner sc = new Scanner(System.in);
        boolean ganador = false;

        System.out.println("Adivina el numero....");
        System.out.println("Numero generado correctamente");

        num = (int) (Math.random() * 100 + 1);

        for (int i = 10; i > 0; i--) {
            System.out.printf("Tienes %d intentos restantes\n", i);
            System.out.println("Introduce un numero: ");
            respuesta = sc.nextInt();

            contador++;

            if ( num > respuesta ) {
                System.out.println("El numero es mayor que " + respuesta);
            } else if ( num < respuesta ) {
                System.out.println("El numero es menor que " + respuesta);
            } else {
                ganador = true;
                break;
            }
        }
        if (ganador) {
            System.out.printf("Has ganado! Has acertado el numero en %d intentos", contador);
        } else {
            System.out.println("No has tenido suerte, intentalo de nuevo. El numero era " + num);
        }
    }
}
