package EjerciciosRepasoT1yT2;

public class Ejercicio09 {
    /*
        Realiza un programa que pinte los 50 primeros términos de esta serie: (5n + 2) / n
     */
    public static void main(String[] args) {
        System.out.println("(5n + 2) / n\n");
        for (int i = 1; i <= 50 ; i++) {
            System.out.printf("(5 * %d + 2) / %d = %.2f\n", i, i, (double) (5* i + 2) / i);
        }
    }
}
