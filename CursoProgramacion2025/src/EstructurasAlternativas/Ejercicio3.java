package EstructurasAlternativas;

import java.util.Scanner;

public class Ejercicio3 {
    /*
        Crea un programa que pida al usuario dos números y muestre su división si el segundo no es
        cero, o un mensaje de aviso en caso contrario.
     */

    public static void main(String[] args) {
        double numero1, numero2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Cual es el 1er numero?: ");
        numero1 = sc.nextDouble();
        System.out.println("Escribe el segundo numero: ");
        numero2 = sc.nextDouble();

        if (numero2 != 0){
            System.out.printf("El resultado de %.2f / %.2f es: %.2f", numero1, numero2, numero1 / numero2);
        } else {
            System.out.println("No se puede dividir por 0!!");
        }
    }
}
