package EjerciciosTema2.Ejercicios1_Unidad2.EjerciciosDeAmpliacion;

import java.util.Scanner;

public class Ejercicio25 {
    /*
        Marcus Cubitus y Julius Humerus se encuentran en racha y prueban un juego nuevo. Una partida de
        este juego consiste en varios turnos. En cada uno de ellos, un jugador tira cuatro dados y el otro
        jugador tira solo uno.

        Si el segundo jugador saca un valor distinto a los del primero, gana un punto,
        pero si saca alguno de los valores sacados por el primero, es el primer jugador quien gana un punto.
        Escriba un programa que muestre una partida de este juego, detallando quién gana el punto en cada
        turno y la puntuación final de cada jugador.
     */

    public static int tirarDados(int caras){
        return (int) (Math.random() * caras + 1);
    }

    public static boolean ronda(String ronda, String jugador1, String jugador2){
        int carasDados = 6;
        int tiradaUnDado = tirarDados(carasDados);
        int tirada;
        boolean distintos = true;

        System.out.println("Ronda: " + ronda);
        System.out.printf("Tirada de %s", jugador1);
        for (int i = 1; i <= 4; i++) {
            tirada = tirarDados(carasDados);
            System.out.printf("\nDado %d de 4: %d", i, tirada);
            if (tiradaUnDado == tirada) { distintos = false; }
        }

        System.out.printf("\nTirada de %s: %d", jugador2, tiradaUnDado);
        System.out.print("""
                
                ##################
                """);
        if(distintos){
            System.out.println(jugador2 + " gana la ronda");
        } else {
            System.out.println(jugador1 + " gana la ronda");
        }
        System.out.println();
        return distintos;
    }

    public static void main(String[] args) {
        int victoriasCubitus = 0, victoriasHumerus = 0;
        int rondas;
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas rondas van a jugar?");
        try{
            rondas = Integer.parseInt(sc.nextLine());

            if (rondas < 1) throw new Exception("Tienen que jugar minimo 1 ronda");

            for (int i = 1; i <= rondas; i++) {
                if(i % 2 == 0){
                    if(ronda(Integer.toString(i), "Cubitus", "Humerus")){
                        victoriasHumerus += 1;
                    } else {
                        victoriasCubitus += 1;
                    }
                } else {
                    if(ronda(Integer.toString(i), "Humerus", "Cubitus")){
                        victoriasCubitus += 1;
                    } else {
                        victoriasHumerus += 1;
                    }
                }
            }
            System.out.println("Fin de la partida");
            System.out.println("Cubitus: " + victoriasCubitus + " - Humerus: " + victoriasHumerus);
            if(victoriasCubitus > victoriasHumerus){
                System.out.println("Gana Cubitus");
            } else if (victoriasCubitus < victoriasHumerus) {
                System.out.println("Gana Humerus");
            } else {
                System.out.print("""
                        
                        Empate!
                        Quieres jugar una ronda de desempate?
                        """);
                String desempate = sc.nextLine().toLowerCase();
                if(desempate.equals("si")) ronda("De desempate", "Cubitus", "Humerus");
            }

        } catch (NumberFormatException e){
            System.out.println("Escribe un numero");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
