import java.util.Scanner;

public class Ejer_5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short fechaNacimiento, fechaActual;

        System.out.println("Introduzca su fecha de nacimiento:");
        fechaNacimiento = sc.nextShort();
        System.out.println("Introduzca la fecha actual:");
        fechaActual = sc.nextShort();
        System.out.print("Su edad es: ");
        System.out.println(fechaActual - fechaNacimiento);
    }
}
