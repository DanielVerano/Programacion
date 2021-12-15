import java.util.Arrays;
import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v1, v2;
        int tam;

        System.out.println("Introduce el tamaño del primer vector:");
        tam = sc.nextInt();
        v1 = new int[tam];

        for (int i = 0; i < v1.length; i++) {
            System.out.println("Introduce el valor " + i + " del primer vector:");
            v1[i] = sc.nextInt();
        }

        System.out.println("Introduce el tamaño del segundo vector:");
        tam = sc.nextInt();
        v2 = new int[tam];

        for (int i = 0; i < v2.length; i++) {
            System.out.println("Introduce el valor " + i + " del segundo vector:");
            v2[i] = sc.nextInt();
        }

        System.out.println("Vector 1: " + Arrays.toString(v1));
        System.out.println("Vector 2: " + Arrays.toString(v2));
        System.out.println("Vector resultado: " + Arrays.toString(mediaVectores(v1, v2)));
    }

    public static float[] mediaVectores(int[] a, int[] b) {
        float[] res = new float[0];
        int[] vMayor, vMenor;

        if (a.length > b.length) {
            vMayor = a;
            vMenor = b;
        } else {
            vMayor = b;
            vMenor = a;
        }

        for (int i = 0; i < vMenor.length; i++) {
            res = Arrays.copyOf(res, res.length + 1);
            res[res.length - 1] = (float) (a[i] + b[i]) / 2;
        }

        for (int i = vMenor.length; i < vMayor.length; i++) {
            res = Arrays.copyOf(res, res.length + 1);
            res[res.length - 1] = vMayor[i];
        }

        return res;
    }
}
