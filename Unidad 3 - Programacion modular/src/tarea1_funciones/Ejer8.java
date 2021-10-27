package tarea1_funciones;

public class Ejer8 {
    public static void main(String[] args) {
        System.out.println(divisoresPrimos(26));
    }

    public static int divisoresPrimos(int numero) {
        int contador = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0 && esPrimo(i)) {
                    contador++;
            }
        }
        return contador;
    }

    public static boolean esPrimo(int numero) {
        boolean resultado = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                resultado = false;
                break;
            }
        }
        return resultado;
    }
}
