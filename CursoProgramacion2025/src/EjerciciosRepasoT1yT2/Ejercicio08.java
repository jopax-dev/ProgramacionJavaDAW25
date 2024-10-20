package EjerciciosRepasoT1yT2;

public class Ejercicio08 {
    /*
        Realiza un programa que pinte los 20 primeros términos de esta serie: 1, -2, 3, -4, 5, -6, …
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 20 ; i++) {
            if( i % 2 == 0){
                System.out.print(i * -1);
            } else {
                System.out.print(i);
            }
            System.out.print(", ");
        }
        System.out.print("...");
    }
}
