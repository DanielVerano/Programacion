import java.io.Serializable;
import java.util.Objects;

public class Trabajador implements Serializable, Comparable<Trabajador> {
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private String formacion;

    public Trabajador(String dni, String nombre, String apellidos, int edad, String formacion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.formacion = formacion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFormacion() {
        return formacion;
    }

    public void setFormacion(String formacion) {
        this.formacion = formacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trabajador that = (Trabajador) o;
        return Objects.equals(dni, that.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", formacion='" + formacion + '\'' +
                '}';
    }

    @Override
    public int compareTo(Trabajador trabajador) {
        int result = this.getApellidos().compareTo(trabajador.getApellidos());

        if (result == 0) {
            result = this.getNombre().compareTo(trabajador.getNombre());
        }
        return result;
    }
}
