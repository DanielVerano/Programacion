package Tarea1.Actividad9.Personal;

public class Maquinista {
    private String nombreCompleto;
    private String dni;
    private double sueldo;
    private String rango;

    public Maquinista(String nombreCompleto, String dni, double sueldo, String rango) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.sueldo = sueldo;
        this.rango = rango;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "Maquinista{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", dni='" + dni + '\'' +
                ", sueldo=" + sueldo +
                ", rango='" + rango + '\'' +
                '}';
    }
}
