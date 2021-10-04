import java.util.Scanner;

public class Ejer21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double IRPF_SOLTERO = 0.25;
        final double IRPF_CASADO = 0.20;
        int cargo, diasViaje, estadoCivil;
        double sueldo = 0;

        System.out.println("1 - Programador junior");
        System.out.println("2 - Prog. senior");
        System.out.println("3- Jefe de proyecto");
        System.out.print("Introduzca el cargo del empleado (1-3): ");
        cargo = sc.nextInt();
        System.out.print("¿Cuántos días ha estado de viaje visitando clientes?: ");
        diasViaje = sc.nextInt();
        System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        estadoCivil = sc.nextInt();

        if (cargo == 1) {
            sueldo = 950;
        } else if (cargo == 2) {
            sueldo = 1200;
        } else if (cargo == 3) {
            sueldo = 1600;
        }
        System.out.println("Sueldo base: " + sueldo);

        if (diasViaje > 0) {
            sueldo = sueldo + (diasViaje * 30);
        }
        System.out.println("Dietas (" + diasViaje + " viajes): " + (diasViaje * 30));
        System.out.println("Sueldo bruto: " + sueldo);

        if (estadoCivil == 1) {
            System.out.println("Retención IRPF (" + (IRPF_SOLTERO * 100) + "): " + (IRPF_SOLTERO * sueldo));
            sueldo = sueldo * (1 - IRPF_SOLTERO);
        } else if (estadoCivil == 2) {
            System.out.println("Retención IRPF (" + (IRPF_CASADO * 100) + "): " + (IRPF_CASADO   * sueldo));
            sueldo = sueldo * (1- IRPF_CASADO);
        }
        System.out.println("Sueldo neto: " + sueldo);
    }
}
