package EjerciciosTema3.arrays;

import java.lang.reflect.Array;

public class EjerciciosArrays3 {
    /*
        Ejercicio 3
            - Cubitus y Humerus juegan hoy otra vez a los dados. Ambos lanzan dos dados de 6 caras y un dado de 15 caras.
            Si en su tirada Cubitus obtiene un valor mayor en los dados de 6 caras que en el de 15 suma tres puntos al
            total. Si en su tirada Humerus obtiene un valor mayor en el dado de 15 caras que en los de 6, suma 3 puntos en
            total. gana la ronda el que tenga mas puntos. Simula el juego de 100 partidas, guarda los resultados en un
            array y dime cual es la media de la puntuacion de las partidas jugadas y quien ha ganado
     */

    public static int tiradaDados(int caras) {
        return (int) (Math.random() * caras + 1);
    }

    public static boolean puntosExtra(int[] num, boolean mayor){
        int seisCaras = 0;
        for (int i = 0; i < num.length ; i++) {
            if(i < num.length - 1) seisCaras+= num[i];
        }

        if(mayor)
            return seisCaras > num[num.length - 1];
        else
            return seisCaras < num[num.length - 1];
    }

    public static int puntuacionTotal(int[] tiradas, String jugador){
        int puntuacion = 0;

        for (int i = 0; i < tiradas.length; i++) {
            puntuacion += tiradas[i];
            System.out.println("Tirada " + jugador + " => " + tiradas[i]);
        }
        System.out.println("--------");

        if(jugador.equalsIgnoreCase("Cubitus")) {
            if (puntosExtra(tiradas, true))
                puntuacion += 3;
        } else if (jugador.equalsIgnoreCase("Humerus")){
            if (puntosExtra(tiradas, false))
                puntuacion += 3;
        }
        return puntuacion;
    }

    public static void main(String[] args) {
        int mediaCubitus = 0, mediaHumerus = 0;
        int victoriasCubitus = 0, victoriasHumerus = 0;

        int rondas = 100;

        int puntuacionCubitus[] = new int[rondas];
        int puntuacionHumerus[] = new int[rondas];

        for(int i = 0; i < rondas; i++){
            int dadosCubitus[] = {tiradaDados(6), tiradaDados(6), tiradaDados(15)};
            int dadosHumerus[] = {tiradaDados(6), tiradaDados(6), tiradaDados(15)};

            puntuacionCubitus[i] = puntuacionTotal(dadosCubitus, "Cubitus");
            puntuacionHumerus[i] = puntuacionTotal(dadosHumerus, "Humerus");

            mediaCubitus += puntuacionCubitus[i];
            mediaHumerus += puntuacionHumerus[i];

            System.out.println("Ronda " + (i+1));

            if (puntuacionCubitus[i] > puntuacionHumerus[i]) {
                victoriasCubitus++;
                System.out.println("Gana Cubitus");
            }else if (puntuacionCubitus[i] < puntuacionHumerus[i]) {
                victoriasHumerus++;
                System.out.println("Gana Humerus");
            }else{
                System.out.println("Empate");
            }
            System.out.println();

        }

        System.out.println("Media Cubitus: " + (mediaCubitus / 100));
        System.out.println("Media Humerus: " + (mediaHumerus / 100));

        if(victoriasCubitus > victoriasHumerus){
            System.out.printf("Gana Cubitus %d - %d\n", victoriasCubitus, victoriasHumerus);
        } else if (victoriasHumerus > victoriasCubitus) {
            System.out.printf("Gana Humerus %d - %d\n", victoriasHumerus, victoriasCubitus);
        } else {
            System.out.printf("Empate %d - %d\n", victoriasCubitus, victoriasHumerus);
        }
    }
}
