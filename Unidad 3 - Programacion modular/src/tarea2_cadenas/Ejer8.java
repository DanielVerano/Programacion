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

        if (respuesta.startsWith(dialecto1)) {
            System.out.println("Esta frase está escrita en el idioma de Javalandia");
            String mensaje = respuesta.substring(17);
            System.out.println(mensaje);
        } else if (respuesta.endsWith(dialecto2)) {
            System.out.println("Esta frase está escrita en el idioma de Javalandia");
            String mensaje = respuesta.substring(0, respuesta.length()-1-16);
            System.out.println(mensaje);
        } else {
            System.out.println("Esta frase no está escrita en el idioma de Javalandia");
        }
    }
}
