package ejerciciosBucles8a;

import java.util.Scanner;

public class Ejer8_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        boolean estaSuspenso = false;
        int i = 0;

        while (i < 5) {
            System.out.println("Introduce la nota del alumno:");
            nota = sc.nextInt();

            if (nota < 5) {
                estaSuspenso = true;
            }
            i++;
        }

        if (estaSuspenso) {
            System.out.println("Hay alumnos suspensos");
        } else {
            System.out.println("No hay alumnos suspensos");
        }
    }
}
