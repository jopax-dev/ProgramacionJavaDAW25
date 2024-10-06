package IntroduccionALaProgramacion;

import java.util.Scanner;

public class Ejercicio12 {

    // Realiza un programa en Java que, dadas dos variables a y b, intercambie los valores de a y b

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el valor de a: ");
        a = sc.nextInt();

        System.out.println("Introduce el valor de b: ");
        b = sc.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.printf("Ahora a vale: %d y b vale %d", a, b);
    }
}
