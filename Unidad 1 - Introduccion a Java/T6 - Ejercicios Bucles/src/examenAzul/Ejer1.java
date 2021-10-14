package examenAzul;

import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numero;

        System.out.println("Introduce el número de cuenta:");
        numero = sc.nextLine();

        if (numero.length() == 23 && numero.charAt(4) == '-' && numero.charAt(9) == '-' && numero.charAt(12) == '-') {
            String entidad = numero.substring(0, 4);
            String sucursal = numero.substring(5, 9);
            String numControl = numero.substring(10, 12);
//            String numCuenta = numero.substring(13);

            if (entidad.equals("2222") && sucursal.equals("3333") && numControl.equals("44")) {
                System.out.println("Es un número de cuenta válido.");
            } else {
                System.out.println("No es un número de cuenta válido.");
            }
        } else {
            System.out.println("No es un número de cuenta válido.");
        }
    }
}
