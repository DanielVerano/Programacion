import java.util.Scanner;

public class Ejer3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Introduzca el número 12:");
        numero = sc.nextInt();
        if (numero == 12) {
            System.out.println("El número introducido es 12.");
        } else {
            System.out.println("El número introducido no es 12.");
        }
    }
}
