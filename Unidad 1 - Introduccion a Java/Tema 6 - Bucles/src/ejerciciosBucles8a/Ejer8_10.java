package ejerciciosBucles8a;

import java.util.Scanner;

public class Ejer8_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.println("Introduce un número del 1 al 10:");
            numero = sc.nextInt();

            if (numero >= 1 && numero <= 10) {
                break;
            }
        }

        System.out.println("Tabla de multiplicar del " + numero);
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + "*" + i + "=" + (numero * i));
        }
    }
}
