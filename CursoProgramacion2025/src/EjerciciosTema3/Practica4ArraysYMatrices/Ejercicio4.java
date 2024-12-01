package EjerciciosTema3.Practica4ArraysYMatrices;

import java.util.Scanner;

public class Ejercicio4 {
    /*
        Programa Java para leer la altura de N personas y calcular la altura media. Calcular cuántas
        personas tienen una altura superior a la media y cuántas tienen una altura inferior a la media. El
        valor de N se pide por teclado y debe ser entero positivo
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height, upper = 0, under = 0, arrLength = 0;
        double med = 0;
        int people[];

        while (arrLength < 1){
            System.out.println("De cuantas personas quieres introducir la altura?");
            try{
                arrLength = Integer.parseInt(sc.nextLine());

                if (arrLength < 1) {
                    arrLength = 0;
                    throw new IllegalArgumentException("Tiene que ser un numero mayor que 0");
                }

                people = new int[arrLength];

                for (int i = 0; i < arrLength; i++) {
                    System.out.println("Introduce la altura en cm");
                    try {
                        height = Integer.parseInt(sc.nextLine());
                        if (height < 1) {
                            i--;
                            throw new IllegalArgumentException("Altura no valida, tiene que ser un numero " +
                                    "positivo");
                        }

                        people[i] = height;
                        med += height;


                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }

                }

                med = med/arrLength;

                for (int i = 0; i < arrLength; i++) {
                    if(people[i] >= med){
                        upper++;
                    } else {
                        under++;
                    }
                }


                System.out.printf("Media: %.2f, por encima %d, por debajo %d",med, upper, under);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }

        }

    }
}
