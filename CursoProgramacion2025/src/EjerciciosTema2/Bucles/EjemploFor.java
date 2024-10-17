package EjerciciosTema2.Bucles;

import java.util.Scanner;

public class EjemploFor {
    public static void main(String[] args) {

        /*
        // pintar numeros del 1 al 10
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }



        // Los numeros pares del 2 al 40

        for (int i = 2; i <= 40; i+=2){
            System.out.println(i);
        }



        // Recorrer la cadena caracter a caracter
        String cadena = "Programacion";

        for (int i = 0; i < cadena.length(); i++){
            System.out.println(cadena.charAt(i));
        }



        // Pinta una cuenta atras del 10 al 1
        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }



        // Genera 10 tiradas de un d6 usando for
        for (int i = 1; i <= 10; i++){
            System.out.println((int) (Math.random() * 6 + 1));
        }



        // Pregunta por teclado 5 nombres de persona

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++ ){
            System.out.printf("Escribe el %d nombre: ", i);
            System.out.println(sc.nextLine());
        }
        System.out.println("Listo, muchas gracias ;)");



        // Pregunta por teclado 5 nombres y  pintalos seguidos

        String nombre = "";
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++){
            System.out.printf("Escribe el %d nombre: ", i);
            nombre += sc.nextLine() + " ";
        }

        System.out.println(nombre);



        // Pinta por pantalla la tabla de multiplicar del 7
        for (int i = 0; i <= 10; i++){
            System.out.println("7 x " + i + " = " + (7*i));
        }

         */

        // pinta la tabla del 4 del reves
        for ( int i = 10; i >= 0; i--){
            System.out.println("4 x " + i + " = " + (4*i));
        }
    }
}
