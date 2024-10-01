package IntroduccionALaProgramacion;

public class Ejercicio7 {

//    ¿Por qué no compila el siguiente programa? Modifícalo para hacer que funcione.
//    class Suma {
//        public static void main(String [] args)
//        {
//            int n1=50,n2=30,
//            boolean suma=0;
//            suma=n1+n2;
//            System.out.println("LA SUMA ES: " + suma);
//        }
//    }

    // No compila porque tenemos 2 fallos,
    // Primero, tenemos un typo, nos falta punto y coma (;) despues de la declaracion de n2, que en este caso es una coma
    // Y segundo, estamos intentando guardar en un booleano una suma de int
    // para que funcione deberiamos cambiar el tipo de suma, de booleano a int.

    public static void main(String [] args)
        {
            int n1=50,n2=30;
            int suma=0;
            suma=n1+n2;
            System.out.println("LA SUMA ES: " + suma);
        }
}
