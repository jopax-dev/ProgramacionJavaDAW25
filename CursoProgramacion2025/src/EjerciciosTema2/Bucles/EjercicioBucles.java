package EjerciciosTema2.Bucles;

import java.util.Scanner;

public class EjercicioBucles {
    public static void main(String[] args) {
        /*
            Introducir numeros hasta que introduzcamos un 0
            El resultado es la suma y la media de los numeros introducidos.
         */

        int num, suma = 0, totalNum = 0;
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        do {
            System.out.println("Escribe un numero");
            num = sc.nextInt();
            suma += num;

            if(num != 0){
                totalNum++;
            }

        } while (num != 0);

        System.out.printf("""
                Suma total: %d
                Media: %.2f
                """, suma, (double)suma / totalNum);
    }
}
