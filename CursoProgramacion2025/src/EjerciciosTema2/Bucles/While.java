package EjerciciosTema2.Bucles;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        /*
        // Pinta los numeros pares del 1 al 20

        int num = 1;

        while (num <= 20){
            if ( num % 2 == 0){
                System.out.println(num);
            }
            num++;
        }

        // cuenta atras del 10 al 1

        int num = 10;

        while ( num >= 1) {
            System.out.println(num);
            num--;
        }

        //muestra los numeros que son decenas del 1 al 100

        int num = 1;

        while (num <= 100){
            if(num % 10 == 0){
                System.out.println(num);
            }
            num++;
        }

        //Del 1 al 200 muestra los numeros impares que no sean multiplos de 7
        int num = 1;

        while (num <= 200){
            if ( num % 2 == 1 && num % 7 != 0) {
                    System.out.println(num);
            }
            num++;
        }

        // Pide por teclado una contraseña mientras la longitud sea menor de 8 caracteres
        String password = "1234567";

        Scanner sc = new Scanner(System.in);

        while (password.length() < 8) {
            System.out.println("introduce una contraseña");
            password = sc.nextLine();
        }

        System.out.printf("Tu contraseña tiene %d caracteres", password.length());
*/
        // Pide por teclado una contraseña mientras la longitud sea menor de 10 caracteres
        // y tenga al menos una letra mayuscula

        Scanner sc = new Scanner(System.in);

        String pass = "";

        while (pass.length() < 10 || pass.toLowerCase().equals(pass)){

            System.out.println("Escribe una nueva contraseña");
            pass = sc.nextLine();
        }
        System.out.println(pass);
    }
}
