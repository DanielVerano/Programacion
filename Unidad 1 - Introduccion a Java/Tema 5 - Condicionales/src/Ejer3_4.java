import java.util.Scanner;

public class Ejer3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Introduzca un número:");
        numero = sc.nextInt();
        if (numero % 3 == 0) {
            System.out.println(numero + " es múltiplo de 3.");
        } else {
            System.out.println(numero + " no es múltiplo de 3.");
        }
    }
}
