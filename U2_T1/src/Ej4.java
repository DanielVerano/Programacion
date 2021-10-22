import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, aux, mitad1, mitad2;
        boolean tienePares = false;
        boolean esPrimo = true;
        String numeroCadena;

        do {
            System.out.println("Introduce un número:");
            numero = sc.nextInt();
            aux = numero;

            while (aux != 0) {
                int digito = aux % 10;
                if (digito % 2 == 0) {
                    tienePares = true;
                    break;
                }
                aux /= 10;
            }
        }
        while (!tienePares);

        numeroCadena = String.valueOf(numero);
        mitad1 = Integer.parseInt(numeroCadena.substring(0, numeroCadena.length()/2));
        mitad2 = Integer.parseInt(numeroCadena.substring(numeroCadena.length()/2));

        for (int i = 2; i < mitad1; i++) {
            if (mitad1 % 2 == 0) {
                esPrimo = false;
                break;
            }
        }
        if (esPrimo) {
            System.out.println(mitad1 + " es primo");
        } else {
            System.out.println(mitad1 + " no es primo");
        }
        esPrimo = true;

        for (int i = 2; i < mitad2; i++) {
            if (mitad2 % 2 == 0) {
                esPrimo = false;
                break;
            }
        }

        if (esPrimo) {
            System.out.println(mitad2 + " es primo");
        } else {
            System.out.println(mitad2 + " no es primo");
        }
    }
}
