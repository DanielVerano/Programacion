import java.util.Scanner;

public class Ejer4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2;

        System.out.println("Introduzca un número:");
        numero1 = sc.nextInt();
        System.out.println("Introduzca otro número:");
        numero2 = sc.nextInt();

        if (numero1 % 2 == 0 && numero2 % 2 == 0) {
            System.out.println("Los dos números son pares.");
        } else if (numero1 % 2 == 0) {      // Es redundante comprobar otra vez la misma condición si solo tiene dos posibles casos. (numero2 % 2 != 0)
            System.out.println("Solo " + numero1 + " es par.");
        } else if (numero2 % 2 == 0){
            System.out.println("Solo " + numero2 + " es par.");
        } else {
            System.out.println("Ningún número es par.");
        }
    }
}
