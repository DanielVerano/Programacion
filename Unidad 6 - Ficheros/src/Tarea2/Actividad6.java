package Tarea2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Actividad6 {
    public static void main(String[] args) {
        ObjectInputStream in = null;

        try {
            FileInputStream archivo = new FileInputStream("ficheros_binarios/ej4.dat");
            in = new ObjectInputStream(archivo);
            double[] tabla = (double[]) in.readObject();

            for (int i = 0; i < tabla.length; i++) {
                System.out.println(tabla[i]);
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
