package entregable19_20;

import java.util.Scanner;

public class Ej5_d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, numEsp, numX, pos;
        String cadena;

        System.out.println("Introduce una cadena:");
        cadena = "SAMPLE";

        if (cadena.length() > 10) {
            cadena = cadena.substring(0, 10);
        }

        altura = cadena.length() * 2 - 1;
        numEsp = cadena.length() - 1;
        numX = 1;

        /*
        * 1ra mitad filas / 1ra mitad columnas: cadena.length() - 1 - i + j
        *
        * 1ra mitad filas / 2da mitad columnas: cadena.length() - 1 - i + (numX - 1 - j)
        *
        * 2da mitad filas / 1ra mitad columnas: i - (cadena.length() - 1) + j
        *
        * 2da mitad filas / 2da mitad columnas: i - (cadena.length() - 1) + (numX - 1 - j)
        *
        * NumX - 1 porque numX cuenta desde 1 y en el for contamos desde 0
        *
        * */

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < numEsp; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < numX; j++) {
                if (i <= altura / 2) {
                    if (j <= numX / 2) {
                        pos = cadena.length()-1-i+j;
                        System.out.print(cadena.charAt(pos));
                    } else {
                        pos = (cadena.length()-1-i) + (numX-1-j);
                        System.out.print(cadena.charAt(pos));
                    }

                } else {
                    if (j <= numX / 2) {
//                        Primera mitad: solo sumar j
                        pos = i-(cadena.length()-1) + j;
                        System.out.print(cadena.charAt(pos));
                    } else {
//                        Segunda mitad: sumar (numX-1-j)
                        pos = i-(cadena.length()-1) + (numX-1-j);
                        System.out.print(cadena.charAt(pos));
                    }
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
