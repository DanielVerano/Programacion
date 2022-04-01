package Examen1920_Tarde;

import java.io.Serializable;

public class Medico implements Serializable {
    private String nombre;
    private String apellidos;
    private int numColegiado;
    private String hospital;

    public Medico(String nombre, String apellidos, int numColegiado, String hospital) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numColegiado = numColegiado;
        this.hospital = hospital;
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

    public int getNumColegiado() {
        return numColegiado;
    }

    public void setNumColegiado(int numColegiado) {
        this.numColegiado = numColegiado;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numColegiado=" + numColegiado +
                ", hospital='" + hospital + '\'' +
                '}';
    }
}
