import java.util.Arrays;
import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a;
        int tam;

        System.out.println("Introduce el tamaño del vector:");
        tam = sc.nextInt();
        a = new int[tam][tam];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * (201 - 100) + 100);
            }
        }

        for (int[] fila : a) {
            System.out.println(Arrays.toString(fila));
        }

        System.out.println("La matriz tiene " + numPicos(a) + " picos");

    }

    public static int numPicos(int[][] v) {
        int picos = 0;

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                if (esPico(v, i, j, v[i][j])) {
                    picos++;
                }
            }
        }

        return picos;
    }

    public static boolean estaDentro(int[][] v, int fila, int columna) {
        return fila >= 0 && fila < v.length && columna >= 0 && columna < v[0].length;
    }

    public static boolean esPico(int[][] v, int fila, int col, int numero) {
        for (int i = fila - 1; i <= fila + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (estaDentro(v, i, j) && v[i][j] > numero) {
                    return false;
                }
            }
        }
        return true;
    }
}
