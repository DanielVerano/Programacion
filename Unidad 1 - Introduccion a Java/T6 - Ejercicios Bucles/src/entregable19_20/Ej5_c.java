package entregable19_20;

import java.util.Scanner;

public class Ej5_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, numEsp, numX;
        String cadena;

        System.out.println("Introduce una cadena:");
        cadena = sc.nextLine();

        if (cadena.length() > 10) {
            cadena = cadena.substring(0, 10);
        }

        altura = cadena.length() * 2 - 1;
        numEsp = cadena.length() - 1;
        numX = 1;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < numEsp; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < numX; j++) {
                /*if (i <= altura / 2) {
                    System.out.print(cadena.charAt(Math.abs(i-j)));
                } else {
                    System.out.print(cadena.charAt(Math.abs(altura-1-i-j)));
                }*/
                if (j <= numX / 2) {
                    System.out.print(cadena.charAt(j));
                } else {
                    System.out.print(cadena.charAt(numX-1-j));
                }
            }

            System.out.println();
            if (i < altura / 2) {
                numEsp--;
                numX+=2;
            } else {
                numEsp++;
                numX-=2;
            }
        }
    }
}