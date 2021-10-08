package ejerciciosDoWhile;

import java.util.Scanner;

// Pirámide rectángulo invertida
public class Ejer626d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, anchura;
        int fila = 0;
        int columna = 0;

        System.out.println("Introduce la altura:");
        altura = sc.nextInt();
        anchura = altura;

        while (fila < altura) {
            while (columna < anchura) {
                if (columna < fila) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                columna++;
            }
            System.out.println();
            fila++;
            columna = 0;
        }
    }
}
