package EjerciciosTema3.arrays;

import java.util.Scanner;

public class EjerciciosArrays4 {
    /*
        Ejercicio 4.
            - Vamos a crear un pequeño diccionario inglés - español. Nos creamos un array de 10 String con palabras
            en inglés, y luego un array de 10 String con la traducción de las palabras en español. En la misma posición de
            los dos arrays está su palabra y la traducción.
            Crea un función->  public function String traducir(String palabraEspañol) que devuelva la traducción al inglés.
            La idea es buscar la posición donde está la palabra y devolver la traducción en que está en el otro array.
     */

    public static String traducir(String palabraEspanol){
        String ingles[] = {"hello", "house", "pink", "red", "blue", "yellow", "green"};
        String espanol[] = {"hola", "casa", "rosa", "rojo", "azul", "amarillo", "verde"};

        for(int i = 0; i < espanol.length; i++){
            if(espanol[i].equalsIgnoreCase(palabraEspanol))
                return ingles[i];
        }
        return "No hay coincidencias";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;

        System.out.println("Que palabra quieres traducir?");
        palabra = sc.nextLine();

        System.out.println(traducir(palabra));

    }
}
