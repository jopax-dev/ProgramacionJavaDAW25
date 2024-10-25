package EjerciciosTema2.Ejercicios1_Unidad2.EjerciciosControlDeExcepciones;

import java.util.Scanner;

public class Ejercicio21 {
    /*
            Pedir un número entero positivo N. A continuación, introducir por teclado N números enteros. Mostrar
            la media de los N números introducidos, el mayor y el menor.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numNumeros, num;
        int mayor = 0, menor = 0, total = 0;

        try {
            System.out.println("Cuantos numeros quieres introducir?");
            numNumeros = Integer.parseInt(sc.nextLine());

            if(numNumeros < 1){
                throw new Exception("El numero total no puede ser menor que 1");
            }

            for (int i = 1; i <= numNumeros; i++){
                System.out.printf("Introduce %d numero ", i);
                num = Integer.parseInt(sc.nextLine());

                if(i == 1){
                    mayor = num;
                    menor = num;
                }

                if ( num > mayor){
                    mayor = num;
                }

                if ( num < menor) {
                    menor = num;
                }

                total += num;

            }

            System.out.printf("""
                    Numero mayor: %d
                    Numero menor: %d
                    Media de los %d numeros = %.2f
                    """, mayor, menor, numNumeros, (double)total / numNumeros);


        } catch (NumberFormatException e) {
            System.out.println("No es un numero valido");
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
