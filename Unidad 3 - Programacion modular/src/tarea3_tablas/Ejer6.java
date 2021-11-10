package tarea3_tablas;

import java.util.Arrays;

public class Ejer6 {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 3, 4, 4};
        System.out.println(Arrays.toString(sinRepetidos(array)));
    }

    public static int[] sinRepetidos(int[] t) {
        int[] resultado = new int[1];
        boolean esta;

        for (int i = 0; i < t.length; i++) {
            int n = t[i];
            esta = false;

            for (int j = i + 1; j < t.length; j++) {
                if (n == t[j]) {
                    esta = true;
                    break;
                }
            }

            if (!esta) {
                int[] aux = new int[resultado.length + 1];
                aux[i] = n;
                resultado = aux;
            }
        }

        return resultado;
    }
}
