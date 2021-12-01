package Verano_Moreno_U3_T1;

import java.util.Arrays;

public class Ejer1 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = {3,9,12,5,7};
        int[] r1 = interseccionVectores(a, b);
        System.out.println(Arrays.toString(r1));

        int[] c = {6,12,8,9,3,13};
        int[] d = {13,11,4,8,6,1};
        int[] r2 = interseccionVectores(c,d);
        System.out.println(Arrays.toString(r2));

        int[] e = {6,5,4,3,2,1,3,5,4};
        int[] f = {2,4,6,8,3,7,9,4,3,2};
        int[] r3 = interseccionVectores(e, f);
        System.out.println(Arrays.toString(r3));
    }

    public static int[] interseccionVectores(int[] v1, int[] v2) {
        int[] res = new int[0];

        for (int i = 0; i < v1.length; i++) {
            if (esta(v2, v1[i]) && !esta(res, v1[i])) {
                res = Arrays.copyOf(res, res.length + 1);
                res[res.length - 1] = v1[i];
            }
        }

        Arrays.sort(res);

        return res;
    }

    public static boolean esta(int[] v, int n) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == n) {
                return true;
            }
        }
        return false;
    }
}
