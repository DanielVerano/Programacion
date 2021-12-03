package tarea2_cadenas;

public class CuentaPalabras {
    public static void main(String[] args) {
        String cadena = "hola que tal";
        int numPalabras = 0;
        boolean esPalabra = false;

        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isLetter(cadena.charAt(i)) && i != cadena.length() - 1) {
                esPalabra = true;
            } else if (esPalabra) {
                esPalabra = false;
                numPalabras++;
            }
        }
        System.out.println("Palabras: " + numPalabras);
    }
}
