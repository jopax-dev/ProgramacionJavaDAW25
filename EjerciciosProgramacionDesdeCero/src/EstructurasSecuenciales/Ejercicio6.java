package EstructurasSecuenciales;

import java.util.Scanner;

public class Ejercicio6 {

//    Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a cuantas
//    horas y minutos corresponde.
//    Por ejemplo: 1000 minutos son 16 horas y 40 minutos.

    public static void main(String[] args) {
        int hora, min, input = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos minutos quieres convertir?: ");
        input = sc.nextInt();
        min = input % 60;
        hora = input / 60;
        System.out.printf("%dh y %dmins", hora, min);
    }
}
