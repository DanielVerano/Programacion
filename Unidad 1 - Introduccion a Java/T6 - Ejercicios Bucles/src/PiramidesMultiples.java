import java.util.Scanner;

public class PiramidesMultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, numEsp, numPiramides;

        while (true) {
            System.out.println("Introduce la altura:");
            altura = sc.nextInt();

            if (altura > 2) {
                break;
            }
        }

        System.out.println("Introduce el número de pirámides a imprimir:");
        numPiramides = sc.nextInt();

        numEsp = altura - 1;

        for (int i = 0; i < altura; i++) {

            for (int k = 0; k < numPiramides; k++) {

                if (k == 0) {

//                    Imprimir 1ra pirámide
                    for (int j = 0; j < numEsp; j++) {
                        System.out.print(" ");
                    }

                    for (int j = 0; j < altura * 2 - 1 - 2 * numEsp; j++) {
                        System.out.print("*");
                    }
                } else {

//                    Imprimir después de la 1ra pirámide
                    for (int j = 0; j < 2 * numEsp; j++) {
                        System.out.print(" ");
                    }

                    for (int j = 0; j < altura * 2 - 1 - 2 * numEsp; j++) {
                        System.out.print("*");
                    }
                }

//                Imprimir un espacio después de cada pirámide menos la última
                if (k < numPiramides - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            numEsp--;
        }
    }
}
