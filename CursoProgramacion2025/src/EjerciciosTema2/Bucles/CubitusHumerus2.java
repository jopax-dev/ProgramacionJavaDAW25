package EjerciciosTema2.Bucles;

public class CubitusHumerus2 {
    /*
        Nuestros 2 romanos juegan a los dados
            - Cada uno tira 2 dados
            - Gana el que la suma de dados sea mayor
            - O gana automaticamente el que saque 2 dados iguales
            - Juega 20 rondas
     */

    public static void main(String[] args) {
        int dado1C, dado2C, dado1H, dado2H, totalCubitus, totalHumerus;
        int victoriasC = 0, victoriasH = 0, empates= 0;
        boolean dobleCubitus, dobleHumerus;
        int totalPartidas = 20;

        for (int i = 1; i <= totalPartidas ; i++) {
            dobleCubitus = false;
            dobleHumerus = false;

            dado1C = (int) (Math.random() * 20 + 1);
            dado2C = (int) (Math.random() * 20 + 1);
            dado1H = (int) (Math.random() * 20 + 1);
            dado2H = (int) (Math.random() * 20 + 1);

            if(dado1C == dado2C){
                dobleCubitus = true;
            }
            if(dado1H == dado2H){
                dobleHumerus = true;
            }

            if(!dobleCubitus && !dobleHumerus){
                totalHumerus = dado1H + dado2H;
                totalCubitus = dado1C + dado2C;

                if(totalHumerus > totalCubitus){
                    victoriasH++;
                } else if (totalHumerus < totalCubitus){
                    victoriasC++;
                } else {
                    empates++;
                }
            } else {
                if(dobleCubitus && dobleHumerus){
                    empates++;
                } else if (dobleHumerus) {
                    victoriasH++;
                } else {
                    victoriasC++;
                }
            }
        }
        System.out.printf("""
                
                Fin del juego!
                ###############################
                Victorias Humerus: %d
                Victorias Cubitus: %d
                Empates: %d
                ###############################
                """, victoriasH, victoriasC, empates);

        if(victoriasC > victoriasH) {
            System.out.println("Gana Cubitus");
        } else if (victoriasH > victoriasC) {
            System.out.println("Gana Humerus");
        } else {
            System.out.println("Empate");
        }
    }
}
