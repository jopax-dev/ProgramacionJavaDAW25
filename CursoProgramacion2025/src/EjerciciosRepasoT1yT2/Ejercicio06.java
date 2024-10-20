package EjerciciosRepasoT1yT2;

public class Ejercicio06 {
    /*
        Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de la forma:
        suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número de suspensos, el número
        de suficientes, el número de bienes, etc.
     */
    public static void main(String[] args) {
        int totalSusp = 0, totalSuf = 0, totalBien = 0, totalNot = 0, totalSob = 0;
        double nota;

        for (int i = 1; i <= 20 ; i++) {
            nota = Math.random() * 10;
            if (nota < 5) {
                totalSusp++;
                System.out.printf("%d nota %.1f => Suspenso\n", i, nota);
            } else if (nota < 6) {
                totalSuf++;
                System.out.printf("%d nota %.1f => Suficiente\n", i, nota);
            } else if (nota < 7) {
                totalBien++;
                System.out.printf("%d nota %.1f => Bien\n", i, nota);
            } else if (nota < 9) {
                totalNot++;
                System.out.printf("%d nota %.1f => Notable\n", i, nota);
            } else {
                totalSob++;
                System.out.printf("%d nota %.1f => Sobresaliente\n", i, nota);
            }
        }
        System.out.println("Total");
        System.out.println("Suspenso: " + totalSusp);
        System.out.println("Suficiente: " + totalSuf);
        System.out.println("Bien: " + totalBien);
        System.out.println("Notable: " + totalNot);
        System.out.println("Sobresaliente: " + totalSob);
    }
}
