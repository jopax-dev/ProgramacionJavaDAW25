package EjerciciosTema2.IfSwitch;

import java.util.Scanner;

public class EjercicioComprobarDiaMes {
    /*
        Comprobar que un dia dado existe dentro de un mes dado
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("De que mes quieres comprobar el dia?");
        int mes = sc.nextInt();

        System.out.println("Escribe un nº de día");
        int dia = sc.nextInt();

        String mensaje = "Mes no valido";

        switch (mes){
            case 2:
                mensaje = dia > 0 &&  dia < 28 ? "Dia valido" : "Dia invalido";
                break;
            case 1,3,5,7,8,10,12:
                mensaje = dia > 0 &&  dia < 31 ? "Dia valido" : "Dia invalido";
                break;
            case 4,6,9,11:
                mensaje = dia > 0 &&  dia < 30 ? "Dia valido" : "Dia invalido";
                break;
        }
        System.out.println(mensaje);
    }
}
