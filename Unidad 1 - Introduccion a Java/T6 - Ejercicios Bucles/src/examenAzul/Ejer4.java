package examenAzul;

import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta;
        int numVerdaderas = 0;
        final int PUNTOS_VERDADERO = 3;

        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("verdadero")) {
            numVerdaderas++;
        }
    }
}
