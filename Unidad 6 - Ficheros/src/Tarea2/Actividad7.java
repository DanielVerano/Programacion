package Tarea2;

import java.io.*;
import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {
        /*
        * Actividad 7: Escribir por teclado una frase y guardarla
        * en un archivo binario. A continuación, recuperarla del archivo
        * y mostrarla por pantalla.
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una frase:");
        String frase = sc.nextLine();

        ObjectOutputStream out = null;

        try {
            FileOutputStream archivo = new FileOutputStream("ficheros_binarios/ej7.dat");
            out = new ObjectOutputStream(archivo);
            out.writeObject(frase);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        ObjectInputStream in = null;

        try {
            FileInputStream archivo = new FileInputStream("ficheros_binarios/ej7.dat");
            in = new ObjectInputStream(archivo);
            System.out.println(in.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
