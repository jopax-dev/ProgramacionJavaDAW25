package EjerciciosTema2.EjerciciosEquipo;

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

    public static void main(String[] args) {
        int dado1Cubitus = tiradaDados(); // 10
        int dado2Cubitus = tiradaDados(); // 10
        int dado3Cubitus = tiradaDados(); // 5
        int dado4Cubitus = tiradaDados(); // 8
        int dado5Cubitus = tiradaDados(); // 1

        int dado1Humerus = tiradaDados(); // 13
        int dado2Humerus = tiradaDados(); // 5
        int dado3Humerus = tiradaDados(); // 1
        int dado4Humerus = tiradaDados(); // 2
        int dado5Humerus = tiradaDados(); // 9

        int mayorCubitus = maximoTirada(dado1Cubitus, dado2Cubitus, dado3Cubitus, dado4Cubitus, dado5Cubitus);
        int mayorHumerus = maximoTirada(dado1Humerus, dado2Humerus, dado3Humerus, dado4Humerus, dado5Humerus);
        int menorCubitus = minimoTiradas(dado1Cubitus, dado2Cubitus, dado3Cubitus, dado4Cubitus, dado5Cubitus);
        int menorHumerus = minimoTiradas(dado1Humerus, dado2Humerus, dado3Humerus, dado4Humerus, dado5Humerus);

        System.out.printf("%d %d %d %d %d\n",dado1Cubitus, dado2Cubitus, dado3Cubitus, dado4Cubitus, dado5Cubitus);
        System.out.println("Mayor cubitus " + mayorCubitus);
        System.out.println("Menor cubitus " + menorCubitus);
        System.out.println();
        System.out.printf("%d %d %d %d %d\n",dado1Humerus, dado2Humerus, dado3Humerus, dado4Humerus, dado5Humerus);
        System.out.println("Mayor humerus " + mayorHumerus);
        System.out.println("Menor humerus " + menorHumerus);

    }

}
