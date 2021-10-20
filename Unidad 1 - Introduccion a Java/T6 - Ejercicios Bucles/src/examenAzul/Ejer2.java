package examenAzul;

import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, aux, posInicio, posFinal;
        int longitud;
        int resultado = 0;

        System.out.print("Introduce un número: ");
        numero = sc.nextInt();
        aux = numero;
        System.out.print("Posición inicial: ");
        posInicio = sc.nextInt();
        System.out.print("Posición final: ");
        posFinal = sc.nextInt();

        longitud = (int) Math.log10(aux) + 1;

        /*
        * num = 1 2 3 4 5 6 7
        * pos = 0 1 2 3 4 5 6
        * i =   6 5 4 3 2 1 0
        * */

        for (int i = 0; aux != 0; i++) {
            int digito = aux % 10;
            if (longitud-1-i <= posFinal && longitud-1-i >= posInicio) {
                aux /= 10;
                continue;
            }
            resultado = resultado * 10 + digito;
            aux /= 10;
        }
        aux = resultado;
        resultado = 0;

        while (aux != 0) {
            int digito = aux % 10;
            resultado = resultado * 10 + digito;
            aux /= 10;
        }

        System.out.println("Número inicial: " + numero);
        System.out.println("Número resultante: " + resultado);
    }
}
