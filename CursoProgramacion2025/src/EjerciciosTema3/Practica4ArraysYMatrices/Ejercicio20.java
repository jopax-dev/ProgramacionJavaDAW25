package EjerciciosTema3.Practica4ArraysYMatrices;

import java.util.Scanner;

public class Ejercicio20 {
    /*
        Vamos a realizar el típico juego del 3 en raya, donde habrá dos jugadores que tengan que hacer el 3
        en raya, los signos serán el X y el O, cuando haya una posición vacía habrá un –

        El tablero de juego, será una matriz de 3×3 de char.

        El juego termina cuando uno de los jugadores hace 3 en raya o si no hay más posiciones que poner.

        Primero juega una posición un jugador y luego el otro.

        El juego debe pedir las posiciones donde el jugador actual quiera poner su marca ( [0,0], [0,1],
        [0,2], [1,0], [1,1], [1,2], [2,0], [2,1], [2,2] ), esta debe ser validada y por supuesto que no
        haya una marca ya puesta.

     */

    /***
     * Inicializa el tablero para que todas las casillas esten vacias ( - )
     * @param tablero
     */
    static void initialize(char[][] tablero){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '-';
            }
        }
    }

    /***
     * Imprime el tablero
     * @param tablero
     */
    static void printTablero(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /***
     * Asigna la ficha al jugador X para el 1 // O para el 2
     * @param player
     * @return
     */
    static char setIcon(int player){
        return player == 1 ? 'X' : 'O';
    }

    /***
     * Comprueba si la casilla esta vacia
     * @param tablero
     * @param coord
     * @return
     */
    static boolean checkEmpty(char[][] tablero, int[] coord){
        return tablero[coord[0]][coord[1]] == '-';
    }

    /***
     * Comprueba si la ficha colocada pertenece al jugador
     * @param tablero
     * @param coord
     * @param player
     * @return
     */
    static boolean checkPlayerToken(char[][] tablero, int[] coord, int player) {
        return tablero[coord[0]][coord[1]] == setIcon(player);
    }

    /***
     * Añade una ficha si la casilla esta vacia
     * Si no, indica que jugador tiene ya una ficha colocada ahi y lo imprime
     * @param tablero
     * @param coord
     * @param player
     */
    static boolean checkAdd(char[][] tablero, int[] coord, int player) {
        if(checkEmpty(tablero, coord)){
            add(tablero, coord, setIcon(player));
            return true;
        }

        if(checkPlayerToken(tablero, coord, player)){
            System.out.println("Ya has colocado una pieza ahi");
        } else{
            System.out.println("El otro jugador ya ha colocado ahi una pieza");
        }
        printTablero(tablero);
        return false;
    }

    /***
     * Añade la ficha a las coordenadas indicadas
     * @param tablero
     * @param coord
     * @param icon
     */
    static void add(char[][] tablero, int[] coord, char icon) {
        tablero[coord[0]][coord[1]] = icon;
    }

    /***
     * Se comprueba si hay ganador en diagonal
     * @param tablero
     * @return
     */
    static boolean checkDiagonal(char[][] tablero){
        return (tablero[0][0] == tablero[1][1]
                && tablero[1][1] == tablero[2][2]
                && tablero[2][2] != '-')
                || (tablero[2][0] == tablero[1][1]
                && tablero[1][1] == tablero[0][2]
                && tablero[0][2] != '-');
    }

    /***
     * Se comprueba si hay ganador en horizontal o vertical
     * @param tablero
     * @return
     */
    static boolean checkRowCols(char[][] tablero){
        for (int i = 0; i < tablero.length; i++) {
            if(tablero[i][0] == tablero[i][1]
            && tablero[i][0] == tablero[i][2]
            && tablero[i][0] != '-'){
                return true;
            }
            if(tablero[0][i] == tablero[1][i]
            && tablero[0][i] == tablero[2][i]
            && tablero[0][i] != '-'){
                return true;
            }
        }
        return false;
    }

    /***
     * Se sigue el flujo de la ronda, se pregunta por las coordenadas, se comprueba, se añade si procede y
     * se comprueba si hay ganador
     * @param tablero
     * @param player
     */
    static boolean rondaJugador(char[][] tablero, int player) {
        Scanner sc = new Scanner(System.in);
        int coord[] = new int[2];
        String coords;

        printTablero(tablero);

        do {
            do {
                try{
                    System.out.println("Escribe las coordenadas de tu ficha fila,columna");
                    System.out.println("Las filas y las columnas van del 0 al 2 [X,Y]");
                    coords = sc.nextLine();
                    coord[0] = Integer.parseInt(coords.split(",")[0]);
                    coord[1] = Integer.parseInt(coords.split(",")[1]);
                } catch (Exception e){
                    System.out.println(e.getMessage());
                }
            } while ((coord[0] > 2 || coord[0] < 0) || (coord[1] > 2 || coord[1] < 0)) ;
        } while (!checkAdd(tablero, coord, player));


        if(checkDiagonal(tablero) || checkRowCols(tablero)){
            System.out.println("Gana el jugador " + player);
            return true;
        }

        return false;
    }

    /***
     * Comprueba si queda alguna casilla vacia
     * @param tablero
     * @return
     */
    static boolean checkEmptyField(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if(tablero[i][j] == '-'){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char tablero[][] = new char[3][3];
        boolean winner = false;

        initialize(tablero);

        for (int ronda = 1; ronda <= 5; ronda++) {
            System.out.println("Jugador X");
            if(rondaJugador(tablero, 1)){
                winner = true;
                break;
            }

            if(!checkEmptyField(tablero))
                break;

            System.out.println("Jugador O");
            if (rondaJugador(tablero, 2)) {
                winner = true;
                break;
            }
        }

        printTablero(tablero);
        if(!winner)
            System.out.println("Empate");
    }
}