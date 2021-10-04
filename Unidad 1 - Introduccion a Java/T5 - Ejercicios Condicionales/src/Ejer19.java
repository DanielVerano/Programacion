import java.util.Scanner;

public class Ejer19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dia;
        final int FIN_SEMANA = 900;
        final int MINUTOS_DIA = 1440;
        int horas, minutos, minutosTotales, dias = 0, minutosHasta15;

        System.out.println("Día:");
        dia = sc.nextLine();
        System.out.println("Hora:");
        horas = sc.nextInt();
        System.out.println("Minutos:");
        minutos = sc.nextInt();

        minutosTotales = (horas * 60) + minutos;

        if (minutosTotales > FIN_SEMANA) {
            minutosHasta15 = MINUTOS_DIA - (minutosTotales - FIN_SEMANA);
        } else {
            dias++;
            minutosHasta15 = FIN_SEMANA - minutosTotales;
        }

        switch (dia) {
            case "lunes":
                dias += 3;
                System.out.println("Quedan " +  dias + " días y " + minutosHasta15 + " minutos para las 15:00");
                break;
            case "martes":
                dias += 2;
                System.out.println("Quedan " +  dias + " días y " + minutosHasta15 + " minutos para las 15:00");
                break;
            case "miercoles":
                dias += 1;
                System.out.println("Quedan " +  dias + " días y " + minutosHasta15 + " minutos para las 15:00");
                break;
            case "jueves":
                System.out.println("Quedan " +  dias + " días y " + minutosHasta15 + " minutos para las 15:00");
                break;
            case "viernes":
                if (minutosTotales >= FIN_SEMANA) {
                    System.out.println("Ya es fin de semana!");
                } else {
                    System.out.println("Quedan " + minutosHasta15 + " minutos para las 15:00");
                }
                break;
        }
    }
}
