import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, anchura, numEsp;

        do {
            System.out.println("Introduce la altura:");
            altura = sc.nextInt();

            if (altura < 3 || altura % 2 == 0) {
                System.out.println("La altura es incorrecta");
            }
        }
        while (altura < 3 || altura % 2 == 0);

        anchura = altura;
        numEsp = anchura - 1;

        for (int i = 0; i < altura; i++) {
            if (i == 0 || i == altura - 1) {
                for (int j = 0; j < altura; j++) {
                    System.out.print("*");
                }

                for (int j = 0; j < 3; j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < altura; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < numEsp; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");

                for (int j = 0; j < (anchura - numEsp - 1) + 3 + numEsp; j++) {
                    if (j == (anchura - numEsp - 1) + 3 + numEsp - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
            numEsp--;
        }

    }
}
