package Entregable_David;

import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] tablero = new int[8][8];
        Character[] columnas = {'a','b','c','d','e','f','g','h'};
        StringBuilder posiciones = new StringBuilder();

        System.out.println("Introduce la posición del alfil:");
        String posicion = sc.nextLine();

        int col = obtenerColumna(posicion.charAt(0), columnas);
        int fila = 8 - Integer.parseInt(""+posicion.charAt(1));

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (moverAlfil(fila, col, i, j)) {
                    posiciones.append(columnas[j]).append(8-i).append(" ");
                }
            }
        }

        System.out.println(posiciones);
    }

    public static boolean moverAlfil(int fila, int col, int i, int j) {
        return (fila - col == i - j || fila + col == i + j) && (i != fila || j != col);
    }

    public static int obtenerColumna(Character c, Character[] columnas) {
        for (int i = 0; i < columnas.length; i++) {
            if (columnas[i] == c) {
                return i;
            }
        }
        return -1;
    }
}
