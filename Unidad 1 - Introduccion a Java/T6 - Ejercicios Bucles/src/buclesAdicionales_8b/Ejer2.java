package buclesAdicionales_8b;

import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce un número:");
        num = sc.nextInt();

        for (int i = num; i <= num + 5; i++) {
            System.out.println("Número: " + i + "\tCuadrado: " + (int) Math.pow(i, 2) + "\tCubo: " + (int) Math.pow(i, 3));
        }
    }
}
