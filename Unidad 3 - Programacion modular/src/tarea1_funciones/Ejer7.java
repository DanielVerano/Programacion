package tarea1_funciones;

public class Ejer7 {
    public static void main(String[] args) {
        System.out.println(esPrimo(11));
        System.out.println(esPrimo(4));
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
