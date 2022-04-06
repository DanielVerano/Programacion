package Examen1920_Manana;

import java.io.Serializable;
import java.util.Objects;

public class Perro implements Serializable, Comparable<Perro> {
    private String nombre;
    private int edad;
    private double peso;
    private boolean vacunado;
    private Propietario propietario;
    private String raza;

    public Perro(String nombre, int edad, double peso, boolean vacunado, Propietario propietario, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.vacunado = vacunado;
        this.propietario = propietario;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Perro perro = (Perro) o;
        return edad == perro.edad && Double.compare(perro.peso, peso) == 0 && vacunado == perro.vacunado && Objects.equals(nombre, perro.nombre) && Objects.equals(propietario, perro.propietario) && Objects.equals(raza, perro.raza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, peso, vacunado, propietario, raza);
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", vacunado=" + vacunado +
                ", propietario=" + propietario +
                ", raza='" + raza + '\'' +
                '}';
    }

    @Override
    public int compareTo(Perro perro) {
        return Double.compare(perro.getPeso(), this.getPeso());
    }
}
