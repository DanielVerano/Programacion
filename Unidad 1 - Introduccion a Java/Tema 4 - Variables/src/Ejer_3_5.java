import java.util.Scanner;

public class Ejer_3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grado;

        System.out.println("Introduzca una temperatura en grados centígrados:");
        grado = sc.nextInt();
        System.out.println("La equivalencia en grados Fahrenheit es:");
        System.out.println(9*grado/5+32);
    }
}
