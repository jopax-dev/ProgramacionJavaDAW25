package EjerciciosTema1;

public class EjercicioVoyager {

    /*
    Velocidad sonda = 58000km/h
    Año 1977
     */

    public static void main(String[] args) {
        final int velocidadSonda = 58000, anoLanzamiento = 1977;
        int  curYear = 2024;
        long yearDif = curYear - anoLanzamiento;
        long distYear = 58000 * 24 * 365;

        System.out.printf("Distancia total recorrida: %dkm", (distYear * yearDif));



    }
}
