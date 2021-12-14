package Entregable1920;

import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        int[] mesas = new int[10];
        int comensales;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < mesas.length; i++) {
            mesas[i] = (int) (Math.random() * 5);
        }

        do {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();

            for (int personas : mesas) {
                System.out.print(personas + " ");
            }
            System.out.println();

            System.out.println("Introduce el número de personas:");
            comensales = sc.nextInt();

            if (comensales == -1) {
                System.out.println("Gracias. Hasta pronto.");
                break;
            }

            if (comensales > 4) {
                System.out.println("Lo siento, no admitimos grupos de " + comensales);
                continue;
            } else if (comensales <= 0) {
                System.out.println("El número no puede ser 0 o negativo");
                continue;
            }

            if (!hayHuecosVacios(mesas, comensales) && !hayHuecosLibres(mesas, comensales)) {
                System.out.println("Lo siento, en estos momentos no queda sitio.");
            }
        }
        while (true);
    }

    public static boolean hayHuecosVacios(int[] n, int personas) {
        for (int i = 0; i < n.length; i++) {
            if (n[i] == 0) {
                n[i] = personas;
                System.out.println("Por favor, siéntense en la mesa número " + (i + 1));
                return true;
            }
        }
        return false;
    }

    public static boolean hayHuecosLibres(int[] n, int personas) {
        for (int i = 0; i < n.length; i++) {
            if (n[i] + personas <= 4) {
                n[i] += personas;
                System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número " + (i + 1));
                return true;
            }
        }
        return false;
    }
}
