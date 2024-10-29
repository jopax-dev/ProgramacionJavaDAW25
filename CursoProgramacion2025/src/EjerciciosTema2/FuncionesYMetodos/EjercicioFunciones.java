package EjerciciosTema2.FuncionesYMetodos;

import java.util.Scanner;

public class EjercicioFunciones {
    /*
        Crea un menu para una calculadora (suma, resta, multiplicar y dividsion) de dos numeros
        1. Suma
        2. Resta
        3. Multiplicar
        4. Dividir
        5. Salir
     */

    public static double operacion(int num1, int num2, int opt){
        switch (opt){
            case 1: return num1 + num2;
            case 2: return num2 - num1;
            case 3: return num1 * num2;
            case 4: return (double) num1 / num2;
        }
        return 0;
    }

    public static void menu() {
        System.out.print("""
                Calculadora:
                1.- Sumar
                2.- Restar
                3.- Multiplicar
                4.- Dividir
                5.- Salir
                
                """);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            menu();

            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                opcion = 6;
            }

            if(opcion < 5) {
                try{
                    System.out.println("Introduce el 1er numero");
                    int num1 = Integer.parseInt(sc.nextLine());
                    System.out.println("Introduce el 2º numero");
                    int num2 = Integer.parseInt(sc.nextLine());
                    System.out.println(operacion(num1, num2, opcion));
                    System.out.println();
                } catch (Exception e) {
                    System.out.println("Error al introducir numeros");
                }
            } else if (opcion == 5) {
                System.out.println("Hasta luego");
            } else {
                System.out.println("Opcion no valida");
            }

        } while (opcion != 5);
    }
}