package EjerciciosRepasoT1yT2;

public class Ejercicio04 {
    /*
        Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle for. Házlo
        también con un while.
     */
    public static void main(String[] args) {
        for (int i = 320; i >= 160; i = i - 20 ) {
            System.out.println(i);
        }
        System.out.println("\nAhora con while\n");
        int i = 320;
        while (i >= 160){
            System.out.println(i);
            i -= 20;
        }
    }
}
