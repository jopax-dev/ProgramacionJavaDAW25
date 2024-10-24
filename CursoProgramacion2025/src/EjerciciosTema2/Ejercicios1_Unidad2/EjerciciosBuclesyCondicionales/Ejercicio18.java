package EjerciciosTema2.Ejercicios1_Unidad2.EjerciciosBuclesyCondicionales;

import java.util.Scanner;

public class Ejercicio18 {
    /*
        Marcus Cubitus y Julius Humerus, legionarios apasionados por los juegos de dados, aprovechan los días
        cada vez más largos del mes de Iunius para probar nuevos juegos. En este juego, en cada turno un jugador
        lanza cuatro dados y se anota la suma de los valores impares obtenidos, mientras que el otro jugador
        lanza tres dados y se anota la suma de los valores pares obtenidos. Gana el turno el jugador que obtenga
        más puntos y gana la partida el jugador que haya ganado más turnos.
     */

    /**
     * Metodo para tirar simular tirada de dados de N caras y devuelve el valor obtenido
     * @param caras de cuantas caras será el dado que tiramos
     * @return random
     */
    public static int lanzarDados(int caras){
        return (int) (Math.random() * caras + 1);
    }

    /**
     * Se tiran 4 dados y se suman las tiradas impares
     * @return suma total de dados impares
     */
    public static int tiradasImpares(int dados){

        int total = 0;
        for (int i = 1; i <= dados ; i++) {
            int tirada = lanzarDados(12);
            if(tirada % 2 != 0) total += tirada;

            System.out.printf("Tirada %d: %d \n", i, tirada);
        }

        return total;
    }

    /**
     * Se tiran 3 dados y se suman las tiradas pares
     * @return suma total de dados pares
     */

    public static int tiradasPares(int dados){
        int total = 0;
        for (int i = 1; i <= dados ; i++) {
            int tirada = lanzarDados(12);
            if(tirada % 2 == 0) total += tirada;

            System.out.printf("Tirada %d: %d \n", i, tirada);
        }

        return total;
    }

    /**
     * Jugamos una ronda. Imprimimos texto de control.
     * Se intercambia quien tira 3 o 4 dados en funcion de si la ronda es par o impar
     * Se comprueba quien ha sacado la suma mayor siguiendo las reglas y se actualiza el
     * contador de victorias
     * @param ronda -> contador para saber en qué ronda estamos y filtrar quien tira cuantos dados
     * @param victoriasPlayer1 -> Array para poder actualizar las victorias por referencia
     * @param victoriasPlayer2 -> Array para poder actualizar las victorias por referencia
     * @param textoRonda -> Texto específico para alguna ronda. Se usa para pasar texto de desempate
     * @param dadosImpar -> Numero de dados a tirar para la suma de impares
     * @param dadosPar -> Numero de dados a tirar pa la suma de pares
     */
    public static void ronda(
            int ronda,
            int[] victoriasPlayer1,
            int[] victoriasPlayer2,
            String textoRonda,
            int dadosImpar,
            int dadosPar
    ){
        int tiradaCubitus, tiradaHumerus;
        if(textoRonda.isEmpty()){
            System.out.printf("""
                    
                    Ronda %d
                    ####################
                    
                    """, ronda);
        } else {
            System.out.printf("""
                    
                     %s
                    ####################
                    
                    """, textoRonda);
        }

        if(ronda % 2 == 0){
            System.out.println("Tiradas Cubitus");
            tiradaCubitus = tiradasImpares(dadosImpar);

            System.out.println("\nTiradas Humerus");
            tiradaHumerus = tiradasPares(dadosPar);
        } else {

            System.out.println("Tiradas Cubitus");
            tiradaCubitus = tiradasPares(dadosPar);

            System.out.println("\nTiradas Humerus");
            tiradaHumerus = tiradasImpares(dadosImpar);
        }
        System.out.printf("\n %d - %d\n",tiradaCubitus, tiradaHumerus);

        if( tiradaCubitus == tiradaHumerus){
            System.out.println("Empate!!");
        } else if (tiradaCubitus > tiradaHumerus) {
            victoriasPlayer1[0]++;
            System.out.println("Cubitus gana la ronda");
        } else {
            victoriasPlayer2[0]++;
            System.out.println("Humerus gana la ronda");
        }
        System.out.print("""
                    ####################
                    """);
    }

    /**
     * Pasando las victorias de ambos jugadores se muestra por pantalla el ganador
     * En caso de empate, se da la opcion de jugar una ronda extra
     * @param victoriasPlayer1 acumulador de victorias jugador 1
     * @param victoriasPlayer2 acumulador de victorias jugador 2
     */
    public static void victoria(int[] victoriasPlayer1, int[] victoriasPlayer2){

        Scanner sc = new Scanner(System.in);
        if(victoriasPlayer1[0] > victoriasPlayer2[0]){
            System.out.println("Campeon Cubitus");
        } else if ( victoriasPlayer1[0] < victoriasPlayer2[0]){
            System.out.println("Campeon Humerus!");
        } else {
            System.out.println("Han empatado!!");
            System.out.println("Quieres jugar la ronda de desempate??");
            if(sc.nextLine().equalsIgnoreCase("si")){
                System.out.println("Se jugara 1 ronda extra tirando 4 dados, uno suma pares el otro impares");
                victoriasPlayer1[0] = 0;
                victoriasPlayer2[0] = 0;
                ronda(1, victoriasPlayer1, victoriasPlayer2, "MUERTE SúBITA", 4, 4);
                victoria(victoriasPlayer1, victoriasPlayer2);
            } else {
                System.out.println("Ambos se dan la mano y van a tomarse una jarra de Mulsum  ");
            }
        }
    }

    /**
     * En funcion del número de rondas, ejecutamos ronda el número de veces indicado
     * @param rondas cuantas rondas se van a jugar en total
     */
    public static void juego(int rondas){
        /*
            Definimos victorias como arrays de tamaño 1 para asi poder pasarlos como
            referencia al procedimiento de ronda para poder actualizarlo al vuelo
            sin tener que meter ningún return ni utilizar atributos de clase
         */
        int[] victoriasCubitus = {0}, victoriasHumerus = {0};

        
        for (int i = 1; i <= rondas; i++){
            ronda(i, victoriasCubitus, victoriasHumerus, "", 4, 3);
        }

        System.out.printf("""
                RESULTADO FINAL
                
                Cubitus: %d
                Humerus: %d
                """, victoriasCubitus[0], victoriasHumerus[0]);

        victoria(victoriasCubitus, victoriasHumerus);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas rondas van a jugar?");
        try{
            int rondas = Integer.parseInt(sc.nextLine());
            if(rondas < 1) throw new Exception("Tienen que jugar mínimo 1 ronda");
            juego(rondas);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}