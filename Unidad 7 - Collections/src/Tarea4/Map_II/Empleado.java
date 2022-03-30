package Tarea4.Map_II;

import java.io.Serializable;

public class Empleado extends Persona implements Serializable {
    private double sueldo;

    public Empleado(String nombre, String dni, int edad, double estatura, double sueldo) {
        super(nombre, dni, edad, estatura);
        this.sueldo = sueldo;
    }

    public Empleado(String nombre, String dni, double sueldo) {
        super(nombre, dni);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + super.toString() +
                ", sueldo=" + sueldo +
                "}";
    }
}
