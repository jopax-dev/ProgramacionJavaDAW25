package EjerciciosTema2.Ejercicios1_Unidad2.EjerciciosCondicionales;

public class Ejercicio1 {
    /*
        Crea una función (metodo) que reciba como parámetros tres números enteros y devuelva el mayor de
        los tres números. Utilizar esa función para el calcular el mayor de cuatro números enteros.
     */

    public static int mayor(int a, int b, int c) {

        if( a >= b){
            return a;
        } else if (b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static int mayor(int a, int b, int c, int d){
        return mayor(mayor(a, b, a), mayor(c, d, d), a);
    }

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        int num3 = 8;
        int num4 = 7;

        int numMayor = mayor(num1, num2, num3, num4);

        System.out.printf("El mayor de %d, %d, %d y %d es %d", num1, num2, num3, num4, numMayor);
    }
}
