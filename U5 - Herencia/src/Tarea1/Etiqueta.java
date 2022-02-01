package Tarea1;

public class Etiqueta {
    private String nombre;
    private String direccion;
    private String codigoBarras;

    public Etiqueta(String nombre, String direccion, String codigoBarras) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.codigoBarras = codigoBarras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public String toString() {
        return "Etiqueta{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", codigoBarras='" + codigoBarras + '\'' +
                '}';
    }
}
