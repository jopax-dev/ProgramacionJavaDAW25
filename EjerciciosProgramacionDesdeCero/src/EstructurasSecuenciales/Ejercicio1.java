package EstructurasSecuenciales;

import java.util.Scanner;

public class Ejercicio1 {

    //  Escribir un programa que pregunte al usuario su nombre, y luego lo salude.

    public static void main(String[] args) {

        String user = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Como te llamas? ");
        user = sc.nextLine();
        System.out.println("Hola, " + user);
    }
}
