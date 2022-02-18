package Tarea1;

import java.io.*;
import java.util.Scanner;

public class Actividad9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] codec = null;
        System.out.println("Introduce el nombre del fichero:");
        String nombre = sc.nextLine();

        try {
//            Volcar abecedario y el codificado
            BufferedReader in = new BufferedReader(
                    new FileReader("ficheros/codec.txt"));
            String linea = in.readLine();
            codec = new char[2][26];
            codec[0] = linea.toCharArray();
            linea = in.readLine();
            codec[1] = linea.toCharArray();

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader in = new BufferedReader(
                    new FileReader("ficheros/" + nombre));
            BufferedWriter out = new BufferedWriter(
                    new FileWriter("ficheros/codif_" + nombre));

            int c = in.read();

            while (c != -1) {
                out.write(traducirLetra((char) c, codec));
                c = in.read();
            }
            in.close();
            out.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static char traducirLetra(char c, char[][] codex) {
        for (int j = 0; j < codex[0].length; j++) {
            if (codex[0][j] == c) {
                return codex[1][j];
            }
        }
        return '\n';
    }
}
