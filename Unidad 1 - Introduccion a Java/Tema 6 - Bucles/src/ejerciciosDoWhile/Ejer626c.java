package ejerciciosDoWhile;

import java.util.Scanner;

// Pirámide rectángulo (L\)
public class Ejer626c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, anchura;
        int fila = 0;
        int columna = 0;

        System.out.println("Introduce la altura:");
        altura = sc.nextInt();
        anchura = altura;

        while (fila < altura) {
            do {
                System.out.print("*");
                columna++;
            }
            while (columna <= fila);    // (columna < anchura) para invertir
            System.out.println();
            columna = 0;
            fila++;
            anchura--;
        }

        /*while (fila < altura) {
            while (columna <= fila) {
                System.out.print("*");
                columna++;
            }
            System.out.println("");
            columna = 0;
            fila++;
        }*/
    }
}
