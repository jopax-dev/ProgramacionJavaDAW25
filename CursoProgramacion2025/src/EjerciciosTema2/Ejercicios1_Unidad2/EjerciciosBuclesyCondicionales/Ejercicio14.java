package EjerciciosTema2.Ejercicios1_Unidad2.EjerciciosBuclesyCondicionales;

import java.util.Scanner;

public class Ejercicio14 {
    /*
        Programa que lea dos números positivos e imprima por pantalla todos los números pares que estén entre
        los dos números dados. También debe indicar cuántos números pares hay en ese intervalo.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            int num1, num2, temp,  numPares = 0;
            System.out.println("Escribe el 1er numero");
            num1 = sc.nextInt();
            System.out.println("Escribe el 2er numero");
            num2 = sc.nextInt();

            if(num1 < 1 || num2 < 1) throw new Exception("Los numeros tienen que ser positivos");

            if( num2 > num1){
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
            for (int i = num1; i <= num2; i++) {
                if (i % 2 == 0) {
                    numPares++;
                    System.out.println(i);
                }
            }
            System.out.println("Total de numeros pares: " + numPares);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
