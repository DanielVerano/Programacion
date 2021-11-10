package tarea3_tablas;

import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digitos, numSecreto, respuesta, aux;
        int[] a;

        do {
            System.out.println("Introduce el número de dígitos:");
            digitos = sc.nextInt();
        }
        while (digitos < 1 || digitos > 5);

        numSecreto = (int) (Math.random() * (int) Math.pow(10, digitos));
        a = new int[digitos];
        aux = numSecreto;

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 5) + 1;
        }

//        for (int i = 0; aux != 0; i++) {
//            int d = aux % 10;
//            a[a.length - 1 - i] = d;
//            aux /= 10;
//        }

        System.out.println("Intente acertar la clave");

        do {
            System.out.println("Introduce un número:");
            respuesta = sc.nextInt();

            if (String.valueOf(respuesta).length() != String.valueOf(numSecreto).length()) {
                System.out.println("El número introducido no tiene el mismo número de dígitos");
            } else {

                for (int i = 0; i < digitos; i++) {
                    int d = Character.getNumericValue(String.valueOf(respuesta).charAt(i));

                    if (d < a[i]) {
                        System.out.println(d + " es menor");
                    } else if (d > a[i]) {
                        System.out.println(d + " es mayor");
                    } else {
                        System.out.println(d + " es igual");
                    }
                }
            }
        }
        while (respuesta != numSecreto);
    }
}
