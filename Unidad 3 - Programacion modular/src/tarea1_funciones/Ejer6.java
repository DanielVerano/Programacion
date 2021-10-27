package tarea1_funciones;

public class Ejer6 {
    public static void main(String[] args) {
        System.out.println(esVocal('a'));
    }

    public static boolean esVocal(char c) {
        boolean resultado = false;
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            resultado = true;
        }
        return resultado;
    }
}
