import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int PRECIO_HORA_NORMAL = 12;
        final int PRECIO_HORA_EXTRA = 16;
        int horasTrabajadas, horasExtras, sueldo;

        System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
        horasTrabajadas = sc.nextByte();

        if (horasTrabajadas > 0 && horasTrabajadas <= 40) {
            sueldo = horasTrabajadas * 12;
            System.out.println("El sueldo semanal que le corresponde es de " + sueldo + " euros");
        } else if (horasTrabajadas > 40) {
            horasExtras = horasTrabajadas - 40;
            sueldo = (40 * PRECIO_HORA_NORMAL) + (horasExtras * PRECIO_HORA_EXTRA);
            System.out.println("El sueldo semanal que le corresponde es de " + sueldo + " euros");
        }
    }
}
