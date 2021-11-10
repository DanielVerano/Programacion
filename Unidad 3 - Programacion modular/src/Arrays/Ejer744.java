package Arrays;

import java.util.Scanner;

public class Ejer744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] meses = {"Enero", "Febrero", "Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        int numMes;

        do {
            System.out.println("Introduce un número del 1 al 12:");
            numMes = sc.nextInt();

            if (numMes > 0 && numMes < 13) {
                System.out.println("El mes elegido es " + meses[numMes-1]);
            }
        }
        while (numMes > 0 && numMes < 13);

    }
}
