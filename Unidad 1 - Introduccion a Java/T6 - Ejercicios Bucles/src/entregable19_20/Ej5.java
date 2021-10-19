package entregable19_20;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        int altura, anchura, numEsp;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena:");
        String cadena = sc.nextLine();

        if (cadena.length() > 10) {
            cadena = cadena.substring(0, 10);
        }

//        Altura del rombo: Longitud de la cadena * 2 - 1 (SAMPLE -> 6 * 2 - 1 = 11)
        altura = 2 * cadena.length() - 1;
        anchura = altura;
        numEsp = cadena.length() - 1;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < numEsp; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < anchura - 2 * numEsp; j++) {
//                Imprimir primera mitad de la cadena (1.SAMPLE; 2.LPMAS)
                if (j <= (anchura - 2 * numEsp) / 2) {
                    System.out.print(cadena.charAt(j));
                } else {
//                    Calcular posición a imprimir después de la mitad de la cadena
//                    anchura (11) - j (6) - 1 = 4
                    System.out.print(cadena.charAt(anchura - 2 * numEsp - j - 1));
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
