package ejerciciosBucles8a;

import java.util.Scanner;

public class Ejer8_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota, aprobados = 0, condicionados =0, suspensos = 0;
        int i = 0;

        while (i < 6) {
            System.out.println("Introduce la nota del alumno:");
            nota = sc.nextInt();

            if (nota >= 5) {
                aprobados++;
            } else if (nota == 4) {
                condicionados++;
            } else {
                suspensos++;
            }
            i++;
        }
        System.out.println("Alumnos aprobados: " + aprobados);
        System.out.println("Alumnos condicionados: " + condicionados);
        System.out.println("Alumnos suspensos: " + suspensos);
    }
}
