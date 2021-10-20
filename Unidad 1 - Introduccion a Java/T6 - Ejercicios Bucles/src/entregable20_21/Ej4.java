package entregable20_21;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas, minutos, segundos, segundosAumentar;

        System.out.print("Introduzca horas: ");
        horas = sc.nextInt();
        System.out.print("Introduzca minutos: ");
        minutos = sc.nextInt();
        System.out.print("Introduzca segundos: ");
        segundos = sc.nextInt();
        System.out.print("Introduzca segundos a incrementar: ");
        segundosAumentar = sc.nextInt();

        for (int i = 0; i < segundosAumentar; i++) {
            if (segundos + 1 == 60) {
                if (minutos + 1 == 60) {
                    if (horas + 1 == 24) {
                        horas = 0;
                        minutos = 0;
                        segundos = 0;
                    } else {
                        minutos = 0;
                        segundos = 0;
                        horas++;
                    }
                } else {
                    segundos = 0;
                    minutos++;
                }
            } else {
                segundos++;
            }

            if (horas < 10) {
                System.out.print("0" + horas + ":");
            } else {
                System.out.print(horas + ":");
            }
            if (minutos < 10) {
                System.out.print("0" + minutos + ":");
            } else {
                System.out.print(minutos + ":");
            }
            if (segundos < 10) {
                System.out.print("0" + segundos);
            } else {
                System.out.print(segundos);
            }
            System.out.println();
        }
    }
}
