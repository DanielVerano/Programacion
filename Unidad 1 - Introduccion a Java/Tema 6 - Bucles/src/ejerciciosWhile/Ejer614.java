package ejerciciosWhile;

import java.util.Scanner;

public class Ejer614 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduzca un número entero:");
        num = sc.nextInt();

        while (num != 0) {
            System.out.println(num * num);

            System.out.println("Introduzca un número entero:");
            num = sc.nextInt();
        }
    }
}
