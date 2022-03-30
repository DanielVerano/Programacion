package Tarea4.Map_II;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionEmpleados gestion = new GestionEmpleados();
        Scanner sc = new Scanner(System.in);
        int opcion;
        gestion.cargarEmpleados();

        /*System.out.println("Indique la opción para cargar los datos:");
        System.out.println("1 - Cargar los datos desde un fichero binario");
        System.out.println("2 - Cargar los datos desde la consola");
        int opcion = pedirNumero(sc);

        switch (opcion) {
            case 1:
                gestion.cargarEmpleados();
                break;
            case 2:
                gestion.pedirEmpleados(sc);
                gestion.volcarDatos();
                break;
            default:
                break;
        }*/

        do {
            gestion.mostrarMenu();
            opcion = pedirNumero(sc);

            switch (opcion) {
                case 1:
                    gestion.mostrarEmpleados(gestion.getEmpleados());
                    break;
                case 2:
                    gestion.borrarEmpleado(sc);
                    break;
                case 3:
                    gestion.visualizarEmpleado(sc);
                    break;
                case 4:
                    gestion.modificarEmpleado(sc);
                    break;
                case 5:
                    gestion.pedirEmpleados(sc);
                    break;
                case -1:
                    gestion.volcarDatos();
                    break;
                default:
                    break;
            }
        } while (opcion != -1);
    }

    public static int pedirNumero(Scanner teclado) {
        boolean exception;
        int n = 0;

        do {
            exception = false;
            try {
                n = teclado.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Debe introducir un número");
                exception = true;
                teclado.nextLine();
            }
        } while (exception);

        teclado.nextLine();
        return n;
    }
}
