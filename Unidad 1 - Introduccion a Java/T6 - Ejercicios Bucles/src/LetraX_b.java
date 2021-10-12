import java.util.Scanner;

public class LetraX_b {
    public static void main(String[] args) {
//        Doble For: Primero para la altura (numero de sout (i)), segundo para recorrer la cadena a imprimir (j).
        Scanner sc = new Scanner(System.in);
        /*
        * altura: Número de sout a imprimir en total.
        * longitudCadena: Número de caracteres que tendrá cada cadena.
        * numeroCadena: Posición de la línea a imprimir. (i)
        * mitad: Centro de la X. (posAsterisco1 == posAsterisco2)
        * posAsterisco1: Posición del 1er asterisco (incrementa en 1 cada vez).
        * posAsterisco2: Posición del 2do asterisco (decrementa en 1 cada vez).
        * */
        int altura, longitudCadena, numeroCadena, mitad, posAsterisco1, posAsterisco2;
        String cadena = "";

        System.out.println("Introduzca la altura:");
        altura = sc.nextInt();
        mitad = (altura / 2) + 1;

        if (altura < 3 || altura % 2 == 0) {
            throw new IllegalArgumentException("La altura debe ser un número impar y mayor que 3");
        }

        longitudCadena = altura;
        posAsterisco1 = 0;
        posAsterisco2 = longitudCadena - 1;
        numeroCadena = 1;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < longitudCadena; j++) {
                if ((j == posAsterisco1 || j == posAsterisco2) || (posAsterisco1 == posAsterisco2) && j == longitudCadena - 1) {
                    cadena += "*";
                } else {
                    cadena += " ";
                }
            }
            System.out.println(cadena);
            cadena = "";
            posAsterisco1++;
            posAsterisco2--;
            numeroCadena++;
            if (numeroCadena <= mitad) {
                longitudCadena--;
            } else {
                longitudCadena++;
            }
        }
    }
}
