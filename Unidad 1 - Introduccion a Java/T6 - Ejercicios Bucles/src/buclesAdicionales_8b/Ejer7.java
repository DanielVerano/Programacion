package buclesAdicionales_8b;

import java.util.Scanner;

public class Ejer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int numInvertido = 0;

        System.out.println("Introduce un número:");
        num = sc.nextInt();
        System.out.println("Número original: " + num);

        while (num != 0) {
            int digito = num % 10;
            num = num / 10;
            numInvertido = (numInvertido * 10) + digito;
        }
        System.out.println("Número invertido: " + numInvertido);
    }
}
