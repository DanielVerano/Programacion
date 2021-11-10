package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v1 = new int[3];
        int[] v2 = new int[3];
        int prodEscalar = 0;
        int prodVectorial = 0;

        for (int i = 0; i < v1.length; i++) {
            System.out.println("Introduce los datos para el vector 1:");
            v1[i] = sc.nextInt();
        }

        for (int i = 0; i < v2.length; i++) {
            System.out.println("Introduce los datos para el vector 2:");
            v2[i] = sc.nextInt();
        }

//        Imprimir vector 1
        for (int i = 0; i < v1.length; i++) {
            if (i == 0) {
                System.out.print("("+v1[i]+",");
            } else if (i == v1.length - 1) {
                System.out.print(v1[i]+")");
                System.out.println();
            } else {
                System.out.print(v1[i]+",");
            }
        }

//        Imprimir vector 2
        for (int i = 0; i < v2.length; i++) {
            if (i == 0) {
                System.out.print("("+v2[i]+",");
            } else if (i == v2.length - 1) {
                System.out.print(v2[i]+")");
                System.out.println();
            } else {
                System.out.print(v2[i]+",");
            }
        }

        int i = 0;
        while (i < v1.length) {
            prodEscalar += v1[i] * v2[i];
            i++;
        }
        System.out.println("Producto escalar: " + prodEscalar);
    }
}
