package Arrays;

import java.util.Scanner;

public class Ejer749 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int determinante = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Introduce un número para la posición " + i + "," + j);
                matriz[i][j] = sc.nextInt();
            }
        }

        determinante = matriz[0][0] * matriz[1][1] * matriz[2][2] +
                matriz[1][0] * matriz[2][1] * matriz[0][2] +
                matriz[0][1] * matriz[1][2] * matriz[2][0] -
                matriz[0][2] * matriz[1][1] * matriz[2][0] -
                matriz[0][1] * matriz[1][0] * matriz[2][2] -
                matriz[1][2] * matriz[2][1] * matriz[0][0];

        System.out.println("Determinante: " + determinante);
    }
}
