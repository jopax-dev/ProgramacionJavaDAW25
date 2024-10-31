package EjerciciosTema2.EjerciciosEquipo;

import java.util.Scanner;

public class Ejercicio2Mejorado {
    /*
        Marcus Cubitus y Julius Humerus son dos legionarios que se entretienen en sus ratos
        libres jugando a juegos de dados, el pasatiempo favorito de los antiguos romanos. Un
        juego que pudieron haber jugado estos amigos consiste en tirar cada jugador cinco
        dados. La puntuación es la suma total de puntos, sin contar los valores que coincidan
        con el mínimo o el máximo obtenido. El jugador que saca más puntos gana la partida.
        Escriba un programa que simule varias partidas seguidas de este juego de dados.


        Reglas:
            - 5 dados
            - No cuentan mayores iguales ni menores iguales
            - Se suman el resto de dados

        Mejoras:
            - Control de errores
            - Refactorizaciones (sin arrays)
     */

    public static int tiradaDados(){
        return (int) (Math.random() * 13 + 1);
    }

    public static int menor(int num1, int num2){
        return num1 < num2 ? num1 : num2;
    }

    public static int mayor(int num1, int num2){
        return num1 > num2 ? num1 : num2;
    }

    public static int suma(int dado1, int dado2, int dado3, int dado4, int dado5, int mayor, int menor){
        int total = 0;

        if (dado1 != mayor && dado1 != menor) total += dado1;
        if (dado2 != mayor && dado2 != menor) total += dado2;
        if (dado3 != mayor && dado3 != menor) total += dado3;
        if (dado4 != mayor && dado4 != menor) total += dado4;
        if (dado5 != mayor && dado5 != menor) total += dado5;

        return total;
    }

    public static int sumaTiradas(int tirada1,
                                  int tirada2,
                                  int tirada3,
                                  int tirada4,
                                  int tirada5){
        int mayor = mayor(mayor(tirada1,mayor(tirada2, tirada3) ), mayor(tirada4, tirada5));
        int menor = menor(menor(tirada1, menor(tirada2, tirada3)), menor(tirada4, tirada5));

        return suma(tirada1, tirada2, tirada3, tirada4, tirada5, mayor, menor);
    }

    public static int tirada(){
        int dado1 = tiradaDados();
        int dado2 = tiradaDados();
        int dado3 = tiradaDados();
        int dado4 = tiradaDados();
        int dado5 = tiradaDados();

        return sumaTiradas(dado1, dado2, dado3, dado4, dado5);
    }

    public static void ganador(int victoriasJ1, int victoriasJ2){
        if(victoriasJ1 > victoriasJ2){
            System.out.println("gana cubitus");
        } else if (victoriasJ1 < victoriasJ2) {
            System.out.println("Gana humerus");
        } else {
            System.out.println("empate");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rondas = 0;

        while (rondas < 1) {
            System.out.println("Cuantas rondas quieres jugar?");
            try {
                rondas = Integer.parseInt(sc.nextLine());
                if(rondas < 1) System.out.println("Tienen que jugar minimo 1 ronda");
            } catch (NumberFormatException e) {
                System.out.println("Introduzca un numero");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        int victoriaCubitus = 0;
        int victoriaHumerus = 0;

        for (int i = 1; i <= rondas; i++) {
            int totalCubitus = tirada();
            int totalHumerus = tirada();

            System.out.println("Total cubitus: " + totalCubitus);
            System.out.println("Total Humerus: " + totalHumerus);

            if(totalCubitus > totalHumerus){
                victoriaCubitus++;
            } else if (totalCubitus < totalHumerus) {
                victoriaHumerus++;
            }
        }

        System.out.println("total victorias cubitus: " + victoriaCubitus);
        System.out.println("total victorias humerus: " + victoriaHumerus);

        ganador(victoriaCubitus, victoriaHumerus);
    }
}