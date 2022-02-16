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
                BufferedWriter out = new BufferedWriter(new FileWriter("ficheros/firmas.txt", true));
                String[] nombres = new String[0];
                String linea = in.readLine();

//                Volcar todos los nombres al vector
                while (linea != null) {
                    nombres = Arrays.copyOf(nombres, nombres.length + 1);
                    nombres[nombres.length - 1] = linea;
                    linea = in.readLine();
                }

                boolean existeNombre = false;
                for (int i = 0; i < nombres.length; i++) {
                    if (nombres[i].equals(nombre)) {
                        existeNombre = true;
                        break;
                    }
                }

                if (!existeNombre) {
                    out.newLine();
                    out.write(nombre);
                } else {
                    System.out.println("El nombre ya existe");
                }
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
