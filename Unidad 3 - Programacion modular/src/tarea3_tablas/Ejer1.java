package tarea3_tablas;

import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] tabla = new float[5];
        String valores = "";

        for (int i = 0; i < tabla.length; i++) {
            System.out.println("Introduce un número:");
            tabla[i] = sc.nextFloat();
        }

        for (int i = 0; i < tabla.length; i++) {
            valores += tabla[i] + " ";
        }

        System.out.println("Los valores introducidos son: " + valores);
    }
}
