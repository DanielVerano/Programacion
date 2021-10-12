package examenAzul;

import java.util.Scanner;

public class QuitarDigito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, posDigito1, posDigito2;
        int newNumInv = 0;
        int newNum = 0;
        int numDigitos;

        System.out.println("Introduce un número:");
        num = sc.nextInt();
        System.out.println("Introduce las posiciones de los dígitos a eliminar (contando desde la izquierda):");
        posDigito1 = sc.nextInt();
        posDigito2 = sc.nextInt();

        numDigitos = (int) Math.log10(num) + 1;

//        while (num != 0) {
//            num /= 10;
//            numDigitos++;
//        }

//        Construir número invertido con el dígito eliminado
//        i cuenta los dígitos desde la derecha
        for (int i = 0; num != 0; i++) {
            int digit = num % 10;
            num = num / 10;

            if (i >= numDigitos-posDigito2 && i <= numDigitos-posDigito1) {
                continue;
            } else {
                newNumInv = (newNumInv * 10) + digit;
            }
        }

//        Construir número final
        for (int i = 0; newNumInv != 0; i++) {
            newNum = (newNum * 10) + (newNumInv % 10);
            newNumInv = newNumInv / 10;
        }
        System.out.println(newNum);
    }
}
