import java.io.Serializable;
import java.util.Objects;

public class Alumno implements Comparable<Alumno>, Serializable {
    private String nombre;
    private String apellidos;
    private String direccion;
    private String dni;
    private String email;
    private int curso;
    private boolean dual;

    public Alumno(String nombre, String apellidos, String direccion, String dni, String email, int curso, boolean dual) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.dni = dni;
        this.email = email;
        this.curso = curso;
        this.dual = dual;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public boolean isDual() {
        return dual;
    }

    public void setDual(boolean dual) {
        this.dual = dual;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return dni.equals(alumno.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", curso=" + curso +
                ", dual=" + dual +
                '}';
    }

    @Override
    public int compareTo(Alumno alumno) {
        int result = this.apellidos.compareTo(alumno.getApellidos());

        if (result == 0) {
            result = this.nombre.compareTo(alumno.getNombre());
        }
        return result;
    }
}
