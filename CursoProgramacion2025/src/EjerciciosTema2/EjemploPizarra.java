package EjerciciosTema2;

import java.util.Scanner;

public class EjemploPizarra {
    /*
        Si la edad [1 - 11] -> Hola niño
        Si la edad [12 - 17] -> Hola chaval
        Si la edad [18 - 29] -> Hola tio
        Si la edad [30 - 50] -> Hola hombre
        Si la edad > 60 -> Hola abuelo
     */

    public static void main(String[] args) {
        int edad;
        char sexo;
        String texto = "Hola ";

        Scanner sc = new Scanner(System.in);

        System.out.println("Indica la edad: ");
        edad = sc.nextInt();
        System.out.println("Indica tu sexo: ");
        sexo = sc.next().charAt(0);

        if (edad > 0 && edad < 12){
            texto += sexo == 'h' ? "niño" : "niña";
        } else if (edad < 18) {
            texto += sexo == 'h' ? "chaval" : "chavala";
        } else if (edad < 30) {
            texto += sexo == 'h' ? "tio" : "tia";
        } else if (edad < 61) {
            texto += sexo == 'h' ? "hombre" : "mujer";
        } else {
            texto += sexo == 'h' ? "abuelo" : "abuela";
        }

        System.out.println(texto);
    }
}
