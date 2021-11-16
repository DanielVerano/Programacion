package tarea4_tablas_Adicionales;

public class Ejer4 {
    public static void main(String[] args) {
//        a - h = columnas; 1 - 8 = filas
        posicionesAlfil("d5");
    }

    public static void posicionesAlfil(String posicion) {
        boolean esCorrecta = posicionEsCorrecta(posicion);

        if (esCorrecta) {
            int posCol = posicion.charAt(0) - 'a';
            int posFila = Character.getNumericValue(posicion.charAt(1)) - 1;
            int[][] tablero = new int[8][8];
            String posiciones = "";

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

    public static boolean posicionEsCorrecta(String posicion) {
        if (posicion.length() == 2) {
            int posCol = posicion.charAt(0) - 'a';
            int posFila = Character.getNumericValue(posicion.charAt(1)) - 1;

            if ((posCol >= 0 && posCol <= 7) && (posFila >= 0 && posFila <= 7)) {
                return true;
            }
        }
        return false;
    }
}
