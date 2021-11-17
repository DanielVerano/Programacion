package tarea4_tablas_Adicionales;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mesas = new int[10];
        StringBuilder numMesa = new StringBuilder();
        StringBuilder ocupaciones = new StringBuilder();
        int grupo;
        boolean sentado;

        for (int i = 0; i < mesas.length; i++) {
            mesas[i] = (int) (Math.random() * 5);
            numMesa.append(i + 1).append(" ");
            ocupaciones.append(mesas[i]).append(" ");
        }

        do {
            System.out.println("Mesa Nº: " + numMesa);
            System.out.println("Ocupaciones: " + ocupaciones);

            do {
                System.out.println("Introduce el número de personas:");
                grupo = sc.nextInt();

                if (grupo > 4) {
                    System.out.println("Lo siento, no admitimos grupos de " + grupo);
                }
            }
            while (grupo > 4);
            sentado = false;

            for (int i = 0; i < mesas.length; i++) {
                if (mesas[i] == 0) {
                    mesas[i] = grupo;
                    System.out.println("Por favor, siéntense en la mesa número " + (i + 1));
                    sentado = true;
                    break;
                }
            }

            if (!sentado) {
                for (int i = 0; i < mesas.length; i++) {
                    if (mesas[i] + grupo <= 4) {
                        mesas[i] += grupo;
                        System.out.println("Tendrán que compartir la mesa número " + (i + 1));
                        sentado = true;
                        break;
                    }
                }
            }

            if (!sentado) {
                System.out.println("Lo siento, no hay huecos libres");
            }

            ocupaciones.delete(0,ocupaciones.length());
            for (int i = 0; i < mesas.length; i++) {
                ocupaciones.append(mesas[i]).append(" ");
            }
        }
        while (grupo != -1);
    }
}
