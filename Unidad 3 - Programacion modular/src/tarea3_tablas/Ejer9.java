package tarea3_tablas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numerosPrimitiva = new int[6];
        int[] apuesta = new int[6];
        int aciertos = 0;

        numerosPrimitiva = generarNumerosPrimitiva(numerosPrimitiva.length);

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

    public static int[] generarNumerosPrimitiva(int numero) {
        int[] aux = new int[0];
        boolean esta;

//        Generar números aleatorios que no se repitan
        for (int i = 0; i < numero; i++) {

            do {
                int aleatorio = (int) (Math.random() * 10) + 1;
                esta = existe(aux, aleatorio);

                if (!esta) {
                    aux = Arrays.copyOf(aux, aux.length + 1);
                    aux[i] = aleatorio;
                }
            }
            while (esta);
        }
        return aux;
    }

    public static boolean existe(int[] a, int num) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == num) {
                return true;
            }
        }
        return false;
    }
}
