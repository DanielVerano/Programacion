import java.util.Objects;

public class Pelicula implements Comparable<Pelicula> {
    private String nombre;
    private int year;
    private int duracion;

    public Pelicula(String nombre, int year, int duracion) {
        this.nombre = nombre;
        this.year = year;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "nombre='" + nombre + '\'' +
                ", year=" + year +
                ", duracion=" + duracion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pelicula pelicula = (Pelicula) o;
        return year == pelicula.year && duracion == pelicula.duracion && Objects.equals(nombre, pelicula.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, year, duracion);
    }

    @Override
    public int compareTo(Pelicula pelicula) {
        return this.getDuracion() - pelicula.getDuracion();
    }
}
