package Arrays;

import java.util.Scanner;

public class Ejer745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] a = new double[10];
        double media = 0;
        double varianza = 0;
        double desvTipica = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.println("Introduce el número " + i + ":");
            a[i] = sc.nextDouble();
            media += a[i];

            if (i == a.length - 1) {
                media = media / a.length;
            }
        }
        System.out.println("Media aritmética: " + media);

        for (int i = 0; i < a.length; i++) {
            varianza += Math.pow((a[i] - media), 2);

            if (i == a.length - 1) {
                varianza = varianza / a.length;
            }
        }

        desvTipica = Math.sqrt(varianza);
        System.out.println("Varianza: " + varianza);
        System.out.println("Desviación típica: " + desvTipica);
    }
}
