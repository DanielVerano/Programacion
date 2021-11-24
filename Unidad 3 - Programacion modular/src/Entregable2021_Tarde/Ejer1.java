package Entregable2021_Tarde;

import java.util.Arrays;

public class Ejer1 {
    public static void main(String[] args) {
        int[] a = new int[]{10,15,20};

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(filtraPrimos(a)));
    }

    public static int[] filtraPrimos(int[] array) {
        int[] res = new int[0];

        for (int i = 0; i < array.length; i++) {
            if (esPrimo(array[i])) {
                res = Arrays.copyOf(res, res.length + 1);
                res[res.length - 1] = array[i];
            }
        }
        return res.length == 0 ? new int[]{-1} : res;
    }

    public static boolean esPrimo(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
