package Introduccion;

import java.util.Scanner;

public class MediaDeNotas {
    public static void main(String[] args) {
        double nota1 = 3;
        double nota2 = 4;
        double nota3 = 7;
        double notaMedia = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Indica la primera nota: ");
        nota1 = sc.nextInt();

        System.out.println("Indica la segunda nota: ");
        nota2 = sc.nextInt();

        System.out.println("Indica la tercera nota: ");
        nota3 = sc.nextInt();
        notaMedia = (nota1 + nota2 + nota3) / 3;

        System.out.println("Nota media = " + notaMedia);


    }
}
