package Tarea1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String texto = "";
        System.out.println("Introduce el nombre del fichero:");
        nombre = sc.nextLine();

        nombre = nombre.isEmpty() ? "prueba.txt" : nombre;

        try {
            BufferedReader in = new BufferedReader(new FileReader("ficheros/" + nombre));
            String linea = in.readLine();

            while (linea != null) {
                texto += linea + "\n";
                linea = in.readLine();
            }
            in.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(texto);
    }
}
