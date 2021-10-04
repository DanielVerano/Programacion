import java.util.Scanner;

public class Ejer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota1, nota2, nota3;
        float media;

        System.out.println("Introduzca la primera nota:");
        nota1 = sc.nextInt();
        System.out.println("Introduzca la segunda nota:");
        nota2 = sc.nextInt();
        System.out.println("Introduzca la tercera nota:");
        nota3 = sc.nextInt();

        media = (float) (nota1 + nota2 + nota3) / 3;

        if (media >= 9 && media <= 10) {
            System.out.println(media + " Sobresaliente");
        } else if (media >= 7) {
            System.out.println(media + " Notable");
        } else if (media >= 6) {
            System.out.println(media +" Bien");
        } else if (media >= 5) {
            System.out.println(media +" Suficiente");
        } else if (media >= 0) {
            System.out.println(media +" Insuficiente");
        }
    }
}
