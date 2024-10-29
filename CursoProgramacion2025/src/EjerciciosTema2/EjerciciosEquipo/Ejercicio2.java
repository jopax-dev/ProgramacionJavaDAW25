package EjerciciosTema2.EjerciciosEquipo;

import java.util.Scanner;

public class Ejercicio2 {
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
     */

    public static int tiradaDados(){
        return (int) (Math.random() * 13 + 1);
    }

    public static int maximoTirada(int tirada1, int tirada2, int tirada3, int tirada4, int tirada5){
        int mayor = tirada1;

        if (tirada2 > mayor){
            mayor = tirada2;
        }
        if (tirada3 > mayor) {
            mayor = tirada3;
        }
        if (tirada4 > mayor) {
            mayor = tirada4;
        }
        if (tirada5 > mayor) {
            mayor = tirada5;
        }
        return mayor;
    }

    public static int minimoTiradas(int tirada1, int tirada2, int tirada3, int tirada4, int tirada5){
        int menor = tirada1;

        if (tirada2 < menor){
            menor = tirada2;
        }
        if (tirada3 < menor) {
            menor = tirada3;
        }
        if (tirada4 < menor) {
            menor = tirada4;
        }
        if (tirada5 < menor) {
            menor = tirada5;
        }
        return menor;
    }

    public static int sumaTiradas(int tirada1,
                                  int tirada2,
                                  int tirada3,
                                  int tirada4,
                                  int tirada5){
        int total = 0;
        int mayor = maximoTirada(tirada1, tirada2, tirada3, tirada4, tirada5);
        int menor = minimoTiradas(tirada1, tirada2, tirada3, tirada4, tirada5);

        if(tirada1 != mayor && tirada1 != menor){
            total += tirada1;
        }
        if(tirada2 != mayor && tirada2 != menor){
            total += tirada2;
        }
        if(tirada3 != mayor && tirada3 != menor){
            total += tirada3;
        }
        if(tirada4 != mayor && tirada4 != menor){
            total += tirada4;
        }
        if(tirada5 != mayor && tirada5 != menor){
            total += tirada5;
        }
        return total;
    }

    public static int tirada(){
        int dado1 = tiradaDados();
        int dado2 = tiradaDados();
        int dado3 = tiradaDados();
        int dado4 = tiradaDados();
        int dado5 = tiradaDados();

        return sumaTiradas(dado1, dado2, dado3, dado4, dado5);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas rondas quieres jugar?");
        int rondas = Integer.parseInt(sc.nextLine());
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

        if(victoriaCubitus > victoriaHumerus){
            System.out.println("gana cubitus");
        } else if (victoriaCubitus < victoriaHumerus) {
            System.out.println("Gana humerus");
        } else {
            System.out.println("empate");
        }
    }

}
