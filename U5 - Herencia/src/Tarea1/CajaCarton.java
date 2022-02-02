package Tarea1;

public class CajaCarton extends Caja {
    private int etiqueta;
    private static double cartonTotal = 0;

    public CajaCarton(double ancho, double alto, double fondo) {
        super(ancho, alto, fondo, Unidad.CM);
        cartonTotal = cartonTotal + this.getSuperficie();
    }

    public static double getCartonTotal() {
        return cartonTotal;
    }

    public void setEtiqueta(int etiqueta) {
        this.etiqueta = etiqueta;
    }

    public double getSuperficie() {
        return (getAncho() * getAlto() * 4) + (getAlto() * getFondo() * 2);
    }

    @Override
    public String toString() {
        return "CajaCarton{" +
                "etiqueta=" + etiqueta +
                "} " + super.toString();
    }
}
