package Tarea1;

public class Bombilla {
    private String estado;
    private String nombre;

    public Bombilla(String nombre) {
        this.nombre = nombre;
        this.estado = "Apagada";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void encenderBombilla() {
        this.estado = "Encendida";
    }

    public void apagarBombilla() {
        this.estado = "Apagada";
    }

    @Override
    public String toString() {
        return nombre + ": " + estado;
    }
}
