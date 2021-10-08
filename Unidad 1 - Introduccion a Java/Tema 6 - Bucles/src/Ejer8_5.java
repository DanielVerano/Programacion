import java.util.Scanner;

public class Ejer8_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min, max, num = 0;

        System.out.println("Introduzca el valor mínimo del intervalo:");
        min = sc.nextInt();
        System.out.println("Introduzca el valor máximo del intervalo:");
        max = sc.nextInt();

        while (num < min || num > max) {
            System.out.println("Introduzca un número dentro de los valores introducidos:");
            num = sc.nextInt();
        }
    }
}
