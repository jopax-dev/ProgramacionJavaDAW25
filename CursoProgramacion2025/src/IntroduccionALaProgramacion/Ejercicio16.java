package IntroduccionALaProgramacion;

public class Ejercicio16 {

    /*
        Escriba un programa para calcular el área y el volumen de un cilindro. Para ello declare una constante
        que guarde el valor de Pi. Declare, también, variables para el diámetro y la altura del cilindro. Suponga
        para el ejemplo que el cilindro tiene un diámetro de 15,5cm y una altura de 42,4cm.
     */

    public static void main(String[] args) {
        /*
            Volumen: π r² h
            Area: 2π r (r + h)
        */
        final double PI = 3.1416;
        double diametro = 15.5, altura = 42.4;
        double area, volumen, radio = diametro/2;

        volumen = Math.pow(radio,2) * PI * altura;
        area = 2 * PI * radio * (radio + altura);

        System.out.printf("Volumen del cilindro: %.2fcm\n", volumen);
        System.out.printf("Area: %.2f", area);

    }
}
