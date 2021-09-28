import java.util.Scanner;

public class Ejer4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2;

        System.out.println("Introduzca un número:");
        numero1 = sc.nextInt();
        System.out.println("Introduzca otro número:");
        numero2 = sc.nextInt();

        if (numero1 >= 0 || numero2 >= 0) {
            System.out.println("Al menos uno de los números es positivo.");
        } else {
            System.out.println("Ninguno de los números es positivo.");
        }
    }
}
