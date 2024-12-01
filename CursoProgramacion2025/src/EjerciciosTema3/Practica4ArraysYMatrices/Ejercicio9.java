package EjerciciosTema3.Practica4ArraysYMatrices;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio9 {
    /*
        Realizar un programa que lea los tiempos en los que de 10 corredores han acabado una carrera. El
        programa debe determinar qué corredores tienen el primer, segundo y último puesto, así como cuál es
         el tiempo medio en que se ha corrido la carrera. Pista: ordénalo antes.
     */

    static void printArr(double arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tiempos[] = new double[5];
        double media = 0;

        for (int i = 0; i < tiempos.length; i++) {
            try {
                System.out.println("Que tiempo ha hecho el " + (i + 1) + " corredor?");
                tiempos[i] = Double.parseDouble(sc.nextLine());
                if(tiempos[i] < 0)
                    throw new InvalidAlgorithmParameterException("Tiempo no valido");
                media += tiempos[i];
            } catch (Exception e){
                i--;
                System.out.println(e.getMessage());
            }
        }
        Arrays.sort(tiempos);
        media /= tiempos.length;

        System.out.printf("""
                Los tiempos de los 2 corredores más rapidos son:
                %.3f
                %.3f
                El tiempo del ultimo corredor es:
                %.3f
                
                La media de la carrera ha sido:
                %.3f
                """, tiempos[0], tiempos[1], tiempos[tiempos.length-1], media);
    }
}
