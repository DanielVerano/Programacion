package Empresa_FARA;

import java.util.Objects;

public class Prenda implements Ropa {
    private double precio;
    private String nombre;
    private String codigo;
    private double peso;
    private static int numPrendas = 0;

    public Prenda(double precio, String nombre, String codigo, double peso) {
        this.precio = precio;
        this.nombre = nombre;
        this.codigo = codigo;
        this.peso = peso;
        numPrendas++;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public static int getNumPrendas() {
        return numPrendas;
    }

    @Override
    public String toString() {
        return "Prenda{" +
                "precio=" + precio +
                ", nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", peso=" + peso +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prenda prenda = (Prenda) o;
        return Objects.equals(codigo, prenda.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public void devolver() {
        System.out.println("Devolviendo la prenda con nombre " + getNombre() + " y precio " + getPrecio());
    }

    @Override
    public void doblar() {
        System.out.println("La prenda " + getNombre() + " se puede doblar");
    }
}
