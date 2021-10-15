import java.util.Scanner;

public class LetraL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, base;

        System.out.println("Introduzca la altura: ");
        altura = sc.nextInt();
        base = (altura / 2) + 1;

        for (int i = 0; i < altura - 1; i++) {
            System.out.println("*");
        }
        for (int i = 0; i < base; i++) {
            System.out.print("* ");
        }
    }
}
