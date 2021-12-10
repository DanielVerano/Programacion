package Tarea1;

public class Banco {
    private String nombre;
    private int capital;
    private String direccion;

    public Banco(String nombre, int capital, String direccion) {
        this.nombre = nombre;
        this.capital = capital;
        this.direccion = direccion;
    }

    public Banco(String nombre) {
        this(nombre, 5200000, "");
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


}
