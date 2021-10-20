package entregable20_21;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, aux = 0, resultado = 0, digitosEliminados = 0;

        System.out.println("Introduce un número:");
        numero = sc.nextInt();

        while (numero != 0) {
            int digito = numero % 10;
            if (digito != 0 && digito != 8) {
                aux = aux * 10 + digito;
            } else {
                digitosEliminados++;
            }
            numero = numero / 10;
        }

//        Invertir número
        while (aux != 0) {
            resultado = (resultado * 10) + (aux % 10);
            aux = aux / 10;
        }

        System.out.println("Número resultado: " + resultado);
        System.out.println("Dígitos eliminados: " + digitosEliminados);
    }
}
