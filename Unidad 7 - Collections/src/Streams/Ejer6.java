package Streams;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejer6 {
    public static void main(String[] args) {
        Socio socio1 = new Socio("1111A", "Pepe", LocalDate.of(1974,3,20),
                LocalDate.of(2002, 7, 18),150, 2);
        Socio socio2 = new Socio("2222B", "Ana", LocalDate.of(1994,7,4),
                LocalDate.of(2013, 9, 27),75, 3);
        Socio socio3 = new Socio("3333C", "Juan", LocalDate.of(1987,4,11),
                LocalDate.of(2007, 8, 23),200, 1);
        Socio socio4 = new Socio("4444D", "Maria", LocalDate.of(1966, 11, 22),
                LocalDate.of(1991, 3, 17), 60, 4);
        Socio socio5 = new Socio("5555E", "Carlos", LocalDate.of(1981, 5, 13),
                LocalDate.of(2001, 2, 27), 180, 2);

        Socio[] socios = {socio1, socio2, socio3, socio4, socio5};

//        Mostrar ordenados por orden natural (dni)
        Arrays.stream(socios)
                .sorted()
                .forEach(System.out::println);
        System.out.println("-----");

//        Filtrar socios con cuota mayor que 100
        Arrays.stream(socios)
                .filter(socio -> socio.getCuota() > 100)
                .forEach(System.out::println);
        System.out.println("-----");

//        Filtrar los que empiezan con la letra A
        Arrays.stream(socios)
                .filter(socio -> socio.getNombre().startsWith("A"))
                .forEach(System.out::println);
        System.out.println("-----");

//        Ordenar por edad
        Arrays.stream(socios)
                .sorted((socio, t1) -> socio.edad() - t1.edad())
                .forEach(System.out::println);
        System.out.println("-----");

//        Ordenar por antigüedad
        Arrays.stream(socios)
                .sorted((socio, t1) -> socio.antiguedad() - t1.antiguedad())
                .forEach(System.out::println);
        System.out.println("-----");

//        Obtener tabla con los dni de los socios
        String[] tabla = Arrays.stream(socios)
                .map(Socio::getDni)
                .toArray(String[]::new);
        System.out.println(Arrays.toString(tabla));
        System.out.println("-----");

//        Ejercicio anterior pero en una lista
        List<String> lista = Arrays.stream(socios)
                .map(Socio::getDni)
                .collect(Collectors.toList());
        System.out.println(lista);
        System.out.println("-----");

//        Obtener nombres ordenados en una lista
        List<String> nombres = Arrays.stream(socios)
                .map(Socio::getNombre)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(nombres);
        System.out.println("-----");

        double avgFamiliares = Arrays.stream(socios)
                .mapToInt(Socio::getNumFamiliares)
                .average()
                .getAsDouble();
        System.out.println(avgFamiliares);
        System.out.println("-----");
    }
}
