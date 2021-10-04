import java.util.Scanner;

public class Ejer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes;

        System.out.println("Introduzca su día de nacimiento:");
        dia = sc.nextInt();
        System.out.println("Introduzca su mes de nacimiento:");
        mes = sc.nextInt();

        if (mes == 3 && (dia >= 21 && dia <= 31) || mes == 4 && (dia >= 1 && dia <= 20)) {
            System.out.println("Su horóscopo es aries");
        } else if (mes == 4 && (dia >= 21 && dia <= 30) || mes == 5 && (dia >= 1 && dia <= 20)) {
            System.out.println("Taurus");
        } else if (mes == 5 && (dia >= 21 && dia <= 31) || mes == 6 && (dia >= 1 && dia <= 21)) {
            System.out.println("Géminis");
        } else if (mes == 6 && (dia >= 22 && dia <= 30) || mes == 7 && (dia >= 1 && dia <= 22)) {
            System.out.println("Cáncer");
        } else if (mes == 7 && (dia >= 23 && dia <= 31) || mes == 8 && (dia >= 1 && dia <= 22)) {
            System.out.println("Leo");
        } else if (mes == 8 && (dia >= 23 && dia <= 31) || mes == 9 && (dia >= 1 && dia <= 22)) {
            System.out.println("Virgo");
        } else if (mes == 9 && (dia >= 23 && dia <= 30) || mes == 10 && (dia >= 1 && dia <= 22)) {
            System.out.println("Libra");
        } else if (mes == 10 && (dia >= 23 && dia <= 31) || mes == 11 && (dia >= 1 && dia <= 22)) {
            System.out.println("Escorpio");
        } else if (mes == 11 && (dia >= 23 && dia <= 30) || mes == 12 && (dia >= 1 && dia <= 21)) {
            System.out.println("Sagitario");
        } else if (mes == 12 && (dia >= 22 && dia <= 31) || mes == 1 && (dia >= 1 && dia <= 20)) {
            System.out.println("Capricornio");
        } else if (mes == 1 && (dia >= 21 && dia <= 31) || mes == 2 && (dia >= 1 && dia <= 18)) {
            System.out.println("Acuario");
        } else if (mes == 2 && (dia >= 19 && dia <= 28) || mes == 3 && (dia >= 1 && dia <= 20)) {
            System.out.println("Piscis");
        }
    }
}
