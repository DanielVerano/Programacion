package Arrays;

import java.util.Scanner;

public class Ejer743 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] diasMeses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int mes;

        do {
            System.out.println("Introduce un mes del 1 al 12:");
            mes = sc.nextInt();

            if (mes >= 1 && mes <= 12) {
                System.out.println("El mes " + mes + " tiene " + diasMeses[mes-1] + " días");
            }
        }
        while (mes >= 1 && mes <= 12);
    }
}
