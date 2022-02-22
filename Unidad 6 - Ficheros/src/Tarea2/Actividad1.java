package Tarea2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número double:");
        double numero = sc.nextDouble();
        ObjectOutputStream out = null;

        try {
            FileOutputStream archivo = new FileOutputStream(
                    "ficheros_binarios/ej1.dat");
            out = new ObjectOutputStream(archivo);
            out.writeObject(numero);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
