package tarea3_tablas;

import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantNumeros;

        System.out.println("Introduce cuántos números quiere introducir:");
        cantNumeros = sc.nextInt();

        int[] numeros = new int[cantNumeros];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un número para la posición " + i);
            numeros[i] = sc.nextInt();
        }

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}
