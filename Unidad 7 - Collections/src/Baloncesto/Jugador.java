package Baloncesto;

import java.io.Serializable;
import java.util.Objects;

public class Jugador implements Serializable, Comparable<Jugador> {
    private String nombre, apellidos;
    private int altura, edad;

    public Jugador(String nombre, String apellidos, int altura, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.altura = altura;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return altura == jugador.altura && edad == jugador.edad && Objects.equals(nombre, jugador.nombre) && Objects.equals(apellidos, jugador.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos, altura, edad);
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", altura=" + altura +
                ", edad=" + edad +
                '}';
    }

    @Override
    public int compareTo(Jugador jugador) {
        return this.getEdad() - jugador.getEdad();
    }
}
