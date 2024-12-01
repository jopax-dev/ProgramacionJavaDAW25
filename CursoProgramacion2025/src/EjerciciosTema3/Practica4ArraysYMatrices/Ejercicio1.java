package EjerciciosTema3.Practica4ArraysYMatrices;

public class Ejercicio1 {
    /*
        Programa Java que guarda en un array 20 números enteros que se generen aleatoriamente entre -100 y
        100. A continuación, se recorre el array y calcula cuántos números son positivos y cuántos negativos.
     */

    static final int min = -100;
    static final int max = 100;

    public static int numAleatorio(int min, int max){
        return (int) (Math.random() * (max - min + 1) ) + min;
    }

    public static void main(String[] args) {
        int numeros[] = new int[20];
        int pos = 0, neg = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numAleatorio(min, max);
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                neg += 1;
            } else {
                pos += 1;
            }
        }

        System.out.printf("Hay %d numeros negativos y %d numeros positivos", neg, pos);
    }
}
