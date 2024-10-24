package EjerciciosTema2.FuncionesYMetodos;

public class EjemploFuncionesMultiplosMenores {
    /*
        Devuelve todos los multiplos de un numero
     */

    /**
     * Metodo que devuelve si el segundo numero es multiplo del 1º
     * @param num1
     * @param num2
     * @return true/false
     */
    public static boolean esMultiplo(int num1, int num2){
        return num1 % num2 == 0;
    }

    /**
     * Pinta todos los divisores de un numero
     * @param num
     */
    public static void divisores(int num){
        for (int i = 2; i < num; i++){
            if(esMultiplo(num, i)) System.out.printf("%d ",i);
        }
    }

    public static void main(String[] args) {
        divisores(80);
    }
}
