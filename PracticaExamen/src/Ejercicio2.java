import java.util.Scanner;

public class Ejercicio2 {
    /*
        Marcus Cubitus y Julius Humerus son dos legionarios que se entretienen en sus ratos
        libres jugando a juegos de dados, el pasatiempo favorito de los antiguos romanos. Un
        juego que pudieron haber jugado estos amigos consiste en tirar cada jugador cinco dados
        de 6 caras. La puntuación es la suma total de puntos, pero hay un bonus de 10 puntos por
        sacar una escalera (1,2,3,4,5 o 2,3,4,5,6) y un bonus de 20 puntos por sacar los cinco
        dados iguales. Hay una penalización de 5 puntos si la suma de los dados es menor de 8. El
        jugador que saca más puntos gana la partida. Escriba un programa que simule varias
        partidas seguidas de este juego de dados.
     */

    public static int tirarDados(){
        return (int) (Math.random() * 6 + 1);
    }

    public static boolean menorOcho(int puntuacion){
        return puntuacion <= 8;
    }

    /***
     * Suma todos los dados y añade los bonificadores y penalizaciones
     * @param dado1
     * @param dado2
     * @param dado3
     * @param dado4
     * @param dado5
     * @return
     */
    public static int sumaDados(int dado1, int dado2, int dado3, int dado4, int dado5){
        int escalera = 0;
        int iguales = 0;
        int menorOcho = 0;
        int suma = dado1 + dado2 + dado3 + dado4 + dado5;

        if(escalera(dado1, dado2, dado3, dado4, dado5)) escalera = 20;
        if(iguales(dado1, dado2, dado3, dado4, dado5)) iguales = 10;
        if(menorOcho(suma)) menorOcho = -5;
        return suma + escalera + iguales + menorOcho;
    }

    /***
     * calculamos el menor
     * @param num1
     * @param num2
     * @return
     */
    public static int menor(int num1, int num2){
        return num1 < num2 ? num1 : num2;
    }

    /***
     * Calculamos el mayor
     * @param num1
     * @param num2
     * @return
     */
    public static int mayor(int num1, int num2){
        return num1 > num2 ? num1 : num2;
    }

    /***
     * Comprobamos si los numeros son consecutivos entre un minimo y un maximo dados
     * @param min
     * @param max
     * @param dado1
     * @param dado2
     * @param dado3
     * @param dado4
     * @param dado5
     * @return
     */
    public static boolean consecutivos(int min, int max, int dado1, int dado2, int dado3, int dado4, int dado5){
        boolean consecutivos = false;
        for (int i = min; i <= max; i++) {
            if(dado1 == i || dado2 == i || dado3 == i || dado4 == i || dado5 == i){
                consecutivos = true;
            } else{
                return false;
            }
        }
        return consecutivos;
    }

    /***
     * Comprobamos si en la tirada hay una escalera, en caso de haber un 1 y un 5 o un 2 y un 6 vemos si son consecutivos
     * @param dado1
     * @param dado2
     * @param dado3
     * @param dado4
     * @param dado5
     * @return
     */
    public static boolean escalera(int dado1, int dado2, int dado3, int dado4, int dado5){

        int numMenor = menor(menor(dado1, dado2), menor(menor(dado3, dado4),dado5));
        int numMayor = mayor(mayor(dado1, dado2), mayor(mayor(dado3, dado4),dado5));

        if(numMenor == 1 && numMayor == 5){
            return consecutivos(2, 4, dado1, dado2, dado3, dado4, dado5);
        } else if (numMenor == 2 && numMayor == 6) {
            return consecutivos(3, 5, dado1, dado2, dado3, dado4, dado5);
        }
        return false;
    }

    /***
     * Comprobamos si todos los numeros son iguales
     * @param dado1
     * @param dado2
     * @param dado3
     * @param dado4
     * @param dado5
     * @return
     */
    public static boolean iguales(int dado1, int dado2, int dado3, int dado4, int dado5){
        return dado1 == dado2
                && dado2 == dado3
                && dado3 == dado4
                && dado4 == dado5;
    }

    /***
     * Se hace la tirada de cada jugador y se muestra por pantalla
     * @param jugador
     * @return
     */
    public static int tirada(String jugador){
        int dado1C = tirarDados();
        int dado2C = tirarDados();
        int dado3C = tirarDados();
        int dado4C = tirarDados();
        int dado5C = tirarDados();
        int total = sumaDados(dado1C, dado2C, dado3C, dado4C, dado5C);
        System.out.printf("Tirada %s: %d %d %d %d %d\n ",jugador, dado1C, dado2C, dado3C, dado4C, dado5C );
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rondas = 0;
        int victoriasCubitus = 0;
        int victoriasHumerus = 0;
        int totalCubitus = 0;
        int totalHumerus = 0;

        while (rondas <= 0){
            try{
                System.out.println("Cuantas rondas van a jugar?");
                rondas = Integer.parseInt(sc.nextLine());

                if(rondas <= 0) throw new Exception("Tienen que jugar minimo 1 ronda");

                for (int i = 1; i <= rondas ; i++) {
                    System.out.println("Ronda " + i);

                    totalCubitus = tirada("Cubitus");
                    System.out.println("Total: "+totalCubitus);

                    totalHumerus = tirada("Humerus");
                    System.out.println("Total: "+totalHumerus);

                    if(totalHumerus > totalCubitus){
                        victoriasHumerus += 1;
                        System.out.println("Humerus gana la ronda");
                    } else if (totalHumerus < totalCubitus) {
                        victoriasCubitus += 1;
                        System.out.println("Cubitus gana la ronda");
                    }
                    System.out.println();
                }

                if(victoriasCubitus > victoriasHumerus){
                    System.out.printf("Gana Cubitus: %d - %d", victoriasCubitus, victoriasHumerus);
                } else if (victoriasCubitus < victoriasHumerus) {
                    System.out.printf("Gana Humerus: %d - %d", victoriasCubitus, victoriasHumerus);
                } else {
                    System.out.println("Empate");
                }
            } catch (NumberFormatException e){
                System.out.println("Numero no valido");
                System.out.println(e.getMessage());
            } catch (Exception e){
                System.out.println(e.getMessage());
            }

        }

    }
}
