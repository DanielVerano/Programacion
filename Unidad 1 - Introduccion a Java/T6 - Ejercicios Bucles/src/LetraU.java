import java.util.Scanner;

public class LetraU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;

        System.out.println("Introduzca la altura: ");
        altura = sc.nextInt();

        for (int i = 1; i < altura; i++) {
            System.out.println("* *");
        }
        System.out.println(" *");
    }
}
