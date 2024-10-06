package EstructurasSecuenciales;

import java.util.Scanner;

public class Ejercicio12 {

    /*
        Dos vehículos viajan a diferentes velocidades (v1 y v2) y están distanciados por una distancia
        d. El que está detrás viaja a una velocidad mayor. Se pide hacer un algoritmo para ingresar
        la distancia entre los dos vehículos (km) y sus respectivas velocidades (km/h) y con esto
        determinar y mostrar en que tiempo (minutos) alcanzará el vehículo más rápido al otro.

     */

    public static void main(String[] args) {
        int v1, v2;
        double distancia, tiempo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Que distancia hay entre los 2 vehiculos? (en km): ");
        distancia = sc.nextDouble();

        System.out.println("A que velocidad va el primer vehiculo?");
        v1 = sc.nextInt();

        System.out.println("A que velocidad va el segundo vehiculo?");
        v2 = sc.nextInt();

        tiempo = (distancia / Math.abs(v1 - v2)) * 60;
        System.out.printf("El tiempo es %.0f minutos ",tiempo);
    }
}
