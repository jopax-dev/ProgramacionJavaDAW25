package EstructurasAlternativas;

import java.util.Scanner;

public class Ejercicio6 {
    /*
        La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual
        se clasifica en tipos A y B, y además en tamaños 1 y 2. Cuando se realiza la venta del
        producto, ésta es de un solo tipo y tamaño, se requiere determinar cuánto recibirá un
        productor por la uva que entrega en un embarque, considerando lo siguiente: si es de tipo
        A,se le cargan 20 céntimos al precio inicial cuando es de tamaño 1; y 30 céntimos si es de
        tamaño 2. Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos
        cuando es de tamaño 2. Realice un algoritmo para determinar la ganancia obtenida.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("A cuanto se vende el kg de uva?");
        double precio = sc.nextDouble();

        System.out.println("De que tipo es? [A-B]");
        char tipo = sc.next().charAt(0);

        System.out.println("De que tamaño es? [1-2]");
        int size = sc.nextInt();

        System.out.println("Cuantos kg vas a vender?");
        double kg = sc.nextDouble(), total;
        boolean invalido = false;

        switch (Character.toUpperCase(tipo)) {
            case 'A':
                if (size == 1) {
                    precio += 0.2;
                    invalido = true;
                } else if (size == 2) {
                    precio += 0.3;
                    invalido = true;
                }

                if (!invalido) {
                    System.out.println("Tamaño invalido");
                }else {
                    total = precio * kg;
                    System.out.printf("Total por %.3f kg, %.2f€",kg,  total);
                }
                break;

            case 'B':
                if (size == 1) {
                    precio -= 0.3;
                    invalido = true;
                } else if (size == 2) {
                    precio -= 0.5;
                    invalido = true;
                }

                if (!invalido) {
                    System.out.println("Tamaño invalido");
                }else {
                    total = precio * kg;
                    System.out.printf("Total por %.3f kg, %.2f€",kg,  total);
                }
                break;

            default:
                System.out.println("Tipo invalido");
        }

    }
}
