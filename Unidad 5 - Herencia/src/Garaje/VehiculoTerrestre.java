package Garaje;

import java.util.Objects;

public abstract class VehiculoTerrestre extends Vehiculo implements Comparable<VehiculoTerrestre> {
    private String matricula;
    private int anio;
    private Color color;

    public VehiculoTerrestre(String nombre, int numPersonas, String matricula, int anio, Color color) {
        super(nombre, numPersonas);
        this.matricula = matricula;
        this.anio = anio;
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "VehiculoTerrestre{" +
                "matricula='" + matricula + '\'' +
                ", anio=" + anio +
                ", color=" + color +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehiculoTerrestre that = (VehiculoTerrestre) o;
        return Objects.equals(matricula, that.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public int compareTo(VehiculoTerrestre vt) {
        return this.getMatricula().compareTo(vt.getMatricula());
    }
}
