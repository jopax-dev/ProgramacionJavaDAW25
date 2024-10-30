package EjerciciosTema2.EjerciciosEquipo;

import java.util.Scanner;

public class Ejercicio3 {
    /*
        Marcus Cubitus y Julius Humerus, dos legionarios romanos aficionados a los dados y
        habituales de estos exámenes, han ideado un nuevo juego. Primero se decide cuántos
        turnos va a tener la partida (uno por lo menos, lógicamente). En cada turno, cada uno
        tira un dado. Si ambos dados son pares o si ambos son impares, Cubitus se apunta la
        suma de los dos valores. Si un dado es par y el otro impar, los puntos se los lleva
        Humerus. El ganador es el que ha obtenido más puntos.
     */

    public static int tirarDado(){
        return (int) (Math.random() * 13 + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rondas = 0;


        while (rondas == 0) {
            System.out.println("Cuantas rondas quieres jugar?");
            try {
                rondas = Integer.parseInt(sc.nextLine());
                if(rondas < 1) throw new Exception("Tienen que jugar minimo 1 ronda");
            } catch (NumberFormatException e) {
                System.out.println("Introduce un numero valido");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                rondas = 0;
            }
        }

        int totalCubitus = 0;
        int totalHumerus = 0;
        String gana = "";

        for (int i = 1; i <= rondas; i++) {

            int tiradaCubitus = tirarDado();
            int tiradaHumerus = tirarDado();

            if((tiradaCubitus % 2 == 0 && tiradaHumerus % 2 == 0) || (tiradaCubitus % 2 != 0 && tiradaHumerus % 2 != 0) ){
                totalCubitus += tiradaCubitus + tiradaHumerus;
                gana = "Cubitus";
            } else {
                gana = "Humerus";
                totalHumerus += tiradaCubitus + tiradaHumerus;
            }

            System.out.printf("""
                    Ronda %d
                    
                    Tirada cubitus: %d
                    Tirada humerus: %d
                    Gana la ronda: %s
                    
                    Total acumulado cubitus: %d
                    Total acumulado humerus: %d
                                  
                    """, i, tiradaCubitus, tiradaHumerus, gana, totalCubitus, totalHumerus);
        }

        if(totalCubitus > totalHumerus){
            System.out.println("Gana cubitus");
        } else if (totalCubitus < totalHumerus) {
            System.out.println("Gana humerus");
        } else {
            System.out.println("Empate");
        }
    }
}
