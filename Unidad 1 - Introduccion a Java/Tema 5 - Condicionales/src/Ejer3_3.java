import java.util.Scanner;

public class Ejer3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float numero1, numero2;
        System.out.println("Introduzca un número:");
        numero1 = sc.nextFloat();
        System.out.println("Introduzca otro número:");
        numero2 = sc.nextFloat();
        if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor que " + numero2);
        } else {
            System.out.println(numero1 + " es menor que " + numero2);
        }
    }
}
