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
        char[] vocales = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U', 'á', 'é', 'í', 'ó', 'ú', 'Á', 'É', 'Ì', 'Ò', 'Ú'};
        for (int i = 0; i < vocales.length; i++) {
            if (c == vocales[i]) {
                return true;
            }
        }
        return false;
    }
}
