package Tarea1;

import java.io.*;
import java.util.Scanner;

public class Actividad3B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del fichero:");
        String nombre = sc.nextLine();

        try {
            BufferedReader in = new BufferedReader(new FileReader("ficheros/" + nombre));
            BufferedWriter out = new BufferedWriter(new FileWriter("ficheros/copia_de_" + nombre));

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
