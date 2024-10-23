package EjerciciosTema2.Bucles;

import java.util.Scanner;

public class EjercicioClase1 {
    /*
        Dados 2 numeros, di cuantos multiplos de 5 hay entre ellos
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, counter = 0, temp;

        System.out.println("Escribe el 1er numero");
        num1 = sc.nextInt();
        System.out.println("Escribe el 2er numero");
        num2 = sc.nextInt();

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        for (int i = num1; i <= num2; i++) {
            if(i % 5 == 0){
                counter++;
            }
        }
        System.out.printf("\nHay %d multiplos de 5", counter);
    }
}
