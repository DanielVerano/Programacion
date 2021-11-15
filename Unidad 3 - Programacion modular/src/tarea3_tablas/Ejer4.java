package tarea3_tablas;

import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numDigitos;
        int[] digitosSecreto, digitosRespuesta;
        boolean igual;

        do {
            System.out.println("Introduce el número de dígitos:");
            numDigitos = sc.nextInt();
        }
        while (numDigitos < 1 || numDigitos > 10);

        digitosSecreto = new int[numDigitos];
        digitosRespuesta = new int[numDigitos];

        for (int i = 0; i < digitosSecreto.length; i++) {
            digitosSecreto[i] = (int) (Math.random() * 5) + 1;
        }

        System.out.println("Intente acertar la clave");

        do {
            igual = true;

            for (int i = 0; i < digitosRespuesta.length; i++) {
                System.out.println("Introduce un número:");
                digitosRespuesta[i] = sc.nextInt();
            }

            for (int i = 0; i < digitosSecreto.length; i++) {
                if (digitosRespuesta[i] < digitosSecreto[i]) {
                    System.out.println(digitosRespuesta[i] + " es menor");
                    igual = false;
                } else if (digitosRespuesta[i] > digitosSecreto[i]) {
                    System.out.println(digitosRespuesta[i] + " es mayor");
                    igual = false;
                } else {
                    System.out.println(digitosRespuesta[i] + " es igual");
                }
            }
        }
        while (!igual);
    }
}
