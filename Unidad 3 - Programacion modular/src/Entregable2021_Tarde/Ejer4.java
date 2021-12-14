package Entregable2021_Tarde;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] a;
        int tam;
        String posicion;
        boolean muerto = false;

        System.out.println("Introduce la dimensión del array:");
        tam = sc.nextInt();
        a = new char[tam][tam];

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
            System.out.println("Introduce una posición:");
            posicion = sc.nextLine();
            int x = Integer.parseInt(""+posicion.charAt(0));
            int y = Integer.parseInt(""+posicion.charAt(2));

            if (a[x][y] == 'X') {
                System.out.println("La posición " + posicion + " tiene una bomba, está muerto");
                muerto = true;
            } else {
                int bombas = calcularBombas(a, x, y);

                System.out.println("La posición " + posicion + " tiene " + bombas + " bombas a los alrededores");
            }
        }
        while (!muerto);
    }

    public static boolean estaDentro(int i, int j, int tam) {
        return i >= 0 && i < tam && j >= 0 && j < tam;
    }

    public static int calcularBombas(char[][] tablero, int fila, int col) {
        int bombas = 0;

        for (int i = fila - 1; i <= fila + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (estaDentro(i, j, tablero.length) && tablero[i][j] == 'X') {
                    bombas++;
                }
            }
        }
        return bombas;
    }
}
