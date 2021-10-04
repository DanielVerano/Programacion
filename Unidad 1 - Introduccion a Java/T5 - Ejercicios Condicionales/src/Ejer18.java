import java.util.Scanner;

public class Ejer18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota1, nota2;
        double media;

        System.out.print("Nota del primer control: ");
        nota1 = sc.nextInt();
        System.out.print("Nota del segundo control: ");
        nota2 = sc.nextInt();
        media = (double) (nota1 + nota2) / 2;

        if (media >= 5) {
            System.out.println("Tu nota de programación es " + media);
        } else {
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            sc.nextLine(); // Need to add a second nextLine() to consume the '\n' not consumed by nextInt() before
            String recuperacion = sc.nextLine();

            if (recuperacion.equals("apto")) {
                System.out.println("Tu nota de programación es 5");
            } else {
                System.out.println("Tu nota de programación es " + media);
            }
        }
    }
}
