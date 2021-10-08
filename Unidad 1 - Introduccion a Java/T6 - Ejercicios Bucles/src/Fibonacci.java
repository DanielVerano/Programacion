import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, numAnterior1 = 0, numAnterior2 = 1, siguienteNum;
        StringBuilder secuencia = new StringBuilder("0");

        System.out.println("Introduzca el número de términos de la secuencia de Fibonacci: ");
        num = sc.nextInt();

        if (num == 0) {
            System.out.println(secuencia);
        } else if (num == 1) {
            System.out.println(secuencia.append(", 1"));
        } else {
            secuencia.append(", 1");

            for (int i = 2; i < num; i++) {
                siguienteNum = numAnterior1 + numAnterior2;
                numAnterior1 = numAnterior2;
                numAnterior2 = siguienteNum;
                secuencia.append(", " + siguienteNum);
            }
            System.out.println("Secuencia: " + secuencia);
        }
    }
}
