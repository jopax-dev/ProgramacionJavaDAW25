package EjerciciosTema2;

import java.util.Scanner;

public class EjercicioSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el numero del dado: ");
        int dado = Integer.parseInt(sc.nextLine());

        switch (dado) {
            case 1:
                System.out.println("La cara opuesta es seis");
                break;
            case 2:
                System.out.println("La cara opuesta es cinco");
                break;
            case 3:
                System.out.println("La cara opuesta es cuatro");
                break;
            case 4:
                System.out.println("La cara opuesta es tres");
                break;
            case 5:
                System.out.println("La cara opuesta es dos");
                break;
            case 6:
                System.out.println("La cara opuesta es uno");
                break;
            default:
                System.out.println("Error: numero no valido");
        }
    }
}
