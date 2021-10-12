import java.util.Scanner;

public class PiramidesYCuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, anchura, numEsp;

        do {
            System.out.println("Introduce la altura:");
            altura = sc.nextInt();
            if (altura < 3 || altura % 2 == 0) {
                System.out.println("La altura debe ser impar y mayor o igual que 3");
            }
        }
        while (altura < 3 || altura % 2 == 0);

        anchura = altura / 2 + 1;
        numEsp = (altura - 1) / 2;

//        Pirámide superior
        for (int i = 0; i < altura / 2 + 1; i++) {
            for (int j = 0; j < anchura + numEsp + 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * anchura - 1 - 2 * numEsp; j++) {
                System.out.print("*");
            }
            System.out.println();
            numEsp--;
        }
        numEsp = (altura - 1) / 2;

//        Doble pirámide + cuadrado
        for (int i = 0; i < altura; i++) {
//            Primera pirámide
            for (int j = 0; j < numEsp; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < anchura - numEsp; j++) {
                System.out.print("*");
            }
//            Cuadrado
            System.out.print(" ");
            for (int j = 0; j < altura; j++) {
                if (j == 0 || j == altura - 1 || (i == 0 || i == altura - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

//            Segunda pirámide
            for (int j = 0; j < anchura - numEsp; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < numEsp; j++) {
                System.out.print(" ");
            }
            System.out.println();

            if (i < altura / 2) {
                numEsp--;
            } else {
                numEsp++;
            }
        }
        numEsp = 0;

//        Pirámide inferior
        for (int i = 0; i < altura / 2 + 1; i++) {
            for (int j = 0; j < anchura + 1 + numEsp; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * anchura - 1 - 2 * numEsp; j++) {
                System.out.print("*");
            }
            System.out.println();
            numEsp++;
        }
    }
}
