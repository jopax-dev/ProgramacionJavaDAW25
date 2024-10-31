package EjerciciosTema2.EjerciciosEquipo;

import java.util.Scanner;

public class Ejercicio1 {
    /*
        Marcus Cubitus y Julius Humerus son dos legionarios muy aficionados a los juegos de
        dados y que aparecen a menudo en estos exámenes. Esta vez juegan a un juego en el
        que primero se decide cuántos turnos se van a jugar. En cada turno, cada jugador tira
        un dado. Si un jugador saca un valor mayor que el otro, gana los puntos de ambos
        dados. Si los dos jugadores sacan el mismo valor, los puntos de ambos dados se
        acumulan para el siguiente turno. Si en el último turno hay un empate, esos puntos se
        pierden, porque la partida termina. Escriba un programa que muestre una partida de
        este juego, detallando quién gana la partida, quién gana cada turno y la puntuación
        acumulada por cada jugador tras cada turno.
     */

    public static int tiradaDados(){
        return (int) (Math.random() * 13 + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rondas = 0;
        int acumulado = 0;
        int victoriasCubitus = 0; int victoriasHumerus = 0;

        while (rondas == 0){
            System.out.println("Cuantas rondas van a jugar?");
            try {
                rondas = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        for (int i = 1; i <= rondas; i++) {


                int cubitus = tiradaDados();
                int humerus = tiradaDados();

                System.out.printf("""
                        
                        Ronda %d
                        Cubitus: %d
                        Humerus: %d
                        Suma acumulado en esta ronda: %d
                        """, i, cubitus, humerus, acumulado);
                if (cubitus == humerus){
                    if (i != rondas) acumulado += cubitus;
                    System.out.println("Empate, se acumula");
                } else if (cubitus > humerus){
                    victoriasCubitus += cubitus + humerus + acumulado;
                    acumulado = 0;
                    System.out.println("Gana cubitus");
                } else {
                    victoriasHumerus += cubitus + + humerus + acumulado;
                    acumulado = 0;
                    System.out.println("Gana humerus");
                }
        }
        System.out.printf("""
                
                Resultado total:
                Total cubitus: %d
                Total humerus: %d
                """, victoriasCubitus, victoriasHumerus);

        if (victoriasCubitus > victoriasHumerus){
            System.out.println("Gana cubitus");
        } else if (victoriasHumerus > victoriasCubitus){
            System.out.println("Gana humerus");
        } else {
            System.out.println("Empate");
        }
    }

}
