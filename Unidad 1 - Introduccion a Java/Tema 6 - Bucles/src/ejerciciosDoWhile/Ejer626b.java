package ejerciciosDoWhile;

import java.util.Scanner;

// Rectángulo lleno
public class Ejer626b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, anchura;
        int fila = 0;
        int columna = 0;

        System.out.println("Introduce la altura:");
        altura = sc.nextInt();
        System.out.println("Introduce la anchura:");
        anchura = sc.nextInt();

        while (fila < altura) {
            while (columna < anchura) {
                System.out.print("*");
                columna++;
            }
            System.out.println();
            fila++;
            columna = 0;
        }
    }
}
