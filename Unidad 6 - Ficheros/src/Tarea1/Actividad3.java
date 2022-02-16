package Tarea1;

import java.io.*;

public class Actividad3 {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("ficheros/original.txt"));
            BufferedWriter out = new BufferedWriter(new FileWriter("ficheros/copia.txt"));
            String linea = in.readLine();

            while (linea != null) {
                out.write(linea);
                out.newLine();
                linea = in.readLine();
                out.flush();
            }
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
