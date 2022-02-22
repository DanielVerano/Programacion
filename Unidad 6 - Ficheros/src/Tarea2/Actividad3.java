package Tarea2;

import java.io.*;
import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ObjectOutputStream out = null;

//        Escribir números
        try {
            FileOutputStream archivo = new FileOutputStream("ficheros_binarios/ej3.dat");
            out = new ObjectOutputStream(archivo);

            while (true) {
                System.out.println("Introduce un número positivo (negativo para parar):");
                int num = sc.nextInt();

                if (num < 0) {
                    break;
                }

                out.writeObject(num);
            }
            out.close();

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

//        Leer los números
        ObjectInputStream in = null;
        try {
            FileInputStream archivo = new FileInputStream("ficheros_binarios/ej3.dat");
            in = new ObjectInputStream(archivo);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            while (true) {
                System.out.println(in.readObject());
            }
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
