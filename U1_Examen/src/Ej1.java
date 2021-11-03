import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, altArbol, anchura, numEsp;

        do {
            System.out.println("Por favor, introduzca la altura del árbol:");
            altura = sc.nextInt();
        }
        while (altura < 4);

        altArbol = altura - 2;
        numEsp = altArbol - 1;
        anchura = altArbol * 2 - 1;

//        Imprimir estrella
        for (int i = 0; i < numEsp; i++) {
            System.out.print(" ");
        }
        System.out.println("*");

//        Imprimir árbol
        for (int i = 0; i < altArbol; i++) {
            for (int j = 0; j < numEsp; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < anchura - numEsp * 2; j++) {
                if (i == altArbol - 1) {
                    System.out.print("^");
                } else {
                    if (j == 0 || j == anchura - numEsp * 2 - 1) {
                        System.out.print("^");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
            numEsp--;
        }

//        Imprimir tronco
        numEsp = altArbol - 1;
        for (int i = 0; i < numEsp; i++) {
            System.out.print(" ");
        }
        System.out.println("Y");
    }
}
