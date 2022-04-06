package Examen1920_Manana;

import java.io.Serializable;
import java.util.Objects;

public class Propietario implements Serializable {
    private String nombre, apellidos, pais;
    private int numSocio;

    public Propietario(String nombre, String apellidos, int numSocio, String pais) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numSocio = numSocio;
        this.pais = pais;
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

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Propietario that = (Propietario) o;
        return numSocio == that.numSocio && Objects.equals(nombre, that.nombre) && Objects.equals(apellidos, that.apellidos) && Objects.equals(pais, that.pais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos, pais, numSocio);
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numSocio='" + numSocio + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
