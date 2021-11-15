package tarea3_tablas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numerosPrimitiva = new int[6];
        int[] apuesta = new int[6];
        int aciertos = 0;

        for (int i = 0; i < numerosPrimitiva.length; i++) {
            numerosPrimitiva[i] = (int) (Math.random() * 5) + 1;
        }

        for (int i = 0; i < apuesta.length; i++) {
            System.out.println("Introduce el número " + (i+1) + " de la apuesta:");
            apuesta[i] = sc.nextInt();

            if (apuesta[i] == numerosPrimitiva[i]) {
                aciertos++;
            }
        }

        System.out.println("Combinación ganadora: " + Arrays.toString(numerosPrimitiva));
        System.out.println("Apuesta: " + Arrays.toString(apuesta));
        System.out.println("Número de aciertos: " + aciertos);
    }
}
