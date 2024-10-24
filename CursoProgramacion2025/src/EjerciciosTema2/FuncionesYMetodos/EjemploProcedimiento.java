package EjerciciosTema2.FuncionesYMetodos;

public class EjemploProcedimiento {

    public static void imprimeNumero ( int numero ) {
        String mensaje = "El numero generado es ";
        System.out.println(mensaje + numero);
    }

    public  static int generarNumeroAleatorio(int min, int max){
        return (int) (Math.random() * max - min + 1) + 1;
    }

    public static  int mayor(int num1, int num2){
        return num1 > num2 ? num1 : num2;
    }

    public static int mayor(int num1, int num2, int num3){
        return mayor(mayor(num1, num2), mayor(num1, num3));
    }


    public static void main(String[] args) {

        int tirada1, tirada2, tirada3;

        tirada1 = generarNumeroAleatorio(1, 100);
        tirada2 = generarNumeroAleatorio(1, 100);
        tirada3 = generarNumeroAleatorio(1, 100);

        imprimeNumero(tirada1);
        imprimeNumero(tirada2);
        imprimeNumero(tirada3);

        System.out.println("El mayor de todos es: "+mayor(tirada1, tirada2, tirada3));
    }
}
