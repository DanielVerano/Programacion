import java.util.Scanner;

public class Ejer_5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int millas;
        float kilometros;

        System.out.println("Introduzca una longitud en millas:");
        millas = sc.nextInt();
        System.out.print("La equivalencia en kilómetros es: ");
        kilometros = millas * 1609;
        System.out.println(kilometros);
    }
}
