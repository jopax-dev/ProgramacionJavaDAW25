package EjerciciosTema2.EjerciciosEquipo;

import java.util.Scanner;

public class Ejercicio4 {
    /*
        Marcus Cubitus y Julius Humerus, los legionarios romanos amantes de los juegos de
        azar, se enzarzan en un nuevo duelo. Primero deciden cuántas partidas van a jugar
        (una por lo menos, lógicamente, pero además que sean impares para que no pueda
        haber empate final). En cada partida, ambos tiran tres dados de 13 caras. Si coincide
        algún valor entre los dados de Cubitus y los de Humeros, gana Cubitus. Si no coincide
        ningún valor, gana Humerus. El ganador es el que ha ganado más partidas.
     */

    public static int tiradaDados(){
        return (int) (Math.random() * 13 + 1);
    }

    public static boolean iguales(){
        boolean iguales = false;
        int cubitus1 = tiradaDados(); int humerus1 = tiradaDados();
        int cubitus2 = tiradaDados(); int humerus2 = tiradaDados();
        int cubitus3 = tiradaDados(); int humerus3 = tiradaDados();

        if(cubitus1 == humerus1 || cubitus1 == humerus2 || cubitus1 == humerus3) iguales = true;
        if(cubitus2 == humerus1 || cubitus2 == humerus2 || cubitus2 == humerus3) iguales = true;
        if(cubitus3 == humerus1 || cubitus3 == humerus2 || cubitus3 == humerus3) iguales = true;

        System.out.printf("""
                    Cubitus: %d %d %d
                    Humerus: %d %d %d
                    """,cubitus1,cubitus2,cubitus3,humerus1, humerus2, humerus3);

        return iguales;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int victoriasCubitus = 0;
        int victoriasHumerus = 0;
        int rondas = 0;

        while (rondas < 1) {
            System.out.println("Introduce un numero de rondas impar");
            try {
                rondas = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un numero valido");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            if (rondas == 0) System.out.println("Tienen que jugar minimo 1 ronda");
            else if (rondas % 2 == 0) rondas = 0;
        }

        for (int i = 1; i <= rondas; i++) {
            if (iguales()) {
                victoriasCubitus++;
            } else {
                victoriasHumerus++;
            }
        }
        System.out.printf("""
                
                Total cubitus: %d
                total humerus: %d
                """, victoriasCubitus, victoriasHumerus);
        if (victoriasCubitus > victoriasHumerus) {
            System.out.println("Gana Cubitus");
        } else {
            System.out.println("Gana Humerus");
        }
    }
}
