package Interfaces;

import java.util.Objects;

public abstract class Animal {
    private String nombre;
    private int numPatas;
    private String tipo;

    public Animal(String nombre, int numPatas, String tipo) {
        this.nombre = nombre;
        this.numPatas = numPatas;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", numPatas=" + numPatas +
                ", tipo=" + tipo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return numPatas == animal.numPatas && Objects.equals(tipo, animal.tipo) && Objects.equals(nombre, animal.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, numPatas, tipo);
    }
}
