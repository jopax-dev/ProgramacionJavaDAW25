package EjerciciosTema2.Ejercicios1_Unidad2.EjerciciosdeBucles;

import java.util.Scanner;

public class Ejercicio9 {
    /*
        Crea un metodo que, dado un número entero pasado como parámetro, devuelva cuántos dígitos lo
        forman. P.ej.: el número 54326 consta de 5 dígitos. Pista: cuántas veces se puede dividir entre 10.
     */

    public static int divisiblePorDiez(double numero){
        int digitos = 1;
        while(numero / 10 > 1){
            digitos++;
            numero = numero / 10;
        }
        return digitos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero");
        double numero = sc.nextDouble();
        System.out.printf("El numero %.0f tiene %d digitos", numero, divisiblePorDiez(numero));
    }
}
