import java.util.Scanner;

public class Rombo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, numX, numEsp;

        while (true) {
            System.out.println("Introduce la altura:");
            altura = sc.nextInt();

            if (altura < 3 || altura % 2 == 0) {
                System.out.println("La altura no es correcta");
            } else {
                break;
            }
        }

        numX = 1;
        numEsp = altura / 2;

        for (int i = 0; i < altura; i++) {
//            1. Imprimir espacios
            for (int j = 0; j < numEsp; j++) {
                System.out.print("-");
            }

//            2. Imprimir cadena de asteriscos
            for (int j = 0; j < numX; j++) {
//                3. Comprobar si la posición es la primera o la última
                if (j == 0 || j == numX - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            for (int j = 0; j < numEsp; j++) {
                System.out.print("-");
            }
            System.out.println();

            if (i < altura / 2) {
                numEsp--;
                numX+=2;
            } else {
                numX-=2;
                numEsp++;
            }
        }
    }
}
