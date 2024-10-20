package EjerciciosRepasoT1yT2;

public class Ejercicio10 {
    /*
        Realiza un programa que genere una apuesta de la quiniela de forma aleatoria, son 14 filas donde debe
        aparecer 1 X o 2. Intenta que los unos salgan en una columna, las equis en otra y los doses en otra.
     */
    public static void main(String[] args) {
        int apuesta;
        String resultado = "", nApuesta;
        System.out.print("""
                
                Apuesta |  1  |  X  |  2  |
                
                """);
        for (int i = 1; i < 15 ; i++) {
            apuesta = (int) (Math.random() * 3 + 1);

            switch (apuesta){
                case 1:
                    resultado = """
                        |  1  |     |     |
                        """;
                    break;
                case 2:
                    resultado = """
                        |     |  X  |     |
                        """;
                    break;
                default:
                    resultado = """
                        |     |     |  2  |
                        """;
                    break;
            }

            nApuesta = i < 10 ? "0"+i : ""+i;

            System.out.printf("""
                       %s   %s
                    """,(String) nApuesta, resultado);
        }
    }
}
