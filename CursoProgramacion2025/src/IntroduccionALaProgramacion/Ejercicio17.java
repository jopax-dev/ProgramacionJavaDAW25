package IntroduccionALaProgramacion;

public class Ejercicio17 {
    /*
    Escriba expresiones que almacenen en variables lo siguiente:
        a. Crear un número entero positivo aleatorio entre 1 y 49.
        b. Generar un número aleatorio positivo par.
        c. Generar un número real aleatorio entre 1 y 10.
        d. Crear un número entero negativo entre -50 y -150.
        e. Crear un número entero entre -100 y 100.
        f. Generar un número aleatorio que sea uno de los siguientes: 5, 7, 33, 125 o 77
        g. Crea un generador aleatorio de uno de los meses del año
    Puedes usar la siguiente fórmula:
    int n = (int) (Math.random() * (<número_máximo + 1> - <número_mínimo>)) + <numero_mínimo>;
     */
    public static void main(String[] args) {
        int a = (int) ((Math.random() * 49) + 1);
        System.out.println("A) " + a);

        int b = (int) (Math.random() * 25) * 2;
        System.out.println("B) " + b);

        int c = (int) ((Math.random() * 10) + 1);
        System.out.println("C) " + c);

        int d = (int) (Math.random() * (-49 + 150 )) - 150;
        System.out.println("D) " + d);

        int e = (int) (Math.random() * (99 + 100 )) - 100;
        System.out.println("E) " + e);

        int[]numeros = {5,7,33,125,77};
        int indice = (int) (Math.random() * 5);
        System.out.println("F) " + numeros[indice]);

        String[]meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int indiceMes = (int) (Math.random() * 12);
        System.out.println("G) " + meses[indiceMes]);
    }
}
