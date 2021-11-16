package tarea4_tablas_Adicionales;

public class Ejer4 {
    public static void main(String[] args) {
        posicionesAlfil("d5");
    }

    public static void posicionesAlfil(String posicion) {
        int posCol = posicion.charAt(0) - 'a';
        int posFila = Character.getNumericValue(posicion.charAt(1)) - 1;
        String posiciones = "";

        if (posicion.length() == 2 && (posCol >= 0 && posCol <= 7) && (posFila >= 0 && posFila <= 7)) {
            int[][] tablero = new int[8][8];

            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    if ((i + j == posFila + posCol || i - j == posFila - posCol) && (i != posFila && j != posCol)) {
                        char col = (char) (j + 'a');
                        int fila = i + 1;
                        posiciones += col + "" + fila + " ";
                    }
                }
            }

            System.out.println("El alfil puede moverse a las siguientes posiciones: " + posiciones);
        } else {
            System.out.println("La posicion introducida es incorrecta");
        }
    }
}
