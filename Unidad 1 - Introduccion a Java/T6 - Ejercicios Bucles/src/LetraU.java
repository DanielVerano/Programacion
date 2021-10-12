import java.util.Scanner;

public class LetraU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;

        System.out.println("Introduzca la altura: ");
        altura = sc.nextInt();

        for (int i = 0; i < altura - 1; i++) {
            System.out.println("**    **");
        }
        System.out.println("  ****");
    }
}
