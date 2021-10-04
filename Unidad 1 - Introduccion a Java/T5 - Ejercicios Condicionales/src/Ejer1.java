import java.util.Scanner;

public class Ejer1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dia;

        System.out.println("Introduzca un día de la semana (Lunes a Viernes):");
        dia = sc.nextLine();

        switch (dia) {
            case "Lunes":
                System.out.println("Lenguaje de Marcas");
                break;
            case "Martes":
            case "Miércoles":
            case "Jueves":
            case "Viernes":
                System.out.println("Sistemas Informáticos");
                break;
            default:
                System.out.println("Día festivo");
                break;
        }
    }
}
