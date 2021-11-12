package tarea3_tablas;

import java.util.Arrays;

public class Ejer6 {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 3, 4, 4};
        System.out.println(Arrays.toString(sinRepetidos(array)));
    }

    public static int[] sinRepetidos(int[] t) {
        int[] resultado = new int[0];

        for (int i = 0; i < t.length; i++) {
            int n = t[i];

            if (!esta(resultado, n)) {
                resultado = Arrays.copyOf(resultado, resultado.length + 1);
                resultado[resultado.length - 1] = n;
            }
        }
        return resultado;
    }

    public static boolean esta(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                return true;
            }
        }
        return false;
    }
}
