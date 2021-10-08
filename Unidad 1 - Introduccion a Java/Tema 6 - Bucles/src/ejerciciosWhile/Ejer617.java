package ejerciciosWhile;

import java.util.Scanner;

public class Ejer617 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i = 0;

        System.out.println("Introduzca el número de asteriscos a imprimir:");
        num = sc.nextInt();

        while (i < num) {
            System.out.print("*");
            i++;
        }
    }
}
