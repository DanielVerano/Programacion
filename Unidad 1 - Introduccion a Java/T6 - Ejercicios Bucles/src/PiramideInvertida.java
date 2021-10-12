import java.util.Scanner;

public class PiramideInvertida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, numEspacios;

        System.out.println("Introduce la altura:");
        altura = sc.nextInt();
        numEspacios = 0;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < numEspacios; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (altura * 2 - 1) - 2 * numEspacios; j++) {
                System.out.print("*");
            }
            System.out.println();
            numEspacios++;

        }
    }
}
//  Para imprimir pirámide normal
//  numEspacios = altura - 1;
//  numEspacios--;
