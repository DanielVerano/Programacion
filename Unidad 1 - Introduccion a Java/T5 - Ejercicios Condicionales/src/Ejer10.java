import java.util.Scanner;

public class Ejer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SEGUNDOS_EN_UN_DIA = 86400;
        int horas, minutos, segundosTotales;

        System.out.println("Diga la hora:");
        horas = sc.nextInt();
        System.out.println("Diga los minutos:");
        minutos = sc.nextInt();

        if ((horas >= 0 && horas <= 23) && (minutos >= 0 && minutos <= 59)) {
            segundosTotales = (horas * 60 * 60) + (minutos * 60);
            System.out.println("Faltan " + (SEGUNDOS_EN_UN_DIA - segundosTotales) + " segundos para llegar a la medianoche");
        } else {
            System.out.println("Datos erróneos");
        }
    }
}
