package Tarea1;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija la opción que desee:");
        System.out.println("1 - Mostrar firmas");
        System.out.println("2 - Añadir un nuevo nombre (no repetido)");
        int opcion = sc.nextInt();
        sc.nextLine();

        if (opcion == 1) {
            try {
                BufferedReader in = new BufferedReader(new FileReader("ficheros/firmas.txt"));
                String linea = in.readLine();

                while (linea != null) {
                    System.out.println(linea);
                    linea = in.readLine();
                }
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (opcion == 2) {
            System.out.println("Introduzca el nombre a añadir:");
            String nombre = sc.nextLine();

            try {
                BufferedReader in = new BufferedReader(new FileReader("ficheros/firmas.txt"));
                String linea = in.readLine();
                boolean existeNombre = false;

                while (linea != null) {
                    if (linea.equals(nombre)) {
                        existeNombre = true;
                        break;
                    }
                    linea = in.readLine();
                }

                if (!existeNombre) {
                    BufferedWriter out = new BufferedWriter(
                            new FileWriter("ficheros/firmas.txt", true));
                    out.newLine();
                    out.write(nombre);
                    out.close();
                } else {
                    System.out.println("El nombre ya existe");
                }
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
