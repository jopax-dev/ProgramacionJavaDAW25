package EjerciciosTema2.FuncionesYMetodos;

public class EjemploFuncionesMultiplo {
    /*
        Crea una funcion que te diga si un numero es multplo de otro
        Pruebala con dos numeros cualquiera
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

    public static void main(String[] args) {
        int num1 = 20, num2 = 10;
        System.out.println(esMultiplo(num1, num2));
    }

}
