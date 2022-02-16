package Tarea1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Actividad5 {
    public static void main(String[] args) {
        int menor = 0;
        int mayor = 0;

        try {
            BufferedReader in = new BufferedReader(new FileReader("ficheros/numeros.txt"));
            String linea = in.readLine();
            int numero = Integer.parseInt(linea);
            menor = numero;
            mayor = numero;

            while (linea != null) {
                numero = Integer.parseInt(linea);
                if (numero > mayor) {
                    mayor = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
                linea = in.readLine();
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Número menor:" + menor);
        System.out.println("Número mayor:" + mayor);
    }
}
