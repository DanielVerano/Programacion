package Entregable2021_Tarde;

import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("Introduce un número:");
            n = sc.nextInt();
            System.out.println("Número " + n + " en morse: " + convierteEnMorse(n));
        }
        while (n != -1);

    }

    public static String convierteEnMorse(int n) {
        String[] sistemaMorse = {"_____","·____","··___","···__","····_","·····","_····","__···","___··","____·"};
        StringBuilder sb = new StringBuilder();
        String numero = String.valueOf(n);

        for (int i = 0; i < numero.length(); i++) {
            sb.append(sistemaMorse[Integer.parseInt(""+numero.charAt(i))]);
        }
        return sb.toString();
    }
}
