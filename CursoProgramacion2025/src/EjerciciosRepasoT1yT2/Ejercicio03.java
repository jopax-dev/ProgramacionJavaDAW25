package EjerciciosRepasoT1yT2;

public class Ejercicio03 {
    /*
        Muestra todos los números divisibles entre 7 entre el número 500 y el 1.
     */
    public static void main(String[] args) {
        for ( int i = 500; i > 0; i--) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
