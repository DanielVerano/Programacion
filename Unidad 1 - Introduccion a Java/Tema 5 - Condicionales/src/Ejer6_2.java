import java.util.Scanner;

public class Ejer6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte num1, num2, menor;

        System.out.println("Introduzca un número:");
        num1 = sc.nextByte();
        System.out.println("Introduzca un segundo número:");
        num2 = sc.nextByte();

//        if (num1 > num2) {
//            menor = num2;
//        } else {
//            menor = num1;
//        }

        menor = num1 > num2 ? num2 : num1;
        System.out.println("El menor es " + menor);
    }
}
