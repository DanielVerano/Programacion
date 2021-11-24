package Entregable2021_Tarde;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] a;
        int n, bombas;
        String posicion;
        boolean muerto = false;

        System.out.println("Introduce la dimensión del array:");
        n = sc.nextInt();
        a = new char[n][n];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                int r = (int) (Math.random() * 2);

                if (r == 0) {
                    a[i][j] = '-';
                } else {
//                    Bomba Código: String s = "\uD83D\uDCA3";
                    a[i][j] = 'X';
                }
            }
        }

        for (char[] row : a) {
            System.out.println(Arrays.toString(row));
        }

        sc.nextLine();

        do {
            bombas = 0;
            System.out.println("Introduce una posición:");
            posicion = sc.nextLine();
            int x = Integer.parseInt(""+posicion.charAt(0));
            int y = Integer.parseInt(""+posicion.charAt(2));

            if (a[x][y] == 'X') {
                System.out.println("La posición " + posicion + " tiene una bomba, está muerto");
                muerto = true;
            } else {
                for (int i = x - 1; i <= x + 1; i++) {
                    for (int j = y - 1; j <= y + 1; j++) {
                        if (estaDentro(i, j, n) && a[i][j] == 'X') {
                            bombas++;
                        }
                    }
                }

                System.out.println("La posición " + posicion + " tiene " + bombas + " bombas a los alrededores");
            }
        }
        while (!muerto);
    }

    public static boolean estaDentro(int i, int j, int n) {
        return i >= 0 && i < n && j >= 0 && j < n;
    }
}
