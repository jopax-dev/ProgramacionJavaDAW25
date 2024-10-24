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

    public static int lanzarDados(int caras){
        return (int) (Math.random() * caras + 1);
    }

    public static int tiradasImpares(){

        int total = 0;
        for (int i = 1; i <= 4 ; i++) {
            int tirada = lanzarDados(12);
            if(tirada % 2 != 0) total += tirada;

            System.out.printf("Tirada %d: %d \n", i, tirada);
        }

        return total;
    }

    public static int tiradasPares(){
        int total = 0;
        for (int i = 1; i <= 3 ; i++) {
            int tirada = lanzarDados(12);
            if(tirada % 2 == 0) total += tirada;

            System.out.printf("Tirada %d: %d \n", i, tirada);
        }

        return total;
    }
    
    public static void juego(int rondas){
        int victoriasCubitus = 0, victoriasHumerus = 0;
        int tiradaCubitus, tiradaHumerus;
        
        for (int i = 1; i <= rondas; i++){
            System.out.printf("""
                    
                    Ronda %d
                    #################
                    
                    """, i);
            if(i % 2 == 0){
                System.out.println("Cubitus");
                tiradaCubitus = tiradasImpares();

                System.out.println("\nHumerus");
                tiradaHumerus = tiradasPares();
            } else {

                System.out.println("Cubitus");
                tiradaCubitus = tiradasPares();

                System.out.println("\nHumerus");
                tiradaHumerus = tiradasImpares();
            }
            
            if( tiradaCubitus == tiradaHumerus){
                System.out.println("Empate!!");
            } else if (tiradaCubitus > tiradaHumerus) {
                victoriasCubitus++;
                System.out.println("Cubitus gana la ronda");
            } else {
                victoriasHumerus++;
                System.out.println("Humerus gana la ronda");
            }
            System.out.print("""
                    #################
                    """);
        }

        System.out.printf("""
                RESULTADO FINAL
                
                Cubitus: %d
                Humerus: %d
                """, victoriasCubitus, victoriasHumerus);
        if(victoriasCubitus > victoriasHumerus){
            System.out.println("Campeon Cubitus");
        } else if ( victoriasCubitus < victoriasHumerus){
            System.out.println("Campeon Humerus!");
        } else {
            System.out.println("Han empatado!!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas rondas van a jugar?");
        try{
            int rondas = Integer.parseInt(sc.nextLine());
            juego(rondas);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
