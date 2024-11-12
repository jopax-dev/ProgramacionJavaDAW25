package EjerciciosTema3.arrays;

public class EjerciciosArrays5 {
    /*
        Ejercicio 5
            -Vamos a crear un array de 1000 valores double, debes rellenarlos con valores aleatorios entre 5 y 50
            (temperaturas). Debes devolver la media y la mediana = ((máximo + mínimo) / 2)

     */

    public static double max(double num1, double num2){
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    public static double min(double num1, double num2){
        if (num1 < num2)
            return num1;
        else
            return num2;
    }

    public static void main(String[] args) {
        double temps[] = new double[1000];
        double max = 0, min = 0;
        double totalTemps = 0;

        for (int i = 0; i < temps.length ; i++) {
            temps[i] = (int) (Math.random() * 41 + 5);

            max = max(max, temps[i]);
            min = min(min, temps[i]);

            totalTemps += temps[i];
        }

        System.out.println("Media: " + (totalTemps / temps.length));
        System.out.println("Mediana " + ((max + min) / 2));
    }
}
