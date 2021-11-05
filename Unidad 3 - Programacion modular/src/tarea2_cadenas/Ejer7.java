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

            if (respuesta.compareTo(pass) < 0) {
                System.out.println(respuesta + " es menor que " + pass);
            } else if (respuesta.compareTo(pass) > 0) {
                System.out.println(respuesta + " es mayor que " + pass);
            } else {
                System.out.println("Acertaste");
            }
        }
    }
}
