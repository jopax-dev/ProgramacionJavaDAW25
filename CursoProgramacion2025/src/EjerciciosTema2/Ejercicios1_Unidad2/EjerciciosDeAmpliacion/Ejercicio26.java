package EjerciciosTema2.Ejercicios1_Unidad2.EjerciciosDeAmpliacion;

import java.util.Scanner;

public class Ejercicio26 {
    /*
        Sistema de numeración “palotes”
        Crea una función con la siguiente cabecera:
        public static void convierteEnPalotes(int n) {...}
        Esta función recibe un parámetro de entrada de tipo entero e imprime por pantalla una cadena de
        caracteres con la conversión del número n al sistema de palotes.
        Por ejemplo:
        El número 470213 (en decimal) se convierte en:
        | | | | - | | | | | | | - - | | - | - | | |
        en el sistema de palotes.
        Fíjate en la representación del número 0 y realiza diferentes pruebas con el 0 situado en la primera
        posición, en una posición intermedia y en la posición final del número.
        El número 2130 (en decimal) se convierte en:
        | | - | - | | | - -
        en el sistema de palotes.
        Utiliza esta función en un programa para comprobar que funciona correctamente.
     */

    public static void convierteEnPalotes(int n) {
        String numCaracteres = Integer.toString(n);

        for (int i = 0; i < numCaracteres.length(); i++) {
            for (int j = 0; j < Character.getNumericValue(numCaracteres.charAt(i)); j++) {

                System.out.print("|");
            }

            if( i < numCaracteres.length()-1) {
                System.out.print("-");
            } else if (Character.getNumericValue(numCaracteres.charAt(i)) == 0) {
                System.out.print("-");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el numero a convertir");
        int num = Integer.parseInt(sc.nextLine());
        convierteEnPalotes(num);
    }
}
