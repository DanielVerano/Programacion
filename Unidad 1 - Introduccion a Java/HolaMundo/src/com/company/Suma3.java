package com.company;

import java.util.Scanner;

public class Suma3 {
    public static void main(String[] args) {
        // Es recomendable declarar las variables al principio
        Scanner sc = new Scanner(System.in);
        int primerNum, segundoNum;

        System.out.print("Introduzca el primer número: ");
        primerNum = sc.nextInt();
        System.out.print("Introduzca el segundo número: ");
        segundoNum = sc.nextInt();
        System.out.print("La suma es: ");
        System.out.println(primerNum+segundoNum);
    }
}
