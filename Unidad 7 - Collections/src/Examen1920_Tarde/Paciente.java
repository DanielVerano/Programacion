package Examen1920_Tarde;

import java.io.Serializable;

public class Paciente implements Serializable {
    private String nombre;
    private int edad;
    private double peso;
    private boolean vacunado;
    private Medico medico;
    private Character cepa;

    public Paciente(String nombre, int edad, double peso, boolean vacunado, Medico medico, Character cepa) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.vacunado = vacunado;
        this.medico = medico;
        this.cepa = cepa;
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

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Character getCepa() {
        return cepa;
    }

    public void setCepa(Character cepa) {
        this.cepa = cepa;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", vacunado=" + vacunado +
                ", medico=" + medico +
                ", cepa='" + cepa + '\'' +
                '}';
    }
}
