package Tarea1.Actividad8;

public class Bombilla {
    private boolean encendida;

    public Bombilla(boolean estado) {
        this.encendida = estado;
    }

    public Bombilla() {
        this(false);
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    @Override
    public String toString() {
        return "Bombilla{" +
                "encendida=" + encendida +
                '}';
    }
}
