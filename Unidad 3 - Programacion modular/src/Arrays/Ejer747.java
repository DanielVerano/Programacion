package Arrays;

import java.util.Scanner;

public class Ejer747 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[1000];
        int numero;
        int contador = 0;

        do {
            System.out.println("Introduce un número:");
            System.out.println("1 - Añadir un dato");
            System.out.println("2 - Buscar un dato");
            System.out.println("3 - Salir del programa (-1)");
            numero = sc.nextInt();

            if (numero == 1) {
                System.out.println("Introduce un número para añadirlo:");
                int n = sc.nextInt();
                a[contador] = n;
                contador++;
            } else if (numero == 2) {
                System.out.println("Introduce un número para buscarlo:");
                int n = sc.nextInt();

                for (int i = 0; i <= contador; i++) {
                    if (a[i] == n) {
                        System.out.println("El número " + n + " está en la posición " + i);
                        break;
                    } else if (i == contador && a[i] != n) {
                        System.out.println("El número " + n + " no existe");
                    }
                }
            }
            System.out.println();
        }
        while (numero != -1);
    }
}
