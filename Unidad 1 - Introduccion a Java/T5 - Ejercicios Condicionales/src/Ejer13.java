import java.util.Scanner;

public class Ejer13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduzca un número:");
        num = sc.nextInt();

        if (num % 2 == 0 && num % 5 == 0) {
            System.out.println("Es par y divisible entre 5");
        } else if (num % 2 == 0) {
            System.out.println("Es par y no divisible entre 5");
        } else if (num % 5 == 0) {
            System.out.println("No es par y si es divisible entre 5");
        } else {
            System.out.println("No es par ni divisible entre 5");
        }
    }
}
