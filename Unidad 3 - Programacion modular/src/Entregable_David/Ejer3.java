package Entregable_David;

import java.util.Arrays;

public class Ejer3 {
    public static void main(String[] args) {
        int[] a = new int[]{5,8,9,12,18,55,81,100,288};
        int[] b = new int[]{3,5,7,9,11};
        System.out.println(Arrays.toString(a));
        System.out.println("Filtrado: " + Arrays.toString(filtraCon8(a)));
        System.out.println(Arrays.toString(b));
        System.out.println("Filtrado: " + Arrays.toString(filtraCon8(b)));
    }

    public static int[] filtraCon8(int[] x) {
        int[] res = new int[0];

        for (int i = 0; i < x.length; i++) {

            if (tieneOcho(x[i])) {
                res = Arrays.copyOf(res, res.length + 1);
                res[res.length - 1] = x[i];
            }
        }

        if (res.length == 0) {
            return new int[]{-1};
        }
        return res;
    }

    public static boolean tieneOcho(int n) {
        while (n > 0) {
            int digito = n % 10;

            if (digito == 8) {
                return true;
            }

            n /= 10;
        }
        return false;
    }
}
