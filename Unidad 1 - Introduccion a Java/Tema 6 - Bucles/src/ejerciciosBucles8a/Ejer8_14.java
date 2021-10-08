package ejerciciosBucles8a;

import java.util.Scanner;

public class Ejer8_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, anchura;

        System.out.println("Introduce un número:");
        altura = sc.nextInt();
        anchura = altura;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                System.out.print("*");
            }
            System.out.println();
            anchura--;
        }
    }
}
