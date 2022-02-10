package Interfaces;

import java.util.Objects;

public class Gato extends Animal implements Voz, Morir {
    private String raza;

    public Gato(String nombre, int numPatas, String tipo, String raza) {
        super(nombre, numPatas, tipo);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "raza='" + raza + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Gato gato = (Gato) o;
        return Objects.equals(raza, gato.raza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), raza);
    }

    @Override
    public void voz() {
        System.out.println("MIAU");
    }
}
