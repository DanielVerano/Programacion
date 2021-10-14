package buclesAdicionales_8b;

import java.util.Scanner;

public class Ejer3_Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, siguienteNum;
        int numAnterior1 = 0;
        int numAnterior2 = 1;
//        StringBuilder secuencia = new StringBuilder();

        System.out.println("Introduzca el número de términos de la secuencia de Fibonacci: ");
        num = sc.nextInt();

        if (num == 0) {
            System.out.println("0");
        } else if (num == 1) {
            System.out.println("0, 1");
        } else {
            System.out.print("0, 1");
//            secuencia.append("0, 1");

            for (int i = 2; i < num; i++) {
                siguienteNum = numAnterior1 + numAnterior2;
                numAnterior1 = numAnterior2;
                numAnterior2 = siguienteNum;
                System.out.print(", " + siguienteNum);
//                secuencia.append(", ").append(siguienteNum);    // append(", " + siguienteNum)
            }
//            System.out.println("Secuencia: " + secuencia);
        }
    }
}
