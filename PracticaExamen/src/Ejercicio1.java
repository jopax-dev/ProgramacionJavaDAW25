import java.util.Scanner;

public class Ejercicio1 {
    /*
        Menú
        Realiza un programa que pida un número por teclado. Luego muestra un menú con las
        siguientes opciones:
            1. Muestra la suma de cada uno de sus dígitos
            2. Que diga si es primo o no
            3. La longitud de una circunferencia cuyo radio fuera ese número
            4. Salir
        Para cada una de las opciones deberás llamar a una función que calcule lo que se pide y
        devuelva el resultado.
     */

    /***
     * Metodo para pintar el menu
     */
    public static void menu(){
        System.out.print("""
                #### MENU ###
                1.- Suma de los digitos del numero
                2.- Es primo?
                3.- Longitud de la circunferencia con ese radio
                4.- Salir
                """);
    }

    /***
     * Suma los valores de los diferentes digitos del numero y los muestra por pantalla
     * @param num
     */
    public static int suma(int num){
        String numToString = Integer.toString(num);
        int suma = 0;
        for (int i = 0; i < numToString.length(); i++) {
            suma += Character.getNumericValue(numToString.charAt(i));
        }
        return suma;
    }

    /***
     *  Comprobamos si el numero es primo o no, comprobando si es divisible por numeros diferentes a 1 y a la raiz
     *  cuadrada del mismo.
     *  Devolvemos true o false
     * @param num
     */
    public static String primo(int num){
        boolean esPrimo = true;
        for (int i = 2; i <= Math.sqrt(num) ; i++) {
            if (num % i == 0) {
                esPrimo = false;
                break;
            }
        }

        return esPrimo
                ? "es primo"
                : "no es primo";
    }


    /***
     * Usando la formula 2·PI·R o Diametro · Pi, sacamos la longitud de la circunferencia
     * @param radio
     */
    public static double longCircunferencia(int radio){
        System.out.println("La longitud de la circunferencia tiene la formula d·pi, o lo que es lo mismo 2·pi·r");
        return 2 * radio * Math.PI;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int opcion = 0;

        do {
            try{
                System.out.println("Escribe un numero:");
                num = Integer.parseInt(sc.nextLine());

                // Comprobamos que el numero sea mayor que 0
                if ( num < 1) throw new Exception("El numero tiene que ser un entero positivo");

                menu();
                System.out.println("Elige una opcion");

                try{
                    opcion = Integer.parseInt(sc.nextLine());
                    switch (opcion){
                        case 1:

                            System.out.println("Suma total de los digitos de " + num + " es: " + suma(num));
                            break;
                        case 2:
                            System.out.printf("El número %d %s\n", num, primo(num));
                            break;
                        case 3:
                            System.out.printf("""
                                Radio: %d
                                Longitud circunferencia: %f
                                
                            """, num, longCircunferencia(num));
                            break;
                        case 4:
                            System.out.println("Saliendo....");
                            break;
                        default:
                            System.out.println("Opcion no valida.");
                    }
                    System.out.println("Pulsa intro para continuar");
                    sc.nextLine();
                    System.out.println();
                }catch (NumberFormatException e) {
                    System.out.println("No has introducido un numero.");
                    System.out.println(e.getMessage());
                }
            } catch (NumberFormatException e){
                System.out.println("No has introducido un numero.");
                System.out.println(e.getMessage());
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        } while (opcion != 4);
        System.out.println("Hasta luego!");
    }
}
