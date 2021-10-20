package entregable20_21;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroLoteria, num1, num2, num3;
        int cont = 0;
        int numDigitos = 0;

        System.out.println("Introduzca sus tres números favoritos:");
        System.out.print("Número uno: ");
        num1 = sc.nextInt();
        System.out.print("Número dos: ");
        num2 = sc.nextInt();
        System.out.print("Número tres: ");
        num3 = sc.nextInt();
        System.out.print("Introduzca el número de la lotería: ");
        numeroLoteria = sc.nextInt();

        while (numeroLoteria != 0) {
            int digito = numeroLoteria % 10;
            if (digito == num1 || digito == num2 || digito == num3) {
                cont++;
            }
            numDigitos++;
            numeroLoteria /= 10;
        }

        if (cont < numDigitos - cont) {
            System.out.println("Ese número no le va a dar suerte.");
        } else {
            System.out.println("Ese número le va a dar suerte.");
        }
    }
}
