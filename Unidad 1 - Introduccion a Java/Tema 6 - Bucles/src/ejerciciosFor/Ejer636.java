package ejerciciosFor;

import java.util.Scanner;

public class Ejer636 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte altura, anchura;

        System.out.println("Introduce la altura:");
        altura = sc.nextByte();
        System.out.println("Introduce la anchura:");
        anchura = sc.nextByte();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
