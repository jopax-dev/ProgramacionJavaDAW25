package IntroduccionALaProgramacion;

import java.util.Scanner;

public class Ejercicio13 {

    /*
    Realiza un programa en Java con una variable entera t la cual contiene un tiempo en segundos y
    queremos conocer este tiempo, pero expresado en horas, minutos y segundos.
     */

    public static void main(String[] args) {
        int t, horas, min;
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos segundos quieres convertir?: ");
        t = sc.nextInt();

        horas = t / 3600;
        min = t % 3600 / 60;
        t = (t % 3600) % 60;

        System.out.println(horas + " horas " + min + " minutos" + " segundos " + t);

    }
}
