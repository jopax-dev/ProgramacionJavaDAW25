package EjerciciosTema2.Ejercicios1_Unidad2.EjerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio4 {
    /*
        Crea una función que no devuelva nada (void) que, dado un importe en euros, nos indique el mínimo
        número de billetes y la cantidad sobrante que se pueden utilizar para obtener dicha cantidad
     */

    public static void billetes(double euros){

        if( euros >= 500){
            System.out.printf("%d billetes de 500",(int) (euros/500));
            euros = euros % 500;
        }
        if( euros >= 200){
            System.out.printf(", %d billetes de 200",(int) (euros/200));
            euros = euros % 200;
        }
        if( euros >= 100){
            System.out.printf(", %d billetes de 100",(int) (euros/100));
            euros = euros % 100;
        }
        if( euros >= 50){
            System.out.printf(", %d billetes de 50",(int) (euros/50));
            euros = euros % 50;
        }
        if( euros >= 20){
            System.out.printf(", %d billetes de 20",(int) (euros/20));
            euros = euros % 20;
        }
        if( euros >= 10){
            System.out.printf(", %d billetes de 10",(int) (euros/10));
            euros = euros % 10;
        }
        if( euros >= 5){
            System.out.printf(", %d billetes de 5",(int) (euros/5));
            euros = euros % 5;
        }
        System.out.printf(", sobran %.2f euros", euros);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que cantidad quieres comprobar?");
        double euros = Double.parseDouble(sc.nextLine());
        billetes(euros);
    }
}
