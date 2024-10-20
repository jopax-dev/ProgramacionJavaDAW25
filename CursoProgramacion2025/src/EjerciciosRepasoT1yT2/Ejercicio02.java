package EjerciciosRepasoT1yT2;

public class Ejercicio02 {
    /*  Realiza un programa que genere 20 números aleatorios entre 1 y 200, que diga cuántos números pares
        han salido y cuántos impares.
     */

    public static void main(String[] args) {
        int par = 0, num;
        for (int i = 1; i <= 20; i++) {
            num = (int) (Math.random() * 200 + 1);
            System.out.println(num);
            par = num % 2 == 0 ? par +1 : par;
        }

        System.out.printf("Han salido %d numeros pares", par);
    }
}
