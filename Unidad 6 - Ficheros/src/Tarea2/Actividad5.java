package Tarea2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class Actividad5 {
    public static void main(String[] args) {
        ObjectInputStream in = null;

        try {
            FileInputStream archivo = new FileInputStream("ficheros_binarios/ej4.dat");
            in = new ObjectInputStream(archivo);
            System.out.println(Arrays.toString((double[]) in.readObject()));
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
