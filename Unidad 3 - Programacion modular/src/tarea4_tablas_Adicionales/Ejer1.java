package tarea4_tablas_Adicionales;

import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[100];
        int max = 0;
        int min = 0;
        int respuesta;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 501);
            System.out.print(array[i] + " ");
            if (i == 0) {
                max = array[i];
                min = array[i];
            } else if (max < array[i]) {
                max = array[i];
            } else if (min > array[i]) {
                min = array[i];
            }
        }

        System.out.println();
        System.out.print("¿Qué quiere destacar? (1 - Mínimo, 2 - Máximo): ");
        respuesta = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == min && respuesta == 1) {
                System.out.print("**" + min + "** ");
            } else if (array[i] == max && respuesta == 2) {
                System.out.print("**" + max + "** ");
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }
}
