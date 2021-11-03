package examenAzul;

import java.util.Scanner;

public class Ejer1Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta;

        System.out.println("Introduce el número de cuenta:");
        respuesta = sc.nextLine();

        if (respuesta.length() == 23 && respuesta.charAt(4) == '-'
                && respuesta.charAt(9) == '-' && respuesta.charAt(12) == '-') {
            String entidad = "";
            String sucursal = "";
            String numControl = "";
            String numCuenta = "";

            for (int i = 0; i < respuesta.length(); i++) {
                if (i <= 3) {
                    entidad += respuesta.charAt(i);
                } else if (i > 4 && i <= 8) {
                    sucursal += respuesta.charAt(i);
                } else if (i > 9 && i <= 11) {
                    numControl += respuesta.charAt(i);
                } else if (i > 12) {
                    numCuenta += respuesta.charAt(i);
                }
            }

            boolean esPrimo = true;
            int numCuenta2 = Integer.parseInt(numCuenta);

            for (int i = 2; i < numCuenta2; i++) {
                if (numCuenta2 % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (entidad.equals("2222") && sucursal.equals("3333")
            && numControl.equals("44") && esPrimo) {
                System.out.println("Es un número de cuenta válido.");
            } else {
                System.out.println("El número de cuenta no es primo");
            }

        } else {
            System.out.println("No es un número de cuenta válido");
        }
    }
}
