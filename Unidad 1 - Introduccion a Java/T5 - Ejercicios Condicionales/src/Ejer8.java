import java.util.Scanner;

public class Ejer8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double x1, x2;

        System.out.println("Introduzca el valor de a:");
        a = sc.nextInt();
        System.out.println("Introduzca el valor de b:");
        b = sc.nextInt();
        System.out.println("Introduzca el valor de c:");
        c = sc.nextInt();

        double discriminante = Math.pow(b, 2) - (4 * a * c);

        if (discriminante > 0) {
            double raiz = Math.sqrt(discriminante);

            x1 = (-b + raiz) / 2 * a;
            x2 = (-b - raiz) / 2 * a;

            System.out.println("Los valores de x son " + x1 + " y " + x2);
        } else {
            System.out.println("No se puede calcular la raíz");
        }
    }
}
