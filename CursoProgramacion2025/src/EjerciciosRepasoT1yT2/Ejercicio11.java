package EjerciciosRepasoT1yT2;

import java.util.Scanner;

public class Ejercicio11 {
    /*
        Realiza un programa que pida por teclado un número que será la base. Luego debe pedir otro número
        que indique hasta qué exponente lo quieres elevar y muestra todas esas potencias.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, indice;
        String exponente, iString, num = "";

        // Valores unicode de los superindices 0 - 9
        String[] exponentes = {"\u2070", "\u00b9", "\u00b2", "\u00b3", "\u2074", "\u2075", "\u2076", "\u2077",
                "\u2078", "\u2079"};

        System.out.println("Introduce la base: ");
        base = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce hasta que exponente quieres elevar: ");
        exponente = sc.nextLine();


        for (int i = 1; i <= Integer.parseInt(exponente) ; i++) {
            iString = i+"";
            num = base+"";
            for (int j = 0; j < iString.length(); j++){
                indice = Character.getNumericValue(iString.charAt(j));
                num += (exponentes[indice]);
            }
            System.out.println(num + " => " + (int) Math.pow(base, i) );
        }
    }
}
