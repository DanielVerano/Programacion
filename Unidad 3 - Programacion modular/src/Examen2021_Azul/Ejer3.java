package Examen2021_Azul;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String posRey, posReina;

        do {
            System.out.println("Introduce la posición del rey:");
            posRey = sc.nextLine();
            System.out.println("Introduce la posición de la reina:");
            posReina = sc.nextLine();

            if (!posicionEsCorrecta(posRey)) {
                System.out.println("La posición del rey no es correcta");
            } else if (!posicionEsCorrecta(posReina)) {
                System.out.println("La posición de la reina no es correcta");
            }
        }
        while (!posicionEsCorrecta(posRey) || !posicionEsCorrecta(posReina));

        if (jaque(posRey, posReina)) {
            System.out.println("El rey está en jaque");
        } else {
            System.out.println("El rey no está en jaque");
        }
    }

    public static boolean jaque(String posRey, String posReina) {
        Character[][] tablero = new Character[8][8];
        int reyFila, reyCol, reinaFila, reinaCol;

        reyCol = obtenerColumna(posRey.charAt(0));
        reyFila = 8 - Integer.parseInt(""+posRey.charAt(1));
        reinaCol = obtenerColumna(posReina.charAt(0));
        reinaFila = 8 - Integer.parseInt(""+posReina.charAt(1));

        for (Character[] fila : tablero) {
            Arrays.fill(fila, '-');
        }

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (moverReina(reinaFila, reinaCol, i, j)) {
                    tablero[i][j] = 'X';
                }
            }
        }

        tablero[reyFila][reyCol] = 'K';
        tablero[reinaFila][reinaCol] = 'Q';

        for (Character[] fila : tablero) {
            System.out.println(Arrays.toString(fila));
        }

        return moverReina(reinaFila, reinaCol, reyFila, reyCol);
    }

    public static int obtenerColumna(Character c) {
        Character[] columnas = {'a','b','c','d','e','f','g','h'};

        for (int i = 0; i < columnas.length; i++) {
            if (columnas[i] == c) {
                return i;
            }
        }
        return -1;
    }

    public static boolean moverAlfil(int posFila, int posCol, int i, int j) {
        return posFila - posCol == i - j || posFila + posCol == i + j;
    }

    public static boolean moverTorre(int posFila, int posCol, int i, int j) {
        return i == posFila && j != posCol || j == posCol && i != posFila;
    }

    public static boolean moverReina(int posFila, int posCol, int i, int j) {
        return moverAlfil(posFila, posCol, i, j) || moverTorre(posFila, posCol, i, j);
    }

    public static boolean posicionEsCorrecta(String posicion) {
        if (posicion.length() == 2) {
            int col = obtenerColumna(posicion.charAt(0));
            int fila = 8 - Integer.parseInt(""+posicion.charAt(1));

            return (col >= 0 && col <= 7) && (fila >= 0 && fila <= 7);
        }
        return false;
    }
}
