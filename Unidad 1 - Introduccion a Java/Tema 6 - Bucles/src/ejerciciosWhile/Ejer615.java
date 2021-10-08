package ejerciciosWhile;

import java.util.Scanner;

public class Ejer615 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pass;

        System.out.println("Introduzca su contraseña:");
        pass = sc.nextInt();

        while (pass != 1234) {
            System.out.println("Contraseña incorrecta:");
            pass = sc.nextInt();
        }
    }
}
