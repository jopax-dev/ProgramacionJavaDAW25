package EstructurasSecuenciales;

import java.util.Scanner;

public class Ejercicio13 {

    /*
        Escribir un algoritmo para calcular la nota final de un estudiante, considerando que: por
        cada respuesta correcta 5 puntos, por una incorrecta -1 y por respuestas en blanco 0.
        Imprime el resultado obtenido por el estudiante.
     */
    public static void main(String[] args) {
        int noNotas, notasBien, notasMal, notasBlanco, notaFinal;
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas preguntas tenia el examen?: ");
        noNotas = sc.nextInt();

        System.out.println("Cuantas preguntas correctas ha contestado el alumno?: ");
        notasBien = sc.nextInt();

        System.out.println("Cuantas preguntas incorrectas ha contestado el alumno?: ");
        notasMal = sc.nextInt();

        notasBlanco = noNotas - (notasBien + notasMal);
        sc.close();

        notaFinal = (notasBien * 5) - notasMal;
        System.out.println("Nota final del alumno: " + notaFinal);

        System.out.printf("El alumno ha respondido bien %d/%d preguntas \n", notasBien, noNotas);
        System.out.printf("El alumno ha dejado sin responder %d/%d preguntas", notasBlanco, noNotas);

    }
}
