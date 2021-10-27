package tarea2_cadenas;

import java.util.Scanner;

public class Ejer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass;
        String respuesta = "";

        System.out.println("Acierta la contraseña");
        System.out.println("Introduce una contraseña:");
        pass = sc.nextLine();

        System.out.println("Pistas:");
        System.out.println("Número de caracteres: " + pass.length());
        System.out.println("Primera letra: " + pass.charAt(0));
        System.out.println("Última letra: " + pass.charAt(pass.length()-1));

        while (!respuesta.equals(pass)) {
            System.out.println("Introduce su respuesta:");
            respuesta = sc.nextLine();

            if (respuesta.equals(pass)) {
                System.out.println("Acertaste");
            } else {
                System.out.println("Fallaste");
            }
        }
    }
}
