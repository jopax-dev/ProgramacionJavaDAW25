package IntroduccionALaProgramacion;

public class Ejercicio14 {
    // Realiza un programa en Java que genere números de forma aleatoria simulando la tirada de un dado.
    public static void main(String[] args) {
        int dado = (int) ( Math.random()*6+1);
        System.out.println(dado);
    }
}
