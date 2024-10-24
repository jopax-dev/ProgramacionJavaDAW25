package EjerciciosTema2.Excepciones;

import java.util.Scanner;

public class EjemploCapturaExcepcion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean error = true;

        while(error){
            System.out.println("Dame un numero");

            try {
                int numero = Integer.parseInt(sc.nextLine());
                System.out.println(numero / 0);
                error = false;
            } catch (NumberFormatException e) {
                System.out.println("No has introducido un numero valido");
            } catch (ArithmeticException e){
                System.out.print("Error en la division ");
                System.out.println(e.getMessage());
            } catch (Exception e){
                System.out.println("Error");
            }
        }





    }
}
