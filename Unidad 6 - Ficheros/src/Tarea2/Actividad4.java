package Tarea2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros;

        System.out.println("Introduce la cantidad de números a añadir:");
        int n = sc.nextInt();
        numeros = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Introduce un número double:");
            numeros[i] = sc.nextDouble();
        }

        ObjectOutputStream out = null;
        try {
            FileOutputStream archivo = new FileOutputStream("ficheros_binarios/ej4.dat");
            out = new ObjectOutputStream(archivo);
            out.writeObject(numeros);

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
    }
}
