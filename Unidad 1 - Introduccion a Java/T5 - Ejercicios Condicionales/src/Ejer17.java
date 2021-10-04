import java.util.Scanner;

public class Ejer17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Introduzca un número de hasta 5 cifras:");
        numero = sc.nextInt();
        if (numero > 99999) {
            System.out.println("El número introducido tiene más de 5 cifras");
        } else {
            String primeraCifra = String.valueOf(numero).substring(0, 1);
            System.out.println("La primera cifra del número es " + primeraCifra);

            /*También se puede calcular dividiendo el número por 9 hasta que tenga 1 cifra
            while (numero > 9) {
                numero /= 10;
            }
            System.out.println("La primera cifra del número es " + numero);*/
        }
    }
}
