package tarea2_cadenas;

import java.util.Scanner;

public class Ejer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass;
        String respuesta = "";

        System.out.println("Introduce una contraseña:");
        pass = sc.nextLine();

        while (!respuesta.equals(pass)) {
            System.out.println("Introduce su respuesta:");
            respuesta = sc.nextLine();

            for (int i = 0; i < pass.length(); i++) {
                if (respuesta.charAt(i) < pass.charAt(i)) {
                    System.out.println("Menor");
                    break;
                } else if (respuesta.charAt(i) > pass.charAt(i)) {
                    System.out.println("Mayor");
                    break;
                }
            }
        }
    }
}
