package ejerciciosDoWhile;

import java.util.Scanner;

public class Ejer622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 20;

        do {
            System.out.println(num);
            num -= 2;
        }
        while (num >= 2);
    }
}
