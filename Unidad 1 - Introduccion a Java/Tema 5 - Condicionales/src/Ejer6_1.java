import java.util.Scanner;

public class Ejer6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduzca un número:");
        num = sc.nextInt();

//        if (num % 2 == 0) {
//            num = 1;
//            System.out.println(num);
//        } else {
//            num = 0;
//            System.out.println(num);
//        }

        num = num % 2 == 0 ? 1 : 0;
        System.out.println(num);
    }
}
