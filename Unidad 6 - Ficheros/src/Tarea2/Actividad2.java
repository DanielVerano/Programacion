package Tarea2;

import java.io.*;

public class Actividad2 {
    public static void main(String[] args) {
        try {
            FileInputStream archivo = new FileInputStream("ficheros_binarios/ej1.dat");
            ObjectInputStream in = new ObjectInputStream(archivo);
            double numero = (double) in.readObject();
            System.out.println(numero);
            in.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
