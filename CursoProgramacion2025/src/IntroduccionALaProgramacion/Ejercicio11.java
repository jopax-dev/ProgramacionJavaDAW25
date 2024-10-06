package IntroduccionALaProgramacion;

public class Ejercicio11 {

    //  Realiza un programa que calcule el área y el perímetro de un círculo de radio 3,6 metros.

    public static void main(String[] args) {

        double area, perimetro, radio = 3.6;

        area = Math.PI * Math.pow(radio, 2);
        perimetro = 2 * Math.PI * radio;

        System.out.printf("El area es: %.3fm \n", area);
        System.out.printf("El perimetro es %.3fm: ", perimetro);
    }
}
