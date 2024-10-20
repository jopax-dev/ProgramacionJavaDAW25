package EjerciciosRepasoT1yT2;

import java.util.Scanner;

public class Ejercicio07 {
    /*
        Piedra-papel-tijera. Realiza un programa que genere una tirada simulando piedra-papel-tijera. Haz otra
        tirada para otro jugador y di quién de los dos gana. Mejora el programa para que indique el número de
        partidas a jugar y al final indica cuántas partidas ha ganado cada uno
     */

    public static void main(String[] args) {
        int manoJugador, manoMaquina;
        int numPartidas, victoriaJ = 0, victoriaM = 0;
        String ganador;
        String currPH = "", currMH = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas partidas quieres jugar?");
        numPartidas = sc.nextInt();



        for (int i = 0; i < numPartidas; i++) {
            manoJugador = (int) (Math.random() * 3 + 1);
            manoMaquina = (int) (Math.random() * 3 + 1);

            switch (manoJugador){
                case 1:
                    currPH = "Piedra";
                    switch (manoMaquina){
                        case 2:
                            currMH = "Papel";
                            victoriaM++;
                            break;
                        case 3:
                            currMH = "Tijeras";
                            victoriaJ++;
                            break;
                        default:
                            currMH = "Piedra";
                    }
                    break;
                case 2:
                    currPH = "Papel";
                    switch (manoMaquina){
                        case 1:
                            currMH = "Piedra";
                            victoriaJ++;
                            break;
                        case 3:
                            currMH = "Tijeras";
                            victoriaM++;
                            break;
                        default:
                            currMH = "Papel";
                    }
                    break;
                case 3:
                    currPH = "Tijeras";
                    switch (manoMaquina){
                        case 1:
                            currMH = "Piedra";
                            victoriaM++;
                            break;
                        case 2:
                            currMH = "Papel";
                            victoriaJ++;
                            break;
                        default:
                            currMH = "Tijeras";
                    }
                    break;
            }

            System.out.printf("""
                    
                    Ronda %d
                    Jugador %s || Maquina %s""", i + 1, currPH, currMH);
        }
        if (victoriaJ > victoriaM){
            ganador = "Gana el Jugador";
        } else if (victoriaM > victoriaJ) {
            ganador = "Gana la Maquina";
        } else {
            ganador = "Empate";
        }

        System.out.printf("\nResultado despues de %d rondas", numPartidas);
        System.out.printf("\nVictorias jugador %d / Victorias maquina %d\n", victoriaJ, victoriaM);
        System.out.println(ganador);

    }

}
