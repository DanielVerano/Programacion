package Empresa_FARA;

public class Conductor {
    private String nombre;
    private String apellidos;
    private String NSS;

    public Conductor(String nombre, String apellidos, String NSS) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NSS = NSS;
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

    public String getNSS() {
        return NSS;
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", NSS='" + NSS + '\'' +
                '}';
    }
}
