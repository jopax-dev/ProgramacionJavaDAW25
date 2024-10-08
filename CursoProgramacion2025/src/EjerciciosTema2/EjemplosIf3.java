package EjerciciosTema2;

public class EjemplosIf3 {
    public static void main(String[] args) {
        /*
            Vida personaje, Magia personaje, escudo especial.
            Si la vida es menor que 50 y no tiene escudo, pinta toma pocion
            si no, si la magia es menor que 50 y no tiene escudo,  pinta toma pocion de magia
            si no, Si vida y magia son menores que 50, tomate algo y corre
         */

        int hp = 49, mana = 50;
        boolean escudo = false;

        if (hp < 50 && !escudo){
            System.out.println("Toma una pocion de vida");
        } else if (mana < 50 && !escudo) {
            System.out.println("Toma una pocion de mana");
        } else if (mana <50 && hp <50) {
            System.out.println("Tomate algo y CORRE!!!!");
        }
//        if (!escudo){
//            if (hp < 50){
//                System.out.println("Toma una pocion de vida");
//            }
//            if (mana < 50){
//                System.out.println("Toma una pocion de mana");
//            }
//        }
//        if (hp < 50 && mana < 50 ) {
//            System.out.println("Tomate algo y CORRE!!!!");
//        }
    }
}
