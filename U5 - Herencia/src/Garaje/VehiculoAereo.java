package Garaje;

public abstract class VehiculoAereo extends Vehiculo {
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
}
