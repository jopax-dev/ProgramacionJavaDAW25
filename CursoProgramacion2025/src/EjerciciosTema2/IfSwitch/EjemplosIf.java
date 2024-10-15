package EjerciciosTema2.IfSwitch;

public class EjemplosIf {

    public static void main(String[] args) {
        /*
            Un personaje tiene vida y tiene mana
            Si la vida es menor que 50, pinto que tiene que tomar picion de vida
            Si el mana es menor que 50, pinto que tiene que tomar pocion de magia
            Si la vida es menor que 50 y el mana es menor que 50, pinta "CORRE"
         */

        int hp = 50, mana= 33;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Indica la vida del pj: ");
//        hp = sc.nextInt();

        if (hp <= 50){
            System.out.println("Toma una pocion de vida");
        }
        if (mana <= 50){
            System.out.println("Toma una pocion de mana");
        }
        if (hp <= 50 && mana <= 50){
            System.out.println("CORRE!!");
        }
    }
}
