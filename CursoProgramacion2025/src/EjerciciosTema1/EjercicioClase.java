package EjerciciosTema1;

import java.util.Scanner;

public class EjercicioClase {

//    Un alumno queire saber su nota final de programacion
//    Tenemos 3 examenes parciales: nota1, nota2 y nota3 que vale un 55% de la nota final
//    Tenemos tambien un examen final: notaExamenFinal que vale un 30%
//    Y un 15% del trabajo final: notaTrabajoFinal

    public static void main(String[] args) {
        double porcentParciales = 55, porcentFinal = 30, porcentTrabajo = 15;
        double nota1, nota2, nota3, notaExamenFinal, notaTrabajoFinal, notaParciales, notaFinal;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe la nota del primer examen: ");
        nota1 = sc.nextDouble();

        System.out.println("Escribe la nota del segundo examen: ");
        nota2 = sc.nextDouble();

        System.out.println("Escribe la nota del tercer examen: ");
        nota3 = sc.nextDouble();

        notaParciales = ((nota1 + nota2 + nota3) / 3) * (porcentParciales / 100);

        System.out.println("Escribe la nota del examen final: ");
        notaExamenFinal = sc.nextDouble();

        notaExamenFinal = notaExamenFinal * (porcentFinal/100);


        System.out.println("Escribe la nota del trabajo final: ");
        notaTrabajoFinal = sc.nextDouble();
        notaTrabajoFinal = notaTrabajoFinal * (porcentTrabajo /100);

        System.out.println("Nota final: " + (notaParciales + notaExamenFinal + notaTrabajoFinal));
    }
}


