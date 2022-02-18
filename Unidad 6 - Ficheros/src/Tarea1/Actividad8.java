package Tarea1;

import java.io.*;
import java.util.Arrays;

public class Actividad8 {
    public static void main(String[] args) {
        String[] nombres = new String[0];

        try {
//            Leer los ficheros y volcarlos a un vector
            BufferedReader in = new BufferedReader(
                    new FileReader("ficheros/perso1.txt"));
            String linea = in.readLine();

            while (linea != null) {
                nombres = Arrays.copyOf(nombres, nombres.length + 1);
                nombres[nombres.length - 1] = linea;
                linea = in.readLine();
            }
            in.close();

            in = new BufferedReader(new FileReader("ficheros/perso2.txt"));
            linea = in.readLine();

            while (linea != null) {
                nombres = Arrays.copyOf(nombres, nombres.length + 1);
                nombres[nombres.length - 1] = linea;
                linea = in.readLine();
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
//            Crear el nuevo fichero con todos los nombres ordenados
            BufferedWriter out = new BufferedWriter(new FileWriter("ficheros/todos.txt"));
            Arrays.sort(nombres);

            for (String nombre : nombres) {
                out.write(nombre);
                out.newLine();
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
