package EstructurasRepetitivas;

import java.util.Scanner;

public class Ejercicio06 {
    /*
        Una empresa tiene el registro de las horas que trabaja diariamente un empleado durante la
        semana (seis días) y requiere determinar el total de éstas, así como el sueldo que recibirá
        por las horas trabajadas.
     */
    public static void main(String[] args) {
        int totalHoras = 0;
        double precioHora;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 6; i++){
            System.out.println("Ingresa el numero de horas del dia " + i);
            totalHoras += Integer.parseInt(sc.nextLine());
        }

        System.out.println("A cuanto se paga cada hora?");
        precioHora = Double.parseDouble(sc.nextLine());

        System.out.printf("\nEl trabajador ha trabajado un total de %d horas y cobrará un sueldo de %.2f", totalHoras
                , precioHora * totalHoras);

    }
}
