import java.util.Scanner;

public class Ejer_3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Introduzca el primer número: ");
        num1 = sc.nextInt();
        System.out.println("Introduzca el segundo número: ");
        num2 = sc.nextInt();
        System.out.println("La división es: " + (num1/num2));
    }
}
