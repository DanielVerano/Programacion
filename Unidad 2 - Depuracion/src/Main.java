import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            if (num % 2 == 0) {
                System.out.println("Soy " + i);
            }
        }
    }
}
