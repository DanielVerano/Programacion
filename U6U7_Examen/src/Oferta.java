import java.io.Serializable;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Oferta implements Serializable, Comparable<Oferta> {
    private Integer codigo;
    private String descripcion;
    private Set<Trabajador> trabajadores;
    private boolean cubierta;

    public Oferta(Integer codigo, String descripcion, boolean cubierta) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        trabajadores = new TreeSet<>();
        this.cubierta = cubierta;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(Set<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public boolean isCubierta() {
        return cubierta;
    }

    public void setCubierta(boolean cubierta) {
        this.cubierta = cubierta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oferta oferta = (Oferta) o;
        return Objects.equals(codigo, oferta.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Oferta{" +
                "codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", trabajadores=" + trabajadores +
                ", cubierta=" + cubierta +
                '}' + '\n';
    }

    @Override
    public int compareTo(Oferta oferta) {
        return this.getCodigo() - oferta.getCodigo();
    }
}
