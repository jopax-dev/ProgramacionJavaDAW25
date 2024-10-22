package EjerciciosTema2.Bucles;

public class CubitusHumerus1 {
    /*
        Dos romanos asediando una ciudad, estan aburridos y se ponen a jugar a los dados

            - Cada uno tira un d20
            - Gana el que saca el dado mayor, o si alguno de ellos saca el 9
            - Juega 1 partida y dime quien gana
            - Si juegan 10 partidas di quien gana de los 2
     */

    public static void main(String[] args) {
        int dado1, dado2, vicotriasC = 0, victoriasH = 0;
        boolean gana1 = false, gana2 = false;
        int numPartidas = 10;

        for (int i = 1; i <= numPartidas ; i++) {
            dado1 = (int) (Math.random() * 20 + 1);
            dado2 = (int) (Math.random() * 20 + 1);

            if ( dado1 == 9){
                gana1 = true;
            }

            if (dado2 == 9) {
                gana2 = true;
            }

            if(!gana1 && !gana2){
                if(dado1 > dado2){
                    vicotriasC++;
                } else if (dado2 > dado1) {
                    victoriasH++;
                }
            } else {
                if(gana1 && !gana2){
                    vicotriasC++;
                } else {
                    victoriasH++;
                }
            }
        }

        System.out.printf("""
                Victorias Cubitus: %d
                Victorias Humerus: %d
                """, vicotriasC, victoriasH);
        if(vicotriasC > victoriasH){
            System.out.println("Gana Cubitus");
        } else if (vicotriasC < victoriasH) {
            System.out.println("Gana Humerus");
        } else {
            System.out.println("Empate!!");
        }

    }
}
