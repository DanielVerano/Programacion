package Examen2021_Manana;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Atleta at1 = new Atleta("Pepe", "España", Categoria.SENIOR);
        Atleta at2 = new Atleta("Ana", "España", Categoria.JUNIOR);
        Atleta at3 = new Atleta("Juan", "Portugal", Categoria.VETERANO);
        Maraton maraton = new Maraton();
        Scanner sc = new Scanner(System.in);

        maraton.inscribirAtleta(at1);
        maraton.inscribirAtleta(at2);
        maraton.inscribirAtleta(at3);
        System.out.println(maraton);
//        maraton.borrarAtleta(sc);
        System.out.println(maraton);
        maraton.guardarTiempo(1, 240);
        maraton.guardarTiempo(3, 200);
        maraton.mostrarListaFinishers();
        maraton.mostrarListaCategoria(Categoria.SENIOR);
        maraton.participantesPorPais("España");
    }

    public static void mostrarMenu() {
        System.out.println("Introduzca la opción:");
        System.out.println("1 - Cargar atletas");
        System.out.println("2 - Guardar atletas");
        System.out.println("3 - Inscribir atletas");
        System.out.println("4 - Guardar tiempo");
        System.out.println("5 - Borrar atleta");
        System.out.println("6 - Mostrar finishers");
        System.out.println("7 - Mostrar participantes de una categoría");
        System.out.println("8 - Mostrar participantes de un país");
        System.out.println("9 - Salir");
    }
}
