package tarea2_cadenas;

public class Ejer1 {
    public static void main(String[] args) {
        palabraMasCorta("hola", "adios");
        palabraMasCorta("palabra2", "palabra2");
    }

    public static void palabraMasCorta(String c1, String c2) {
        if (c1.length() > c2.length()) {
            System.out.println(c2 + " es la más corta");
        } else if (c2.length() > c1.length()) {
            System.out.println(c1 + " es la más corta");
        } else {
            System.out.println(c1 + " y " + c2 + " son iguales en longitud");
        }
    }
}
