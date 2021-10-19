package entregable19_20;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        String numBinarioManual = "";

        System.out.println("Introduce un número:");
        numero = sc.nextInt();
        System.out.println("Número original: " + numero);

        while (numero > 0) {
            if (numero % 2 == 0) {
                numBinarioManual += "0";
            } else {
                numBinarioManual += "1";
            }
            numero /= 2;
        }

        System.out.print("Número en binario: ");
        for (int i = numBinarioManual.length()-1; i >= 0; i--) {
            System.out.print(numBinarioManual.charAt(i));
        }

//        String numBinario = Integer.toBinaryString(numero);
//        System.out.println(numBinario);
    }
}
