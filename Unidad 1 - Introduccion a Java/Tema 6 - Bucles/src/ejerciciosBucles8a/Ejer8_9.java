package ejerciciosBucles8a;

import java.util.Scanner;

public class Ejer8_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCodigos = 0, altura, masAlto = 0, codigoMasAlto = 0;

//        Hacerlo con un do while para preguntar al menos una vez

        System.out.println("Introduce la altura del árbol en cms:");
        masAlto = sc.nextInt();
        numCodigos++;
        codigoMasAlto = numCodigos;

        while (true) {
            System.out.println("Introduce la altura del árbol en cms:");
            altura = sc.nextInt();

            if (altura == -1) {
                break;
            }
            numCodigos++;

            if (altura > masAlto) {
                masAlto = altura;
                codigoMasAlto = numCodigos;
            }
        }
        System.out.println("El árbol " + codigoMasAlto + " es el más alto con " + masAlto + " cms");
    }
}
