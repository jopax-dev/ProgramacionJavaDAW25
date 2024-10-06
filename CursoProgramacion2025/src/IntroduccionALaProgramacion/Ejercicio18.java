package IntroduccionALaProgramacion;

public class Ejercicio18 {
    /*
        ¿Qué resultados se obtienen al realizar las operaciones siguientes? Si hay errores en la compilación,
        corríjalos y dé una explicación de por qué suceden.
            int a = 10, b = 3 , e = 1, d, e;
            float x, y;
            x= a / b;
            c = a < b && c;
            d = a + b++;
            e = ++a – b;
            y = (float)a / b;
     */

    public static void main(String[] args) {
        // la variable e ya está definida, por lo que da error.
        int a = 10, b = 3 , e = 1, d;
        float x, y;
        x= a / b; // => 3.0 porque son enteros y aunque X sea float, la operacion resultante se redondea a entero
        // la variable c no está definida ni inicializada
        boolean c = true;
        c = a < b && c; // => Siempre saldra falso porque a siempre es mayor que b
        d = a + b++; // => El resultado es 13, y despues de operar, se incrementa el valor de b
        e = ++a - b; // => El resultado sera 7, primero incrementamos a por lo que queda 11,
        // b lo incrementamos en el punto anterior, así que vale 4
        y = (float)a / b; // Al contrario que con X, aqui hacemos casting a float, por lo que si mostrará un
        // decimal. En este caso, 11 / 4 dara 2.75
    }
}
