package Tarea2;

import java.io.*;

public class Actividad8 {
    public static void main(String[] args) {
        /*
         * Actividad 8: Crear una tabla de números aleatorios menores que 100,
         * ordenados de menor a mayor, y guardarlos en un fichero binario.
         * A continuación, recuperarlos y mostrarlos por consola.
         */
        int[] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100);
        }

        ObjectOutputStream out = null;

        try {
            FileOutputStream archivo = new FileOutputStream("ficheros_binarios/ej8.dat");
            out = new ObjectOutputStream(archivo);

            for (int i = 0; i < numeros.length; i++) {
                out.writeObject(numeros[i]);
            }
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
            FileInputStream archivo = new FileInputStream("ficheros_binarios/ej8.dat");
            in = new ObjectInputStream(archivo);

            try {
                while (true) {
                    System.out.println(in.readObject());
                }
            } catch (EOFException | ClassNotFoundException e) {
                System.out.println("Fin del fichero");
            }
        } catch (IOException e) {
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
