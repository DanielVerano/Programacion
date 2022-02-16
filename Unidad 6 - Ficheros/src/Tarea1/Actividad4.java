package Tarea1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Actividad4 {
    public static void main(String[] args) {
        int caracteres = 0;
        int lineas = 0;
        int palabras = 0;

        try {
            BufferedReader in = new BufferedReader(new FileReader("ficheros/carta.txt"));
            int c = 0;
            String linea = in.readLine();

            while (linea != null) {
                caracteres += linea.length();
                palabras += numPalabras(linea);
                lineas++;
                linea = in.readLine();
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Caracteres:" + caracteres);
        System.out.println("Palabras:" + palabras);
        System.out.println("Lineas:" + lineas);
    }

    public static int numPalabras(String linea) {
        int numPalabras = 0;
        boolean enPalabra = false;

        for (int i = 0; i < linea.length(); i++) {
            if (linea.charAt(i) != ' ' && !enPalabra) {
                enPalabra = true;
                numPalabras++;
            } else if (linea.charAt(i) == ' ') {
                enPalabra = false;
            }
        }
        return numPalabras;
    }
}
