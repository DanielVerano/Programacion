package buclesAdicionales_8b;

import java.util.Scanner;

public class Ejer8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas1, dia1, horas2, dia2, horasTotalesDia1, horasTotalesDia2;
        final int HORAS_DIA = 24;

        do {
            System.out.println("Introduce el primer día de la semana:");
            dia1 = sc.nextInt();
            System.out.println("Introduce la primera hora:");
            horas1 = sc.nextInt();

            if ((dia1 < 1 || dia1 > 7) || (horas1 < 0 || horas1 > 23)) {
                System.out.println("Datos incorrectos");
            } else {
                break;
            }
        }
        while (true);

        do {
            System.out.println("Introduce el segundo dia de la semana:");
            dia2 = sc.nextInt();
            System.out.println("Introduce la segunda hora:");
            horas2 = sc.nextInt();

            horasTotalesDia1 = dia1 * HORAS_DIA + horas1;
            horasTotalesDia2 = dia2 * HORAS_DIA + horas2;

            if ((dia2 < 1 || dia2 > 7) || (horas2 < 0 || horas2 > 23)) {
                System.out.println("Datos incorrectos");
            } else if (horasTotalesDia2 < horasTotalesDia1) {
                System.out.println("El segundo día no es posterior al primero");
            } else {
                break;
            }
        }
        while (true);

        System.out.println("Las horas transcurridas entre el primer día y el segundo son " +
                (horasTotalesDia2 - horasTotalesDia1));

    }
}
