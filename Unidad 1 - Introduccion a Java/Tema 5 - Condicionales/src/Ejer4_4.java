import java.util.Scanner;

public class Ejer4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, numero3;

        System.out.println("Introduzca el primer número:");
        numero1 = sc.nextInt();
        System.out.println("Introduzca el segundo número:");
        numero2 = sc.nextInt();
        System.out.println("Introduzca el tercer número:");
        numero3 = sc.nextInt();

        if (numero1 >= numero2 && numero1 >= numero3) {
            System.out.println("El mayor número es " + numero1);
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            System.out.println("El mayor número es " + numero2);
        } else {
            System.out.println("El mayor número es " + numero3);
        }
    }
}