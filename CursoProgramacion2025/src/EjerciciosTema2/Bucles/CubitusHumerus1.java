package EjerciciosTema2.Bucles;

public class CubitusHumerus1 {
    /*
        Dos romanos asediando una ciudad, estan aburridos y se ponen a jugar a los dados

            - Cada uno tira un d20
            - Gana el que saca el dado mayor, o si alguno de ellos saca el 9
            - Juega 1 partida y dime quien gana
     */

    public static void main(String[] args) {
        int dado1, dado2;
        boolean gana1 = false, gana2 = false;

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
                System.out.printf("Gana Cubitus, %d > %d", dado1, dado2);
            } else if (dado2 > dado1) {
                System.out.printf("Gana Humerus, %d > %d", dado2, dado1);
            } else {
                System.out.println("EMPATE con "+ dado1);
            }
        } else {
            if(gana1 && gana2) {
                System.out.println("Los 2 han sacado 9!!");
            }
            if(gana1){
                System.out.println("Cubitus ha sacado un 9");
            } else {
                System.out.println("Humerus ha sacado un 9");
            }


        }
    }
}
