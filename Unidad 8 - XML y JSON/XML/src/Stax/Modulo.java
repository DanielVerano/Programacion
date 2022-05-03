package Stax;

public class Modulo {
    private String nombre;
    private int horas, codigo;

    public Modulo(String nombre, int horas, int codigo) {
        this.nombre = nombre;
        this.horas = horas;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Modulo{" +
                "nombre='" + nombre + '\'' +
                ", horas=" + horas +
                ", codigo=" + codigo +
                '}';
    }
}
