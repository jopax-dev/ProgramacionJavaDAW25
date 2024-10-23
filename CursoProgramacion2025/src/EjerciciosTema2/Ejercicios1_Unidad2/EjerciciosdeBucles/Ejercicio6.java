package EjerciciosTema2.Ejercicios1_Unidad2.EjerciciosdeBucles;

public class Ejercicio6 {
    /*
        Programa que sume los 100 primeros números enteros impares.
     */
    public static void main(String[] args) {
        int maxNum = 100;
        int num = 1;
        int total = 0;

        while (maxNum > 0){
            if ( num % 2 != 0){
                total += num;
                maxNum--;
            }
            num++;
        }
        System.out.println("Suma total: " + total);
    }
}
