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

    static void initialize(char[][] tablero){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '-';
            }
        }
    }

    static void printTablero(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void add(char[][] tablero, int row, int col, int player) {
        char icon = player == 1 ? 'X' : 'O';
        tablero[row][col] = icon;
    }

    public static void main(String[] args) {
        int col, row;
        Scanner sc = new Scanner(System.in);
        char tablero[][] = new char[3][3];


        System.out.println("Escribe las coordenadas de tu ficha [X,X]");
        System.out.print("[");
        col = Integer.parseInt(sc.nextLine());
        System.out.print(",");
        row = Integer.parseInt(sc.nextLine());
        System.out.print("]");
        System.out.println();


        initialize(tablero);
        printTablero(tablero);

        add(tablero, row, col, 1);
        printTablero(tablero);
    }

}
