import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, cifra, aux, aux2 = 0;
        int numVeces = 0, contadorPosicion = 0;
        String posiciones = "";

        System.out.println("Introduzca un número:");
        numero = sc.nextInt();
        System.out.println("Introduce una cifra:");
        cifra = sc.nextInt();
        aux = numero;

        while (aux != 0) {
            aux2 = aux2 * 10 + (aux % 10);
            aux /= 10;
        }

        while (aux2 != 0) {
            int digito = aux2 % 10;
            if (digito == cifra) {
                numVeces++;
                posiciones += contadorPosicion + " - ";
            }
            aux2 /= 10;
            contadorPosicion++;
        }
        System.out.println(numVeces + " ocurrencias");
        System.out.println("Posiciones: " + posiciones);
    }
}
