package EjerciciosTema3.arrays;

public class Ejercicio3 {
    /*
        Genera un array de 20 numeros aleatorios entre 1 y 1000
        Muestra solo los que sean primos

     */

    public static boolean esPrimo(int num){
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000 + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            if(esPrimo(arr[i]))
                System.out.println(arr[i]);
        }
    }
}
