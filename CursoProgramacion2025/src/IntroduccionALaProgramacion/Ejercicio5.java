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

//    boolean adivina=(97=='a'==97);
//    System.out.println(adivina);
//      ** No compilaria, primero hace la comprobacion de si 97 es igual a 'a', en este caso, al hacer el casting,
//      seria verdadero. Luego compara true con un int (97 en este caso), lo cual no se puede hacer y da fallo. **

//    boolean adivina=(97=='a'==true);
//    System.out.println(adivina)
//      ** En este caso, a diferencia del anterior, si compila y mostraria true, ya que primero hace la conversion,
//      al igual que antes, da true, y true si se puede comparar con otro booleano, en este caso true. **

}
