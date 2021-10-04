import java.util.Scanner;

public class Ejer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota1, nota2, nota3;

        System.out.println("Introduzca la primera nota:");
        nota1 = sc.nextInt();
        System.out.println("Introduzca la segunda nota:");
        nota2 = sc.nextInt();
        System.out.println("Introduzca la tercera nota:");
        nota3 = sc.nextInt();

        System.out.println("La media de las tres notas es " + ((double) (nota1+nota2+nota3)/3));
    }
}
