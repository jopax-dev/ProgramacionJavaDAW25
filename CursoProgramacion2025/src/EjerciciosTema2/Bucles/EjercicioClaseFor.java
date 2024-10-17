package EjerciciosTema2.Bucles;

import java.util.Scanner;

public class EjercicioClaseFor {
    public static void main(String[] args) {
/*
        // Tira un d6 100 veces y di cuantas veces sale el 6

        int counter = 0;
        for (int i = 1; i <= 100; i++){
            if ( (int) (Math.random() * 6 + 1) == 6) { counter++; }
        }
        System.out.println("Tirada 1");
        System.out.printf("El numero 6 ha salido %d veces\n", counter);

        // Tira un d6 100 veces y di cuantas veces sale el 6, ademas de que porcentaje de tiradas es

        counter = 0;
        for (int i = 1; i <= 100; i++){
            if ( (int) (Math.random() * 6 + 1) == 6) { counter++; }
        }
        System.out.println("Tirada 2");
        System.out.printf("\nEl numero 6 ha salido %d veces, un total de %.2f%%\n", counter, (float)counter);

        // Tira un d6 10000 veces y di cuantas veces sale el 6, ademas de que porcentaje de tiradas es
        counter = 0;
        for (int i = 1; i <= 10000; i++){
            if ( (int) (Math.random() * 6 + 1) == 6) { counter++; }
        }
        System.out.println("Tirada 3");
        System.out.printf("\nEl numero 6 ha salido %d veces, un total de %.2f%%", counter, ((double)counter/100));


        // Suma todos los numeros pares del 1 al 100
        int total = 0;
        for (int i = 1; i <= 100; i++){
            if ( i % 2 == 0) { total += i; }
        }
        System.out.println("Suma total: " + total);
        */

        // Pide 5 precios por teclados y suma el total
        Scanner sc = new Scanner(System.in);
        double total = 0;

        for (int i = 1; i <= 5; i++){
            System.out.printf("Introduce el precio del articulo %d: ", i);
            total += Float.parseFloat(sc.nextLine());
        }
        System.out.printf("Precio total: %.2f€", total);
    }
}
