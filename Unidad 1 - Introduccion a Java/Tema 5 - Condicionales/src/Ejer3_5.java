import java.util.Scanner;

public class Ejer3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Introduzca un número:");
        numero = sc.nextInt();
        if (numero % 2 != 0) {
            System.out.println("El número es impar.");
        } else {
            System.out.println("El número es par.");
        }
    }
}
