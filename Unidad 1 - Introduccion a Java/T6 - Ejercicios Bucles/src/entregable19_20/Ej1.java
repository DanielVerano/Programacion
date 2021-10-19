package entregable19_20;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota1, nota2;
        double media;

        System.out.print("Nota del primer control: ");
        nota1 = sc.nextInt();
        System.out.print("Nota del segundo control: ");
        nota2 = sc.nextInt();

        media = (double) (nota1 + nota2) / 2;

        if (media >= 9) {
            System.out.println("Tu nota de Programación es " + media + " - Sobresaliente");
        } else if (media >= 7) {
            System.out.println("Tu nota de Programación es " + media + " - Notable");
        } else if (media >= 6) {
            System.out.println("Tu nota de Programación es " + media + " - Bien");
        } else if (media >= 5) {
            System.out.println("Tu nota de Programación es " + media + " - Suficiente");
        } else {
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            sc.nextLine();
            String recuperacion = sc.nextLine();

            if (recuperacion.equals("apto")) {
                System.out.println("Tu nota de Programación es 5 - Suficiente");
            } else {
                System.out.println("Tu nota de Programación es " + media + " - Suspenso");
            }
        }
    }
}
