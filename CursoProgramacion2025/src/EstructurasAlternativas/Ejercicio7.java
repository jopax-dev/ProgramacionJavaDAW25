package EstructurasAlternativas;

import java.util.Scanner;

public class Ejercicio7 {
    /*
        La política de cobro de una compañía telefónica es: cuando se realiza una llamada, el cobro
        es por el tiempo que ésta dura, de tal forma que los primeros cinco minutos cuestan 1 euro,
        los siguientes tres, 80 céntimos, los siguientes dos minutos, 70 céntimos, y a partir del
        décimo minuto, 50 céntimos.
        Además, se carga un impuesto de 3 % cuando es domingo, y si es otro día, en turno de
        mañana, 15 %, y en turno de tarde, 10 %. Realice un algoritmo para determinar cuánto debe
        pagar por cada concepto una persona que realiza una llamada.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalLlamada = 0, impuesto = 0.03;

        System.out.println("Que dia se hizo la llamada?");
        String diaSemana = sc.nextLine().toLowerCase();

        if ( !diaSemana.equals("domingo")){
            System.out.println("Fue en turno de mañana? o de tarde?");
            impuesto = sc.nextLine().equalsIgnoreCase("mañana") ?  0.15 :  0.1;
        }

        System.out.println("Cuanto ha durado la llamada?  (minutos)");
        int tiempoLlamada = sc.nextInt();

        if (tiempoLlamada <= 5){
            totalLlamada =  tiempoLlamada;
        } else if (tiempoLlamada <= 8) {
            totalLlamada = 5 + (tiempoLlamada - 5) * 0.8;
        } else if (tiempoLlamada <= 10) {
            totalLlamada = 5 + 3 * 0.8 + (tiempoLlamada - 8) * 0.7;
        } else {
            totalLlamada = 5 + 3 * 0.8 + 2 * 0.7 + (tiempoLlamada - 10) * 0.5;
        }

        impuesto *= totalLlamada;
        totalLlamada += impuesto;
        System.out.printf("Llamada de %d minutos, ha costado: %.3f€\n", tiempoLlamada, totalLlamada );
    }
}
