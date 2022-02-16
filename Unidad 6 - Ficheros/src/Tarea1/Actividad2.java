package Tarea1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su nombre:");
        String nombre = sc.nextLine();
        System.out.println("Introduzca su edad:");
        String edad = sc.nextLine();

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("ficheros/datos.txt"));
            out.write("Nombre:" + nombre + "\n");
            out.write("Edad:" + edad);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
