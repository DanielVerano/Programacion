import java.util.Scanner;

public class Ejer16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Introduzca un número:");
        numero = sc.nextInt();

//  Mas sencillo de calcular la ultima cifra calculando el resto de dividir el numero entre 10
        int ultimaCifra = numero % 10;
        System.out.println("La última cifra del número es " + ultimaCifra);

//        String numeroComoString = String.valueOf(numero);
//        String ultimaCifra = numeroComoString.substring(numeroComoString.length() - 1);
//        System.out.println("La última cifra del número es " + ultimaCifra);
    }
}
