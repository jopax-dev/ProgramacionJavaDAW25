package Introduccion;

import java.util.Scanner;

public class NombreCompleto {

    // Crea un programa que pida por teclado tu nombre y apellidos por separado
    // Tienes que mostrar por pantalla, primero los apellidos, luego una como y por ultimo tu nombre

    public static void main(String[] args) {
        String nombre, apellido1, apellido2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Indica tu nombre:" );
        nombre = sc.nextLine();

        System.out.println("Indica tu primer apellido:" );
        apellido1 = sc.nextLine();

        System.out.println("Indica tu segundo apellido:" );
        apellido2 = sc.nextLine();

        System.out.printf("Tu nombre es %s %s, %s", apellido1, apellido2, nombre);

        sc.close();
    }
}
