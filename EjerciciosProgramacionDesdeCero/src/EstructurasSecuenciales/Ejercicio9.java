package EstructurasSecuenciales;

import java.util.Scanner;

public class Ejercicio9 {

//    Pide al usuario dos pares de números (x1,y2) y (x2,y2), que representen dos puntos en el
//    plano. Calcula y muestra la distancia entre ellos.

    public static void main(String[] args) {
        int x1, x2, y1, y2;
        double distancia;
        Scanner sc = new Scanner(System.in);

        System.out.println("Indica la primera coordenada X: ");
        x1 = sc.nextInt();

        System.out.println("Indica la primera coordenada Y: ");
        y1 = sc.nextInt();

        System.out.println("Indica la segunda coordenada X: ");
        x2 = sc.nextInt();

        System.out.println("Indica la segunda coordenada Y: ");
        y2 = sc.nextInt();

        distancia = Math.sqrt( Math.pow(x2 - x1,2) + Math.pow(y2 -y1,2));
        System.out.printf("La distancia entre los 2 puntos es: %.0f", distancia);
    }
}
