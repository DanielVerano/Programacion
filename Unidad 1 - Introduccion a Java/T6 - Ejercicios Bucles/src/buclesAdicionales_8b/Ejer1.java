package buclesAdicionales_8b;

import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numSecreto, respuesta;
        int numIntentos = 4;

        System.out.println("Introduce la combinación de la caja fuerte:");
        numSecreto = sc.nextInt();

        while (numIntentos > 0) {
            System.out.println("Introduce la combinación para abrir la caja fuerte:");
            respuesta = sc.nextInt();

            if (respuesta == numSecreto) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                break;
            } else {
                System.out.println("Lo siento, " + respuesta + " no es la combinación.");
                numIntentos--;
                System.out.println("Quedan " + numIntentos + " intentos.");
            }
        }
    }
}
