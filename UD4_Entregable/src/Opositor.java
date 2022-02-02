import java.util.Objects;

public class Opositor {
    private String nombre;
    private String apellidos;
    private Integer fechaNacimiento;
    private boolean tieneAdaptacion;
    private String descripcionAdaptacion;
    private static int numOpositores = 0;
    private static int numAdaptaciones = 0;

    public Opositor(String nombre, String apellidos, Integer fechaNacimiento, boolean tieneAdaptacion, String descripcionAdaptacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.tieneAdaptacion = tieneAdaptacion;
        numOpositores++;

        if (tieneAdaptacion) {
            this.descripcionAdaptacion = descripcionAdaptacion;
            numAdaptaciones++;
        } else {
            this.descripcionAdaptacion = null;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Integer fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isTieneAdaptacion() {
        return tieneAdaptacion;
    }

    public void setTieneAdaptacion(boolean tieneAdaptacion) {
        this.tieneAdaptacion = tieneAdaptacion;
    }

    public String getDescripcionAdaptacion() {
        return descripcionAdaptacion;
    }

    public void setDescripcionAdaptacion(String descripcionAdaptacion) {
        this.descripcionAdaptacion = descripcionAdaptacion;
    }

    public static int getNumOpositores() {
        return numOpositores;
    }

    public static void setNumOpositores(int numOpositores) {
        Opositor.numOpositores = numOpositores;
    }

    public static int getNumAdaptaciones() {
        return numAdaptaciones;
    }

    public static void setNumAdaptaciones(int numAdaptaciones) {
        Opositor.numAdaptaciones = numAdaptaciones;
    }

    public void mostrarInformacion() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Opositor{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", tieneAdaptacion=" + tieneAdaptacion +
                ", descripcionAdaptacion='" + descripcionAdaptacion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opositor opositor = (Opositor) o;
        return tieneAdaptacion == opositor.tieneAdaptacion &&
                Objects.equals(nombre, opositor.nombre) &&
                Objects.equals(apellidos, opositor.apellidos) &&
                Objects.equals(fechaNacimiento, opositor.fechaNacimiento) &&
                Objects.equals(descripcionAdaptacion, opositor.descripcionAdaptacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos, fechaNacimiento, tieneAdaptacion, descripcionAdaptacion);
    }
}
