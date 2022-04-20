package Baloncesto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Club club = new Club();

        Scanner sc = new Scanner(System.in);
        String opcion;

        do {
            System.out.println(club);
            mostrarMenu();
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    Jugador j1 = club.pedirJugador();
                    club.addJugador(j1);
                    break;
                case "2":
                    Jugador j2 = club.pedirJugador();
                    club.removeJugador(j2);
                    break;
                case "3":
                    System.out.println("Introduce una altura:");
                    Altura a = Altura.valueOf(sc.nextLine());
                    club.mostrarJugadores(a);
                    break;
                case "4":
                    club.mostrarTodosXAltura();
                    break;
                case "5":
                    club.cargarJugadores();
                    break;
                case "6":
                    club.guardarJugadores();
                    break;
                case "7":
                    club.mostrarJugadoresEntreEdades(20, 30);
                    break;
                case "fin":
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }

        } while (!opcion.equalsIgnoreCase("fin"));
    }

    public static void mostrarMenu() {
        System.out.println("Opciones:");
        System.out.println("1 - Añadir jugador");
        System.out.println("2 - Borrar jugador");
        System.out.println("3 - Mostrar jugadores de una altura");
        System.out.println("4 - Mostrar todos por altura");
        System.out.println("5 - Cargar jugadores");
        System.out.println("6 - Guardar jugadores");
        System.out.println("7 - Mostrar jugadores entre 2 edades");
        System.out.println("\"Fin\" - Salir y guardar jugadores");
    }
}
