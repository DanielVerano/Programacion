package Empresa_ATRIOS;

import java.util.Objects;

public class Pais implements Comparable<Pais> {
    private String nombre;
    private int numParticipantes;

    public Pais(String nombre, int numParticipantes) {
        this.nombre = nombre;
        this.numParticipantes = numParticipantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumParticipantes() {
        return numParticipantes;
    }

    public void setNumParticipantes(int numParticipantes) {
        this.numParticipantes = numParticipantes;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", numParticipantes=" + numParticipantes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pais pais = (Pais) o;
        return Objects.equals(nombre, pais.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public int compareTo(Pais pais) {
        return this.getNombre().compareTo(pais.getNombre());
    }
}
