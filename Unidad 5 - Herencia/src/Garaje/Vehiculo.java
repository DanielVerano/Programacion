package Garaje;

public abstract class Vehiculo {
    private String nombre;
    private int capacidad;
    private int capMax;

    public Vehiculo(String nombre, int capMax) {
        this.nombre = nombre;
        this.capMax = capMax;
        this.capacidad = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getCapMax() {
        return capMax;
    }

    public boolean transportar(int cantidad) {
        if (this.capacidad + cantidad <= this.capMax) {
            this.capacidad += cantidad;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "nombre='" + nombre + '\'' +
                ", capacidad=" + capacidad +
                ", capMax=" + capMax +
                '}';
    }
}
