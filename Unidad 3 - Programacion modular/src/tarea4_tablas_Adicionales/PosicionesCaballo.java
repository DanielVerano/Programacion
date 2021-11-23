package tarea4_tablas_Adicionales;

import java.util.Arrays;
import java.util.Scanner;

public class PosicionesCaballo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la posición del caballo:");
        String posicion = sc.nextLine();
        System.out.println("El caballo puede moverse a las siguientes posiciones: " + posicionesCaballo(posicion));
    }

    public static String posicionesCaballo(String posicion) {
        Character[] columnas = {'a','b','c','d','e','f','g','h'};
        String posiciones = "";
        char[][] tablero = new char[8][8];

        int col = obtenerColumna(columnas, posicion.charAt(0));
        int fila = 8 - Integer.parseInt(""+posicion.charAt(1));

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (moverCaballo(i, j, fila, col)) {
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

    public static boolean moverCaballo(int i, int j, int fila, int col) {
        return (j == col - 1 || j == col + 1) && (i == fila - 2 || i == fila + 2) ||
                (i == fila - 1 || i == fila + 1) && (j == col - 2 || j == col + 2);
    }
}
