package EjerciciosTema2.Excepciones;

import java.util.Scanner;

public class EjemploExcepciones {
    public static void main(String[] args) {
        /*
            Pedir un precio por teclado y mostrar el precio con IVA
                - Controlar que el precio sea un double y no escriba otra cosa
                - Controlar si es un numero negativo, vamos a lanzar una excepcion
         */

        Scanner sc = new Scanner(System.in);
        try{
            double precio = Double.parseDouble(sc.nextLine());

            if(precio < 0){
                throw new Exception("El prcio no puede ser negativo");
            }

            System.out.println("Precio con iva es: " + precio * 1.21);

        } catch (NumberFormatException e) {
            System.out.println("introduce un precio valido");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
