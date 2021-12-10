import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, aux, inv;

        System.out.println("Introduce un número:");
        numero = sc.nextInt();

        aux = numero;
        inv = 0;

        while (aux != 0) {
            inv = inv * 10 + (aux % 10);
            aux /= 10;
        }

        System.out.println("El número " + numero + " traducido al sistema de asteriscos es:");

        while (inv != 0) {
            int digito = inv % 10;

            for (int i = 0; i < digito; i++) {
                System.out.print("*");
            }
            System.out.print("-");
            inv /= 10;
        }

    }
}
