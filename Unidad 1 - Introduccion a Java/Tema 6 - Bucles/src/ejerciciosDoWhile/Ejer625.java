package ejerciciosDoWhile;

import java.util.Scanner;

public class Ejer625 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user, pass;

        do {
            System.out.println("Introduzca su login:");
            user = sc.nextInt();
            System.out.println("Introduzca su pass:");
            pass = sc.nextInt();
        }
        while (user != 1809 || pass != 1234);
        System.out.println("Correcto");
    }
}
