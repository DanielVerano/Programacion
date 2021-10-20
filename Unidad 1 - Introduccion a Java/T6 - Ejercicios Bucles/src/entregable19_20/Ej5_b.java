package entregable19_20;

import java.util.Scanner;

public class Ej5_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, anchura, numEsp;
        String cadena;

        System.out.println("Introduce una cadena:");
        cadena = sc.nextLine();

        if (cadena.length() > 10) {
            cadena = cadena.substring(0, 10);
        }

        altura = 2 * cadena.length() - 1;
        anchura = altura;
        numEsp = cadena.length() - 1;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < numEsp; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < anchura - 2 * numEsp; j++) {
//                1. Segunda mitad de las filas; 2. i+j mayor o igual que anchura
                if (i > altura / 2 && i + j >= anchura) {
                    System.out.print(cadena.charAt((i+j)-anchura+1));
//                    1. Segunda mitad de las filas; 2. j menor o igual que la mitad de la cadena
                } else if (i > altura / 2 && j <= (anchura - 2 * numEsp) / 2) {
//                    Fila 6 (1ra letra: L (pos 4) -> anchura(11)-i(6)-j(0)-1 = 4
                    System.out.print(cadena.charAt(anchura-i-j-1));
                } else if (i > j) {
                    System.out.print(cadena.charAt(i-j));
                } else {
                    System.out.print(cadena.charAt(j-i));
                }
            }
            System.out.println();
            if (i < altura / 2) {
                numEsp--;
            } else {
                numEsp++;
            }
        }
    }
}
