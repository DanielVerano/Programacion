import java.util.Scanner;

public class Ejer_3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, altura;
        System.out.println("Introduzca la base del triángulo:");
        base = sc.nextInt();
        System.out.println("Introduzca la altura del triángulo:");
        altura = sc.nextInt();
        System.out.println("La superficie del triángulo es:");
        System.out.println(base*altura/2);
    }
}
