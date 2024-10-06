package IntroduccionALaProgramacion;

public class Ejercicio20 {
    /*
        Escriba usando variables las siguientes expresiones:
        1) 5a^2b^3 +√(a^2+b^2)
        2) √(4ab²) + (a+b)^2
        3) (a^3b)/(2ab^2) - 12d^4
     */

    public static void main(String[] args) {
        double a = 4, b = 3, d = 2;
        double puntoUno, puntoDos, puntoTres;

        puntoUno = (5 * Math.pow(a,2) * Math.pow(b,3)) + Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println(puntoUno);

        puntoDos = Math.sqrt(4 * a * Math.pow(b,2)) + (a + b);
        System.out.println(puntoDos);

        puntoTres = ((Math.pow(a,3) * b) / (2 * a * Math.pow(b,2) )) - Math.sqrt(12 * Math.pow(d,4));
        System.out.println(puntoTres);
    }
}
