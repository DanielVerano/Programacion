import java.util.Scanner;

public class Ejer_3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int milla;
        System.out.println("Introduzca una longitud en millas: ");
        milla = sc.nextInt();
        System.out.println("La equivalencia en metros es: " + (milla*1609));
    }
}
