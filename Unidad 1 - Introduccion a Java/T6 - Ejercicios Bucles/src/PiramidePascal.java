import java.util.Scanner;

public class PiramidePascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, altura, numEsp;
        int numMayor = 1;

        System.out.println("Introduce la altura:");
        altura = sc.nextInt();
        numEsp = altura - 1;

        for (int i = 0; i < altura; i++) {
            numero = 1;

            for (int j = 0; j < numEsp; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < altura - numEsp; j++) {
                System.out.print(numero);
                numero = numero * (i - j) / (j + 1);
                System.out.print(" ");
            }
            System.out.println();
            numEsp--;
        }
    }
}
