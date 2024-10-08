package IntroduccionALaProgramacion;

public class Ejercicio15 {

    /*
        Escriba un programa que escriba en la pantalla cuánto le dará su banco después de seis meses si pone
        2000€ en una cuenta a plazo fijo al 2,75% anual. Recuerde que al pagarle los intereses el banco le
        retendrá el 18% para hacienda.
     */

    public static void main(String[] args) {
        double plazo = 0.0275, hacienda = 0.18, capital = 2000;
        double beneficio;

        beneficio = (capital * plazo) / 2;
        beneficio -= beneficio * hacienda;

        capital += beneficio;

        System.out.printf("Capital despues de 6 meses: %.2f€", capital);
    }
}
