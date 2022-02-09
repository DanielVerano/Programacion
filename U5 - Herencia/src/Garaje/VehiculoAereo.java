package Garaje;

import java.util.Objects;

public abstract class VehiculoAereo extends Vehiculo implements Vuela, Comparable<VehiculoAereo> {
    private int altitud;
    private String codigo;

    public VehiculoAereo(String nombre, int capacidad, int altitud, String codigo) {
        super(nombre, capacidad);
        this.altitud = altitud;
        this.codigo = codigo;
    }

    public int getAltitud() {
        return altitud;
    }

    public void setAltitud(int altitud) {
        this.altitud = altitud;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "VehiculoAereo{" +
                "altitud=" + altitud +
                ", codigo='" + codigo + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehiculoAereo that = (VehiculoAereo) o;
        return Objects.equals(codigo, that.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public int compareTo(VehiculoAereo v) {
        return this.getCodigo().compareTo(v.getCodigo());
    }

    @Override
    public void volar() {
        System.out.println("Altitud: " + this.getAltitud());
        System.out.println("Tipo: " + this.getClass().getSimpleName());
    }
}
