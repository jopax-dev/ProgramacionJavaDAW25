package EjerciciosTema2.Ejercicios1_Unidad2.EjerciciosControlDeExcepciones;

import java.util.Scanner;

public class Ejercicio23 {
    /*
    .   Pedir el día, mes y año de una fecha y mostrar la fecha del día siguiente (sin años bisiestos). Hacer
        primero una función para determinar que la fecha introducida es correcta.
     */

    public static boolean comprobarFecha(int day, int month) throws Exception {

        if(month < 1 || month > 12){
            throw new Exception("Introduce un mes valido");
        }

        if (day < 1 || day > 31){
            throw new Exception("Has introducido un día no valido");
        }

        switch (month) {
            case 2:
                if (day > 28) throw new Exception("Febrero no tiene tantos días");;
            case 4, 6, 9, 11:
                if (day > 30) throw new Exception("Este mes no tiene 31 días");;
        }

        return true;
    }

    public static void diaSiguiente(int day, int month, int year){

        // Usando el switch como si fuera una funcion flecha de js, asignamos el día max según el mes
        int maxDiaMes = switch (month){
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> 31;
        };

        // usando ese día max, simplemente sumamos dia o vemos si es del mes siguiente. En caso de diciembre,
        // se suma 1 año mas.
        if( day < maxDiaMes) {
            day++;
        } else {
            day = 1;
            if(month < 12) {
                month++;
            } else {
                month = 1;
                year++;
            }
        }

        System.out.printf("El dia siguiente a la fecha introducida es %d-%d-%d", day, month, year);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, year;

        System.out.println("Introduce el dia del mes");
        dia = sc.nextInt();
        System.out.println("Introduce el mes");
        mes = sc.nextInt();
        System.out.println("Introduce el año");
        year = sc.nextInt();

        sc.close();

        try{
            comprobarFecha(dia, mes);
            diaSiguiente(dia, mes, year);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
