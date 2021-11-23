package tarea4_tablas_Adicionales;

import java.util.Arrays;
import java.util.Scanner;

public class PosicionesTorre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la posición de la torre:");
        String posicion = sc.nextLine();

        System.out.println("La torre puede moverse a las siguientes posiciones: " + posicionesTorre(posicion));
    }

    public static String posicionesTorre(String posicion) {
        Character[] columnas = {'a','b','c','d','e','f','g','h'};
        String posiciones = "";
        char[][] tablero = new char[8][8];

        int col = obtenerColumna(columnas, posicion.charAt(0));
        int fila = 8 - Integer.parseInt(""+posicion.charAt(1));

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if ((j == col && i != fila) || (i == fila && j != col)) {
                    posiciones += columnas[j] + "" + (8 - i) + " ";
                    tablero[i][j] = '*';
                } else if (i == fila && j == col) {
                    tablero[i][j] = 'X';
                } else {
                    tablero[i][j] = '-';
                }
            }
        }

        for (char[] row : tablero) {
            System.out.println(Arrays.toString(row));
        }

        /*int i, j;

//        Filas arriba
        i = fila - 1;
        j = col;
        while (estaDentro(i, j)) {
            posiciones += columnas[j] + "" + (8 - i) + " ";
            i--;
        }

//        Filas abajo
        i = fila + 1;
        while (estaDentro(i, j)) {
            posiciones += columnas[j] + "" + (8 - i) + " ";
            i++;
        }

//        Columnas izquierda
        i = fila;
        j = col - 1;
        while (estaDentro(i, j)) {
            posiciones += columnas[j] + "" + (8 - i) + " ";
            j--;
        }

//        Columnas derecha
        j = col + 1;
        while (estaDentro(i, j)) {
            posiciones += columnas[j] + "" + (8 - i) + " ";
            j++;
        }*/

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

    public static boolean estaDentro(int i, int j) {
        return i >= 0 && i <= 7 && j >= 0 && j <= 7;
    }
}
