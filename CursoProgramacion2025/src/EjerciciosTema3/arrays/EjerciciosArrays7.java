package EjerciciosTema3.arrays;

public class EjerciciosArrays7 {
    /*
        7. Genera un vector de 100 elementos enteros entre 1 y 100 aleatorios.
        Dime la moda del vector, es decir, el número que más veces se repite.
     */

    public static int aleatorio(){
        return (int) (Math.random() * 100 + 1);
    }

    public static int max(int num[]){
        int max = num[0];
        int index = 0;
        for (int i = 0; i < num.length ; i++) {
            if (max < num[i]){
                max = num[i];
                index = i;
            }

        }
        return index;
    }

    public static void main(String[] args) {
        int numeros[] = new int[100];
        int repetidos[] = new int[numeros.length];

        for (int i = 0; i < numeros.length ; i++) {
            numeros[i] = aleatorio();
        }

        for (int numero = 1; numero <= numeros.length ; numero++) {
            for (int indice = 0; indice < numeros.length; indice++ ){
                if(numeros[indice] == numero)
                    repetidos[numero - 1]++;
            }
        }
        System.out.println("numeros");
        for (int i = 0; i < numeros.length; i++) {

            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        System.out.println("repetidos");
        for (int i = 0; i < repetidos.length; i++) {

            System.out.print(repetidos[i] + " ");
        }

        System.out.println();
        System.out.println("La moda es: "+ (max(repetidos) + 1));


    }
}
