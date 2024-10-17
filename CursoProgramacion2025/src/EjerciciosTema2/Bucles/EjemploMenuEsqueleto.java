package EjerciciosTema2.Bucles;

import java.util.Scanner;

public class EjemploMenuEsqueleto {
    public static void main(String[] args) {

        int opcion = 0;
        Scanner sc = new Scanner(System.in);

        while (opcion != 5){
            System.out.println("\n----------- MENU -----------");
            System.out.println("1. Hacer una cosa");
            System.out.println("2. Hacer otra cosa");
            System.out.println("3. Hacer una cosa diferente");
            System.out.println("4. Hacer lo que diga el profe");
            System.out.println("5. Salir");

            System.out.println("\nOpcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion){
                case 1:
                    System.out.println("#### Opcion 1 ####");
                    break;
                case 2:
                    System.out.println("#### Opcion 2 ####");
                    break;
                case 3:
                    System.out.println("#### Opcion 3 ####");
                    break;
                case 4:
                    System.out.println("O#### Opcion 4 ####");
                    break;
                case 5:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Error: Opcion no valida");

            }

        }

    }
}
