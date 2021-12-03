public class Alumno {

    private String nombre;
    private String apellidos;
    private String direccion;
    private String centro = "IES ALIXAR";

    public Alumno(String nombre, String apellidos, String direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
    }

    public Alumno(String nombre, String apellidos, String direccion, String centro) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.centro = centro;
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

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    @Override
    public String toString() {
        return "Nombre:" + nombre + '\n' +
               "Apellidos:" + apellidos + '\n' +
               "Direccion:" + direccion + '\n' +
               "Centro:" + centro + '\n';
    }
}
