import java.util.Arrays;
import java.util.Comparator;

public class MainPelicula {
    public static void main(String[] args) {
        Pelicula p1 = new Pelicula("El señor de los anillos", 2000, 240);
        Pelicula p2 = new Pelicula("Los vengadores", 2010, 150);
        Pelicula p3 = new Pelicula("Avatar", 2004, 120);
        Pelicula p4 = new Pelicula("Harry Potter", 1999, 100);
        Pelicula p5 = new Pelicula("El Hobbit", 2014, 160);

        Pelicula[] peliculas = {p1, p2, p3, p4, p5};

        Comparator<Pelicula> cmpXAnio = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                int result = p1.getYear() - p2.getYear();

                if (result == 0) {
                    result = p2.getDuracion() - p1.getDuracion();
                }
                return result;
            }
        };

        System.out.println("Ordenación natural (duración):");
        Arrays.sort(peliculas);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }

        System.out.println("Ordenación por anio:");
        Arrays.sort(peliculas, cmpXAnio);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }
}
