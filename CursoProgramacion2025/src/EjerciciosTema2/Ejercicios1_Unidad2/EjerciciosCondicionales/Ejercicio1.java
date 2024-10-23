package EjerciciosTema2.Ejercicios1_Unidad2.EjerciciosCondicionales;

public class Ejercicio1 {
    /*
        Crea una función (metodo) que reciba como parámetros tres números enteros y devuelva el mayor de
        los tres números. Utilizar esa función para el calcular el mayor de cuatro números enteros.
     */

    public static int mayor(int a, int b, int c) {

       /*
        Se podría hacer con un Math.max(num 1, Math.max(num 2, num 3))
        */

        int mayor;

        if( a >= b){
            mayor = a;
        } else if (b >= c) {
            mayor = b;
        } else {
            mayor = c;
        }
        return mayor;
    }

    public static int mayor(int a, int b){
        return mayor(a,b,0);
    }

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        int num3 = 8;
        int num4 = 7;

        int numMayor = mayor(num1, num2, num3);
        numMayor = mayor(numMayor, num4);

        System.out.printf("El mayor de %d, %d, %d y %d es %d", num1, num2, num3, num4, numMayor);
    }
}
