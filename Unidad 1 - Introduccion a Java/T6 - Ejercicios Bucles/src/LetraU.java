import java.util.Scanner;

public class LetraU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, anchura;

        System.out.println("Introduzca la altura: ");
        altura = sc.nextInt();
        System.out.println("Introduce la anchura:");
        anchura = sc.nextInt();

        for (int i = 0; i < altura - 1; i++) {
            for (int j = 0; j < anchura; j++) {
                if (j == 0 || j == anchura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < anchura - 1; i++) {
            if (i == 0) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
    }
}
