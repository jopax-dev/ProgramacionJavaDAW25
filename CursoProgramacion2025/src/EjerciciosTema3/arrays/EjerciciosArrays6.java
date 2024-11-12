package EjerciciosTema3.arrays;

public class EjerciciosArrays6 {
    // 6. Genera un vector de 20 elementos enteros y rellénalo con los 20 primeros números primos.
    public static boolean esPrimo(int num){
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int numerosPrimos[] = new int[20];
        int contador = 0;
        int num = 1;

        while (contador < numerosPrimos.length){
            if(esPrimo(num)){
                numerosPrimos[contador] = num;
                contador++;
            }
            num++;
        }

        for(int i = 0; i < numerosPrimos.length ; i++) {
            System.out.println(numerosPrimos[i]);
        }
    }
}
