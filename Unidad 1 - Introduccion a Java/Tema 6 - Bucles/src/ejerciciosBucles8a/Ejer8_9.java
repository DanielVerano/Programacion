package ejerciciosBucles8a;

import java.util.Scanner;

public class Ejer8_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCodigos = 0, altura, masAlto = 0, codigoMasAlto = 0;

//        Hacerlo con un do while para preguntar al menos una vez

        do {
            System.out.println("Introduce la altura del árbol " + numCodigos + " cms:");
            altura = sc.nextInt();

            if (masAlto == 0) {
                masAlto = altura;
                codigoMasAlto = numCodigos;
            }
            /*if (altura == -1) {
                break;
            }*/
            if (altura > masAlto) {
                masAlto = altura;
                codigoMasAlto = numCodigos;
            }
            numCodigos++;
        }
        while (altura != -1);

        System.out.println("El árbol " + codigoMasAlto + " es el más alto con " + masAlto + " cms");
    }
}
