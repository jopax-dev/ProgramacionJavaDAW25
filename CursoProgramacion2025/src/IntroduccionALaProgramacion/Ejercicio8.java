package IntroduccionALaProgramacion;

public class Ejercicio8 {

//    Modifica el siguiente programa para hacer que compile y funcione:
//    class Suma {
//        static int n1=50;
//        public static void main(String [] args)
//        {
//            int n2=30, suma=0, n3;
//            suma=n1+n2;
//            System.out.println("LA SUMA ES: " + suma);
//            suma=suma+n3;
//            System.out.println(suma);
//        }
//    }

    // No compila porque tenemos definida la variable n3, pero no la hemos inicializado.
    // Con asignarle un valor ya compilaria

    static int n1=50;
    public static void main(String [] args)
    {
        int n2=30, suma=0, n3= 2;
        suma=n1+n2;
        System.out.println("LA SUMA ES: " + suma);
        suma=suma+n3;
        System.out.println(suma);
    }
}
