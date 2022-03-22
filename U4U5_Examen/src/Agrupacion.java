import java.util.Objects;

public abstract class Agrupacion implements Comparable<Agrupacion> {
    private String nombre;
    private String autor;
    private String autor_musica;
    private String autor_letras;
    private String disfraz;
    private static int numAgrupaciones = 0;

    public Agrupacion(String nombre, String autor, String autor_musica, String autor_letras, String disfraz) {
        this.nombre = nombre;
        this.autor = autor;
        this.autor_musica = autor_musica;
        this.autor_letras = autor_letras;
        this.disfraz = disfraz;
        numAgrupaciones++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor_musica() {
        return autor_musica;
    }

    public void setAutor_musica(String autor_musica) {
        this.autor_musica = autor_musica;
    }

    public String getAutor_letras() {
        return autor_letras;
    }

    public void setAutor_letras(String autor_letras) {
        this.autor_letras = autor_letras;
    }

    public String getDisfraz() {
        return disfraz;
    }

    public void setDisfraz(String disfraz) {
        this.disfraz = disfraz;
    }

    public static int getNumAgrupaciones() {
        return numAgrupaciones;
    }

    public static void setNumAgrupaciones(int numAgrupaciones) {
        Agrupacion.numAgrupaciones = numAgrupaciones;
    }

    abstract void cantar_la_presentacion();

    abstract void hacer_tipo();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agrupacion that = (Agrupacion) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(autor, that.autor) && Objects.equals(autor_musica, that.autor_musica) && Objects.equals(autor_letras, that.autor_letras) && Objects.equals(disfraz, that.disfraz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, autor, autor_musica, autor_letras, disfraz);
    }

    @Override
    public String toString() {
        return  "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autor_musica='" + autor_musica + '\'' +
                ", autor_letras='" + autor_letras + '\'' +
                ", disfraz='" + disfraz + '\'' +
                '}';
    }

    @Override
    public int compareTo(Agrupacion agrupacion) {
        return this.getNombre().compareTo(agrupacion.getNombre());
    }
}
