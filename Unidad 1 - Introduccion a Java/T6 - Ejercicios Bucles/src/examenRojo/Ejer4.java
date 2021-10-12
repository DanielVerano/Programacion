package examenRojo;

import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cargo, diasViaje, estadoCivil;
        double sueldoBase, irpf;
        final double IRPF_SOLTERO = 0.25;
        final double IRPF_CASADO = 0.20;
        final int COBRO_DIA_VIAJE = 30;

        do {
            System.out.println("Introduce el cargo del empleado:");
            System.out.println("1 - Prog. junior");
            System.out.println("2 - Prog. senior");
            System.out.println("3 - Jefe de proyecto");
            cargo = sc.nextInt();

        } while (cargo < 1 || cargo > 3);

        switch (cargo) {
            case 1:
                sueldoBase = 950;
                break;
            case 2:
                sueldoBase = 1200;
                break;
            case 3:
                sueldoBase = 1600;
                break;
            default:
                sueldoBase = 0;
                break;
        }

        System.out.println("Introduce los días de viaje:");
        diasViaje = sc.nextInt();

        do {
            System.out.println("Introduce el estado civil:");
            System.out.println("1 - Soltero");
            System.out.println("2 - Casado");
            estadoCivil = sc.nextInt();
        }
        while (estadoCivil != 1 && estadoCivil != 2);

        switch (estadoCivil) {
            case 1:
                irpf = IRPF_SOLTERO;
                break;
            case 2:
                irpf = IRPF_CASADO;
                break;
            default:
                irpf = 0;
                break;
        }

        System.out.println("---------------------------");
        System.out.println("Sueldo base \t" + sueldoBase);
        System.out.println("Dietas (" + diasViaje + " viajes) \t" + ((double) diasViaje * COBRO_DIA_VIAJE));
        System.out.println("Sueldo bruto \t" + (sueldoBase + (diasViaje * COBRO_DIA_VIAJE)));
        System.out.println("Retención IRPF (" + (irpf*100) + "%) \t" + (irpf*(sueldoBase + (diasViaje * COBRO_DIA_VIAJE))));
        System.out.println("Sueldo neto \t" + (1-irpf)*(sueldoBase + (diasViaje * COBRO_DIA_VIAJE)));
        System.out.println("---------------------------");
    }
}
