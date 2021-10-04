import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        double x;

        System.out.println("Este programa resuelve una ecuación de primer grado (del tipo ax + b = 0");
        System.out.print("Por favor, introduzca el valor de a: ");
        a = sc.nextByte();
        System.out.print("Ahora, introduzca el valor de b: ");
        b = sc.nextByte();

        if (a == 0) {
            System.out.println("Esta ecuación no tiene solución real");
        } else {
            x = (double) -b/a;
            System.out.println("La solución es " + x);
        }
    }
}
