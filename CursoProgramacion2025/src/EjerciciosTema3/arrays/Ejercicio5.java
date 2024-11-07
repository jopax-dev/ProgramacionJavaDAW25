package EjerciciosTema3.arrays;

public class Ejercicio5 {
    /*
        Vamos a simular que tenemos un sensor de temperatura en una plantacion de tomates (5 - 50º)
        El dispositivo toma la temperatura 120 veces al dia
        Simula el comportamiento del sensor con un array de double que represente la temperatura tomada por el sensor
        Si la temperatura media actual es superior a un umbral (35º), debe saltar una alarma (excepcion)
     */

    public static double temperatura(){
        return Math.random() * 45 + 5;
    }
    public static void main(String[] args) {
        double temperatura[] = new double[120];
        double tempMedia = 0;

        try {
            for (int i = 0; i < temperatura.length; i++) {

                if (i == 0)
                    tempMedia = temperatura();
                else
                    tempMedia = (tempMedia + temperatura()) / 2;
                System.out.println("Temperatura media: " + tempMedia);

                if (tempMedia > 35)
                    throw new Exception("Alarma! temperatura superior a 35º");
            }

            System.out.println("Tus tomates han sobrevivido un dia mas");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
