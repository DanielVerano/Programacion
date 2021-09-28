import java.util.Scanner;

public class Ejer_5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1, num2;

        System.out.println("Introduzca el primer número:");
        num1 = sc.nextFloat();
        System.out.println("Introduzca el segundo número:");
        num2 = sc.nextFloat();
        System.out.print("La división de los números es: ");
        System.out.println(num1/num2);
    }
}
