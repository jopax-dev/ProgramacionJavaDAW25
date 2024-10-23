package EjerciciosTema2.Ejercicios1_Unidad2.EjerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio3 {
    /*
        Programa que lea un número positivo de un dígito por teclado y diga en letra a qué dígito corresponde
        (uno, dos, tres, cuatro, …). Ejemplo: si se introduce el 1, se mostrará por pantalla el “uno”; si se introduce
        el 11, se mostrará el mensaje “Error: no es un número de un dígito”.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero positivo");
        int numero = sc.nextInt();

        if (numero > 9){
            System.out.println("Error: no es un numero de un digito");
        } else if ( numero < 1){
            System.out.println("Error: no es un numero positivo");
        } else {
            switch (numero){
                case 1:
                    System.out.println("uno");
                    break;
                case 2:
                    System.out.println("dos");
                    break;
                case 3:
                    System.out.println("tres");
                    break;
                case 4:
                    System.out.println("cuatro");
                    break;
                case 5:
                    System.out.println("cinco");
                    break;
                case 6:
                    System.out.println("seis");
                    break;
                case 7:
                    System.out.println("siete");
                    break;
                case 8:
                    System.out.println("ocho");
                    break;
                default:
                    System.out.println("nueve");
            }
        }
    }
}
