package ejerciciosDoWhile;

import java.util.Scanner;

public class Ejer623 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 5;
        int i = 1;

        do {
            System.out.println(num + "x" + i + "=" + (num*i));
            i++;
        }
        while (i <= 10);
    }
}
