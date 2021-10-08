package ejerciciosWhile;

import java.util.Scanner;

public class Ejer616 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int login = 0;
        int pass = 0;

        while (login != 1809 || pass != 1234) {
            System.out.println("Introduzca su login:");
            login = sc.nextInt();
            System.out.println("Introduzca su contraseña:");
            pass = sc.nextInt();
        }
    }
}
