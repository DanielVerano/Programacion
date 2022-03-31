package Tarea5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    IntroducirAspirantes ia = new IntroducirAspirantes();
                    ia.insertaAspirante();
                    ia.guardarFicheros();
                    break;
                case 2:
                    CalificacionPruebas cp = new CalificacionPruebas();
                    cp.leerIDs();
                    cp.introducirCalificaciones();
                    cp.guardarCalificaciones();
                    break;
                case 3:
                    Aprobados aprobados = new Aprobados();
                    aprobados.leerCalificaciones();
                    aprobados.generarInforme();
                    break;
                default:
                    break;
            }
        } while (opcion != 4);
    }

    public static void mostrarMenu() {
        System.out.println("Introduzca la opción:");
        System.out.println("1 - Introducir datos de aspirantes");
        System.out.println("2 - Calificar prueba");
        System.out.println("3 - Aprobados");
        System.out.println("4 - Salir");
    }
}
