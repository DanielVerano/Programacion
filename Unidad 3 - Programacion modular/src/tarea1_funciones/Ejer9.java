package tarea1_funciones;

public class Ejer9 {
    public static void main(String[] args) {
        System.out.println(divisoresPrimos(100));
    }

    public static String divisoresPrimos(int numero) {
        String resultado = "";
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0 && esPrimo(i)) {
                resultado += i + " ";
            }
        }
        return "Divisores primos de " + numero + ": " + resultado;
    }

    public static boolean esPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
