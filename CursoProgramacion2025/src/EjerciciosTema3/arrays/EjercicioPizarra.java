package EjerciciosTema3.arrays;

public class EjercicioPizarra {
    /*
        - En el primer trimestre del curso hay 85 dias de clase
        - En un array de booleanos guardamos si un alumno ha faltado o no
        - Realiza un programa que diga si el alumno ha perdido la evaluacion continua (20% de faltas al trimestre)
     */

    public static boolean asiste(){
        return (int)(Math.random() * 5 + 1) != 1;
    }

    public static void main(String[] args) {
        boolean asistidoAClase[] = new boolean[85];
        int porcentajeFaltas = 20;
        int diasFalta = 0;

        for (int i = 0; i < asistidoAClase.length; i++) {
            asistidoAClase[i] = asiste();
            if (!asistidoAClase[i])
                diasFalta++;
        }

        boolean evaluacionContinua = ((double)diasFalta / asistidoAClase.length * 100) < porcentajeFaltas;

        System.out.printf("Ha faltado un total de %d dias, eso es un %.2f%% del trimestre\n",diasFalta,
                (double)diasFalta / asistidoAClase.length * 100);

        if(evaluacionContinua){
            System.out.println("Tiene derecho a la evaluacion continua");
        } else {
            System.out.println("Ha faltado demasiado, ha perdido el derecho a la evaluacion continua");
        }


    }
}
