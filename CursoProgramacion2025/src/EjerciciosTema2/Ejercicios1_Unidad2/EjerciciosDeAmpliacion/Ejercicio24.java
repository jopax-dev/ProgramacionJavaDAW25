package EjerciciosTema2.Ejercicios1_Unidad2.EjerciciosDeAmpliacion;

public class Ejercicio24 {
    /*
        Escribe un metodo, de nombre esFechaValida, que reciba como parámetros tres valores enteros con el
        día, mes y año de una fecha y devuelva un valor booleano que indique si se trata de valores válidos para
        una fecha. Si puedes comprueba también que el año sea bisiesto.
     */

    public static boolean esBisiesto(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static boolean esFechaValida(int day, int month, int year) throws Exception {

        if(month < 1 || month > 12){
            throw new Exception("Introduce un mes valido");
        }

        if (day < 1 || day > 31){
            throw new Exception("Has introducido un día no valido");
        }

        switch (month) {
            case 2:
                if (day > 29){
                    throw new Exception("Febrero no tiene tantos días");
                } else if (day > 28 && !esBisiesto(year)) {
                    throw new Exception("Ese año no es bisiesto, Febrero tiene 28 dias");
                }
            case 4, 6, 9, 11:
                if (day > 30) throw new Exception("Este mes no tiene 31 días");;
        }

        return true;
    }

    public static void main(String[] args) {
        try {
            System.out.println(esFechaValida(29, 2, 2023));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
