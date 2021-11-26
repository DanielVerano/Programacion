package Examen2021_Azul;

import java.util.Arrays;

public class Ejer3 {
    public static void main(String[] args) {
        jaque("a5","h4");
    }

    public static boolean jaque(String posRey, String posReina) {
        Character[][] tablero = new Character[8][8];
        Character[] columnas = {'a','b','c','d','e','f','g','h'};

        int reyFila, reyCol, reinaFila, reinaCol;

        reyCol = obtenerColumna(posRey.charAt(0), columnas);
        reyFila = 8 - Integer.parseInt(""+posRey.charAt(1));
        reinaCol = obtenerColumna(posReina.charAt(0), columnas);
        reinaFila = 8 - Integer.parseInt(""+posReina.charAt(1));

        tablero[reyFila][reyCol] = 'r';
        tablero[reinaFila][reinaCol] = 'R';

        for (Character[] fila : tablero) {
            System.out.println(Arrays.toString(fila));
        }

        return false;
    }

    public static int obtenerColumna(Character c, Character[] columnas) {
        for (int i = 0; i < columnas.length; i++) {
            if (columnas[i] == c) {
                return i;
            }
        }
        return 0;
    }
}
