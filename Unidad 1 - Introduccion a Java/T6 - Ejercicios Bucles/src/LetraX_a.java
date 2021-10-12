import java.util.Scanner;

public class LetraX_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, mitad, espacios;
        StringBuilder linea = new StringBuilder();

        System.out.println("Introduzca la altura:");
        altura = sc.nextInt();

        if (altura < 3 || altura % 2 == 0) {
            throw new IllegalArgumentException("La altura debe ser un número impar y mayor que 3");
        }

        espacios = altura - 2;
        mitad = altura / 2;

//        Primera mitad de la X
        for (int i = 0; i < mitad; i++) {
            linea.append(" ".repeat(i));
            linea.append("*");
            linea.append(" ".repeat(espacios));
            linea.append("*");
            System.out.println(linea);
            linea.setLength(0);
            espacios -= 2;
        }

//        Centro de la X
        linea.append(" ".repeat(mitad));
        linea.append("*");
        System.out.println(linea);
        linea.setLength(0);
        espacios = 1;

//        Segunda mitad de la X
        for (int i = 0; i < (altura / 2); i++) {
            linea.append(" ".repeat(mitad-1));
            mitad--;
            linea.append("*");
            linea.append(" ".repeat(espacios));
            linea.append("*");
            System.out.println(linea);
            linea.setLength(0);
            espacios += 2;
        }

//        System.out.println("*   *");
//        System.out.println(" * *");
//        System.out.println("  *");
//        System.out.println(" * *");
//        System.out.println("*   *");
    }
}
