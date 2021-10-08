package ejerciciosFor;

import java.util.Scanner;

public class Ejer635 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Introduce un número mayor que 0:");
        numero = sc.nextInt();

        for (int i = 0; i <= numero; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
