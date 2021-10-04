import java.util.Arrays;
import java.util.Scanner;

public class Ejer12 {
    public static void main(String[] args) {
//        Este programa ordena tres números de menor a mayor
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Introduzca el primer número:");
        num1 = sc.nextInt();
        System.out.println("Introduzca el segundo número:");
        num2 = sc.nextInt();
        System.out.println("Introduzca el tercer número:");
        num3 = sc.nextInt();
  /*Algoritmo de la burbuja (Bubble Sort)

        int[] arr = new int[]{5, 4, 3, 2, 1};
        System.out.println("Antes: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
        System.out.println("Despues: " + Arrays.toString(arr));*/

        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                System.out.println(num3 + "" + num2 + "" + num1);
            } else {
                System.out.println(num2 + "" + num3 + "" + num1);
            }
        } else if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                System.out.println(num3 + "" + num1 + "" + num2);
            } else {
                System.out.println(num1 + "" + num3 + "" + num2);
            }
        } else if (num1 > num2) {
            System.out.println(num2 + "" + num1 + "" + num3);
        } else {
            System.out.println(num1 + "" + num2 + "" + num3);
        }
    }
}
