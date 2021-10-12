import java.util.Scanner;

public class LetraX_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, numEspacios;

        while (true) {
            System.out.println("Introduce la altura (alto = ancho):");
            altura = sc.nextInt();

            if (altura > 2 && altura % 2 != 0) {
                break;
            } else {
                System.out.println("La altura debe ser impar y mayor o igual que 3");
            }
        }

        numEspacios = 0;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < numEspacios; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < altura - 2 * numEspacios; j++) {
//                Comprobar primer o último asterisco de la X
                if (j == 0 || j == altura - 2 * numEspacios - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();

            if (i < altura / 2) {
                numEspacios++;
            } else {
                numEspacios--;
            }
        }
    }
}
