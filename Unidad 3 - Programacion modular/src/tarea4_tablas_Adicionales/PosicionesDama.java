package tarea4_tablas_Adicionales;

import java.util.Arrays;
import java.util.Scanner;

public class PosicionesDama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la posición de la dama:");
        String posicion = sc.nextLine();
        System.out.println("La dama puede moverse a las siguientes posiciones: " + posicionesDama(posicion));
    }

    public static String posicionesDama(String posicion) {
        Character[] columnas = {'a','b','c','d','e','f','g','h'};
        String posiciones = "";
        char[][] tablero = new char[8][8];

        int col = obtenerColumna(columnas, posicion.charAt(0));
        int fila = 8 - Integer.parseInt(""+posicion.charAt(1));

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
//                (j == col && i != fila) || (i == fila && j != col) || i + j == fila + col || i - j == fila - col
                if (moverAlfil(i, j, fila, col) || moverTorre(i, j, fila, col)) {
                    posiciones += columnas[j] + "" + (8 - i) + " ";
                    tablero[i][j] = '*';
                } else {
                    tablero[i][j] = '-';
                }
            }
        }
        tablero[fila][col] = 'X';

        for (char[] row : tablero) {
            System.out.println(Arrays.toString(row));
        }
        return posiciones;
    }

    public static int obtenerColumna(Character[] columnas, char posicion) {
        for (int i = 0; i < columnas.length; i++) {
            if (columnas[i] == posicion) {
                return i;
            }
        }
        return -1;
    }

    public static boolean moverTorre(int i, int j, int fila, int col) {
        return (i == fila && j != col) || (j == col && i != fila);
    }

    public static boolean moverAlfil(int i, int j, int fila, int col) {
        return ((i + j == fila + col || i - j == fila - col) && (i != fila || j != col));
    }
}
