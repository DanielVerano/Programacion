package Tarea1;

public class Caja {
    private double ancho;
    private double alto;
    private double fondo;
    private Unidad unidad;
    private Etiqueta etiqueta;

    public Caja(double ancho, double alto, double fondo, Unidad unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public double getFondo() {
        return fondo;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public Etiqueta getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(Etiqueta etiqueta) {
        this.etiqueta = etiqueta;
    }

    public double getVolumen() {
        if (getUnidad() == Unidad.M) {
            return ancho * alto * fondo;
        } else {
            return (ancho * alto * fondo) / 1000000;
        }
    }

    @Override
    public String toString() {
        return "Caja{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", fondo=" + fondo +
                ", unidad=" + unidad +
                ", etiqueta=" + etiqueta +
                '}';
    }
}
