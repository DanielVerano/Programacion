package Tarea1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre del fichero:");
        String nombre = sc.nextLine();
        int numLineas = 0;

        try {
            BufferedReader in = new BufferedReader(new FileReader("ficheros/" + nombre));
            String linea = in.readLine();

            while (linea != null) {
                System.out.println(linea);
                linea = in.readLine();
                numLineas++;

                if (numLineas >= 24) {
                    System.out.println("Seguir leyendo (Pulsa enter)");
                    sc.nextLine();
                    numLineas = 0;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
