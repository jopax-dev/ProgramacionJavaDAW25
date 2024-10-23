package EjerciciosTema2.Bucles;

public class EjemploAcumulador2 {
    public static void main(String[] args) {

        // Genera 100 numeros aleatorios entre 1 y 100
        // Muestra la suma de los pares y la suma de los impares

        int par = 0, impar = 0;

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                par += i;
            } else {
                impar += i;
            }
        }
        System.out.printf("Suma de pares: %d \nSuma de impares: %d", par, impar);
    }
}
