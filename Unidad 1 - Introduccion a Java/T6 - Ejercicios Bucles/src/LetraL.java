import java.util.Scanner;

public class LetraL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, anchura;

        System.out.println("Introduzca la altura: ");
        altura = sc.nextInt();
        anchura = (altura / 2) + 1;

        for (int i = 1; i < altura; i++) {
            System.out.println("*");
        }
        for (int i = 0; i < anchura; i++) {
            System.out.print("*");
        }
    }
}
