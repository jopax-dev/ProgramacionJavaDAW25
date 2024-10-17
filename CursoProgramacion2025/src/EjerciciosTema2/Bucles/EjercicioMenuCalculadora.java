package EjerciciosTema2.Bucles;

import java.util.Scanner;

public class EjercicioMenuCalculadora {

    public static void main(String[] args) {

        /*
            - Mostrar un menu con las siguientes opciones
                - Sumar
                - Restar
                - Multiplicar
                - Dividir
                - Resto de la division
                - Elevar el 1º al 2º
                - Salir
         */

        int opcion = 0;
        double numero1, numero2;
        Scanner sc = new Scanner(System.in);

        while (opcion != 7){
            System.out.println("\n----------- MENU -----------");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Resto de la division");
            System.out.println("6. Elevar un numero a otro");
            System.out.println("7. Salir");

            System.out.println("\nOpcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion){
                case 1:
                    System.out.println("#### SUMA ####");
                    System.out.print("\nIntroduce el primer numero:");

                    numero1 = Double.parseDouble(sc.nextLine());
                    System.out.print("\nIntroduce el segundo numero:");
                    numero2 = Double.parseDouble(sc.nextLine());

                    System.out.printf("La suma de %.2f y %.2f es %.2f", numero1, numero2, numero1 + numero2);
                    break;
                case 2:
                    System.out.println("#### RESTA ####");
                    System.out.print("\nIntroduce el primer numero:");

                    numero1 = Double.parseDouble(sc.nextLine());
                    System.out.print("\nIntroduce el segundo numero:");
                    numero2 = Double.parseDouble(sc.nextLine());

                    System.out.printf("La resta de %.2f y %.2f es %.2f", numero1, numero2, numero1 - numero2);
                    break;
                case 3:
                    System.out.println("#### MULTIPLICACION ####");
                    System.out.print("\nIntroduce el primer numero:");

                    numero1 = Double.parseDouble(sc.nextLine());
                    System.out.print("\nIntroduce el segundo numero:");
                    numero2 = Double.parseDouble(sc.nextLine());

                    System.out.printf("La multiplicacion de %.2f y %.2f es %.2f", numero1, numero2, numero1 * numero2);
                    break;
                case 4:
                    System.out.println("#### DIVISION ####");
                    System.out.print("\nIntroduce el dividendo:");

                    numero1 = Double.parseDouble(sc.nextLine());
                    System.out.print("\nIntroduce el divisor:");
                    numero2 = Double.parseDouble(sc.nextLine());

                    System.out.printf("La division de %.2f y %.2f es %.2f", numero1, numero2, numero1 / numero2);
                    break;
                case 5:
                    System.out.println("#### RESTO ####");
                    System.out.print("\nIntroduce el dividendo:");

                    numero1 = Double.parseDouble(sc.nextLine());
                    System.out.print("\nIntroduce el divisor:");
                    numero2 = Double.parseDouble(sc.nextLine());

                    System.out.printf("El resto de %.2f / %.2f es %.2f", numero1, numero2, numero1 % numero2);
                    break;
                case 6:
                    System.out.println("#### ELEVAR ####");
                    System.out.print("\nIntroduce la base:");

                    numero1 = Double.parseDouble(sc.nextLine());
                    System.out.print("\nIntroduce el exponente:");
                    numero2 = Double.parseDouble(sc.nextLine());

                    System.out.printf("El resultado de elevar %.2f a la %.2f es %.2f", numero1, numero2, Math.pow(numero1, numero2));
                    break;
                case 7:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("Error: Opcion no valida");

            }

        }

    }
}
