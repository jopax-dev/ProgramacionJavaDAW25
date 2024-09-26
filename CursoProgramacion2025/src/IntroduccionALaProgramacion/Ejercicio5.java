package IntroduccionALaProgramacion;

public class Ejercicio5 {

//    ¿Compilará y funcionará el siguiente código?
//    En caso afirmativo, explica qué mostrará por pantalla.
//    En caso negativo, explica por qué no funciona.
//
//    int a=’a’;
//    System.out.println(a);
//      ** Mostraria el numero que representa el caracter 'a', al hacer una conversion de ascii ( char) a int **
//
//
//    int PI=3.14;
//    System.out.println(PI);
//      ** No funcionaria porque estamos intentando guardar un float en un int **
//
//
//    double PI=3,14;
//    System.out.println(PI);
//      ** Daria error porque los float al meterlos en codigo, hay que definirlos con punt (.) no con coma, en cambio,
//      al introducir un valor en coma flotante desde terminal, hay que hacerlo con coma (,) **
//
//
//    boolean adivina=(1==4);
//    System.out.println(adivina);
//      ** Funcionaria y mostraria false **
//
//
//    boolean adivina=(97==’a’==97);
//    System.out.println(adivina);
//      ** No compilaria, daria error porque a == 97, pero un int, en este caso 97, no puede compararse con un booleano **

//    boolean adivina=(97==’a’==true);
//    System.out.println(adivina);

    public static void main(String[] args) {
        boolean adivina=(97=='a'==true);
        System.out.println(adivina);
    }

}
