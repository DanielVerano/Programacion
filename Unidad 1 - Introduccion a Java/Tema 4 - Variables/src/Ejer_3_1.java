import java.util.Scanner;

public class Ejer_3_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primerNum, segundoNum;

        System.out.println("Introduzca el primer número: ");
        primerNum = sc.nextInt();
        System.out.println("Introduzca el segundo número: ");
        segundoNum = sc.nextInt();
        System.out.println("El producto es: " + (primerNum*segundoNum));
    }
}
