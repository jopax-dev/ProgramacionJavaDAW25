package EjerciciosTema2.Ejercicios1_Unidad2.EjerciciosControlDeExcepciones;

import java.util.Scanner;

public class Ejercicio22 {
    /*
        Pedir un número entre 1 y 9999 y decir si es capicúa.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entre 1 y 9999 para ver si es capicua");
        try{
            int num = Integer.parseInt(sc.nextLine());

            if(num>9999 || num<1) {
                throw new Exception("El numero tiene que estar entre 1 y 9999");
            }

            String numString = Integer.toString(num);
            int lenght = numString.length();
            boolean capicua = true;

            for (int i = 0; i < lenght; i++) {
                if (numString.charAt(i) != numString.charAt(lenght - 1 - i)) {
                    capicua = false;
                    break;
                }
            }
            if (capicua) {
                System.out.println("Es capicua");
            } else {
                System.out.println("No es capicua");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
