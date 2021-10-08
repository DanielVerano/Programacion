package ejerciciosDoWhile;

import java.util.Scanner;

// Rectángulo hueco
public class Ejer626 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte altura, anchura;
        int fila = 0;
        int columna = 0;

        System.out.println("Introduzca la altura:");
        altura = sc.nextByte();
        System.out.println("Introduce la anchura:");
        anchura = sc.nextByte();

//        Do While
        do {
            if (fila == 0 || fila == (altura - 1)) {
                do {
                    System.out.print("*");
                    columna++;
                }
                while (columna < anchura);
            } else {
                do {
                    if (columna == 0 || columna == (anchura - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    columna++;
                }
                while (columna < anchura);
            }
            System.out.println();
            fila++;
            columna = 0;
        }
        while (fila < altura);

//        Doble While
        /*while (fila < altura) {
            if (fila == 0 || fila == (altura - 1)) {
                while (columna < anchura) {
                    System.out.print("*");
                    columna++;
                }
            } else {
                while (columna < anchura) {
                    if (columna == 0 || columna == (anchura - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    columna++;
                }
            }
            System.out.println("");
            fila++;
            columna = 0;
        }*/
    }
}
