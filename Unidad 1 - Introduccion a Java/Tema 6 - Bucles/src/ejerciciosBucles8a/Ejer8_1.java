package ejerciciosBucles8a;

import java.util.Scanner;

public class Ejer8_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = -1;

        while (num != 0) {
            System.out.print("Introduzca un número: ");
            num = sc.nextInt();

            if (num % 2 == 0 && num > 0) {
                System.out.println(num + " es par y positivo.");
            } else if (num > 0) {
                System.out.println(num + " es positivo.");
            } else if (num % 2 == 0) {
                System.out.println(num + " es par.");
            }
            System.out.println("Cuadrado de " + num + ": " + ((int) Math.pow(num, 2)));
        }
    }
}
