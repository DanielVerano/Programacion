package Interfaces;

import java.util.Objects;

public class Caracol extends Animal implements Morir {
    private int numCuernos;

    public Caracol(String nombre, int numPatas, String tipo, int numCuernos) {
        super(nombre, numPatas, tipo);
        this.numCuernos = numCuernos;
    }

    public int getNumCuernos() {
        return numCuernos;
    }

    public void setNumCuernos(int numCuernos) {
        this.numCuernos = numCuernos;
    }

    @Override
    public String toString() {
        return "Caracol{" +
                "numCuernos=" + numCuernos +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Caracol caracol = (Caracol) o;
        return numCuernos == caracol.numCuernos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numCuernos);
    }

    @Override
    public void morir() {
        System.out.println("CHOF");
    }
}
