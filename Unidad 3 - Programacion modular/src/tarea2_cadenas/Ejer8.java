package tarea2_cadenas;

import java.util.Scanner;

public class Ejer8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dialecto1 = "Javalín, javalón ";
        String dialecto2 = " javalén, len, len";
        String respuesta;

        System.out.println("Introduce una frase:");
        respuesta = sc.nextLine();

        if (respuesta.length() >= dialecto2.length() &&
                respuesta.substring(respuesta.length() - dialecto2.length()).equals(dialecto2)) {
            String mensaje = respuesta.substring(0, respuesta.length() - dialecto2.length()).trim();
            System.out.println("La frase está escrita en el idioma de Javalandia 1");
            System.out.println(mensaje);
        } else if (respuesta.length() >= dialecto1.length() &&
                respuesta.substring(0, dialecto1.length()).equals(dialecto1)) {
            String mensaje = respuesta.substring(dialecto1.length()).trim();
            System.out.println(mensaje);
            System.out.println("La frase está escrita en el idioma de Javalandia 2");
        } else {
            System.out.println(respuesta + " no está escrito en el idioma de Javalandia");
        }

        /*if (respuesta.startsWith(dialecto1)) {
            System.out.println("Esta frase está escrita en el idioma de Javalandia");
            String mensaje = respuesta.substring(17);
            System.out.println(mensaje);
        } else if (respuesta.endsWith(dialecto2)) {
            System.out.println("Esta frase está escrita en el idioma de Javalandia");
            String mensaje = respuesta.substring(0, respuesta.length()-1-16);
            System.out.println(mensaje);
        } else {
            System.out.println("Esta frase no está escrita en el idioma de Javalandia");
        }*/
    }
}
