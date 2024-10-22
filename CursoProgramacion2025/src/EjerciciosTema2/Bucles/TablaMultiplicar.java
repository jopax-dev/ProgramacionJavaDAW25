package EjerciciosTema2.Bucles;

public class TablaMultiplicar {
    public static void main(String[] args) {
        /*
            Imprimir tabla multiplicar del 9
         */

//        int num = 9;
//
//        for (int i = 1; i <= 10; i++){
//            System.out.printf("%d x %d = %d\n", num, i, num * i);
//        }

        /*
            Imprimir todas las tablas de multiplicar del 1 al 20 menos la del 10
         */

        for (int i = 1; i <= 20; i++){
            if ( i != 10) {
                System.out.println("Tabla del " + i);
                for (int j = 1; j <= 10; j++){
                    System.out.printf("%d x %d = %d\n", i, j, j * i);
                }
                System.out.println("");
            }
        }
    }
}
