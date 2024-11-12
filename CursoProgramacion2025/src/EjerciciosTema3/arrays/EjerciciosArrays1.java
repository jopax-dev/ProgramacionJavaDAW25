package EjerciciosTema3.arrays;

import java.util.Scanner;

public class EjerciciosArrays1 {
    /*
        Ejercicio 1
            - Crea un programa que pida al usuario un numero de mes y diga cuantos dias tiene y el nombre del mes
            debes usar un vector. Para simplificar vamos a suponer que febrero tiene 28 dias
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kb = 0;
        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
                "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int diaMes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while(kb == 0){
            try {
                System.out.println("Introduce un numero de mes");
                kb = Integer.parseInt(sc.nextLine());
                if (kb > 12 || kb < 1) throw new Exception("Introduce un mes valido");
                System.out.printf("El mes %d es %s y tiene %d dias", kb, meses[kb -1 ], diaMes[kb - 1]);

            } catch (NumberFormatException e){
                System.out.println("Numero invalido");
                System.out.println(e.getMessage());
            } catch (Exception e){
                kb = 0;
                System.out.println(e.getMessage());
            }
        }

    }
}
