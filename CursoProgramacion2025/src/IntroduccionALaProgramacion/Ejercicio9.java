package IntroduccionALaProgramacion;

public class Ejercicio9 {

//    El siguiente programa tiene 3 fallos, averigua cuáles son y modifica el programa para que funcione.
//    class Cuadrado {
//        public static void main(String [] args)
//        {
//            int numero=2,
//            cuad=numero * número;
//            System.out.println("EL CUADRADO DE "+NUMERO+" ES: " + cuad);
//        }
//    }

    // El primer fallo esta en número, no podemos escribir tildes ya que no las reconoce.
    // El segundo esta en NUMERO, ya que no tenemos definida ninguna variable con ese nombre (es case sensitive)

    public static void main(String [] args) {
            int numero=2,
            cuad=numero * numero;
            System.out.println("EL CUADRADO DE "+numero+" ES: " + cuad);
        }
}
