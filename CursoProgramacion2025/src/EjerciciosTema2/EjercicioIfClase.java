package EjerciciosTema2;

import java.util.Scanner;

public class EjercicioIfClase {
    /*
        Pedir por teclado la hora del dia
        de 6 a 12 -> Buenos dias
        de 12 a 20 -> Buenas tardes
        En otro caso -> buenas noches

        Pedir nivel del jugador
        lvl 1 - 5
            1.- iniciado
            2.- Amateur
            3.- Profesional
            4.- Experto
            5.- Dios
     */

    public static void main(String[] args) {
        int nivel, hora;
        String saludo = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Indica la hora: ");
        hora = sc.nextInt();

        System.out.println("Cual es tu nivel? ");
        nivel = sc.nextInt();

        if (hora >= 6 && hora <= 12){
            saludo = "Buenos dias ";
        } else if ( hora > 12 && hora < 20) {
            saludo = "Buenas tardes ";
        } else{
            saludo = "Buenas noches ";
        }

        if (nivel == 1){
            saludo += "jugador de nivel iniciado";
        } else if (nivel == 2) {
            saludo += "jugador de nivel amateur";
        } else if (nivel == 3) {
            saludo += "jugador de nivel profesional";
        } else if (nivel == 4) {
            saludo += "jugador de nivel experto";
        } else{
            saludo += "jugador de nivel dios";
        }

        System.out.println(saludo);
    }
}
