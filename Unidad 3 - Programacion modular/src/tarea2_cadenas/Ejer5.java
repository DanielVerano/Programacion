package tarea2_cadenas;

import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String resultado = "";

        System.out.println("Introduce su nombre:");
        nombre = sc.nextLine();

        for (int i = 0; i < nombre.length(); i++) {
            if (!esVocal(nombre.charAt(i))) {
                resultado += nombre.charAt(i);
            }
        }
        System.out.println("Nombre modificado: " + resultado);
    }

    public static boolean esVocal(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' ||c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
                c == 'á' || c == 'é' || c == 'í' || c == 'ó' || c == 'ú' ||
                c == 'Á' || c == 'É' || c == 'Í' || c == 'Ó' || c == 'Ú') {
            return true;
        }
        return false;
    }
}
