package EjerciciosTema2;

import java.util.Scanner;

public class EjercicioIfElse2 {
    /*
        // VidaJugador = 0-100
        // VidaMonstruo = 0-50
        // PuntosEspada = 0-50
        // RunaMagica = true/false

        // Es un combate entre el jugador y el monstruo.
        // Gana el jugador si:
        //          - VidaJugador > 50 y PuntosEspada > 30
        //          - VidaJugador < 50 y PuntosEspada > 50
        //          - VidaJugador < 50 y PuntosEspada < 30 y RunaMagica = true

        // Gana el monstruo si:
        //          - Si la vida del jugador es menor de 50 y los puntos
        //          de la espada menor que 50,
        //          O si la vida del jugador es menor de 50 y RunaMagica = false
     */


    public static void main(String[] args) {
        int vidaJugador, puntosEspada, vidaMonstruo;
        boolean runaMagica;

        Scanner sc = new Scanner(System.in);

        System.out.println("Que vida tienes?: ");
        vidaJugador = sc.nextInt();
        System.out.println("Cuantos puntos de espada tienes?: ");
        puntosEspada = sc.nextInt();
        System.out.println("Cuantos puntos de vida tiene el monstruo?: ");
        vidaMonstruo = sc.nextInt();
        System.out.println("Tienes runa equipada?");
        runaMagica = sc.nextBoolean();

        if(!(vidaJugador >= 0 && vidaJugador <= 100)){
            System.out.println("Vida incorrecta, introduce un valor entre [0 - 100]");
        } else if (!(vidaMonstruo >= 0 && vidaMonstruo <= 50)){
            System.out.println("Vida del monstruo incorrecta, introduce un valor entre [0 - 50]");
        } else if (!(puntosEspada >= 0 && puntosEspada <= 50)) {
            System.out.println("Puntos de espada incorrectos, introduce un valor entre [0 - 50]");
        } else {
            if ((vidaJugador > 50 && puntosEspada > 30)
                    || (vidaJugador < 50 && puntosEspada >= 50)
                    || (vidaJugador < 50 && puntosEspada < 30 && runaMagica)) {
                System.out.println("El jugador gana");
            } else {
                if ((vidaJugador < 50 && puntosEspada < 50) || (vidaJugador <= 50 && !runaMagica)) {
                    System.out.println("Gana el monstruo");
                } else {
                    System.out.println("Resultado no contemplado");
                }
            }
        }
    }
}
