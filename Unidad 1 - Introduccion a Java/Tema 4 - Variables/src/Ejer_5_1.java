import java.util.Scanner;

public class Ejer_5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte num1, num2;

        System.out.println("Introduce el primer byte:");
        num1 = sc.nextByte();
        System.out.println("Introduce el segundo byte:");
        num2 = sc.nextByte();
        System.out.print("La suma es: ");
        System.out.println(num1+num2);
    }
}
