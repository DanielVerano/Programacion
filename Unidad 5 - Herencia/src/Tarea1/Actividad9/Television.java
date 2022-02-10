package Tarea1.Actividad9;

public class Television extends Electrodomestico {
    private double resolucion;
    private boolean tdt;

    public Television() {
        super();
        this.resolucion = 20;
        this.tdt = false;
    }

    public Television(double precioBase, Color color, Consumo consumo, double peso, double resolucion, boolean tdt) {
        super(precioBase, color, consumo, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public Television(double precioBase, double peso) {
        this(precioBase, Color.BLANCO, Consumo.F, peso, 20, false);
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    @Override
    public double getPrecioFinal() {
        double result = super.getPrecioFinal();

        if (getResolucion() > 40) {
            result = result * 1.3;
        }

        if (isTdt()) {
            result += 50;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Television{" +
                "resolucion=" + resolucion +
                ", tdt=" + tdt +
                ", precioFinal=" + getPrecioFinal() +
                "} " + super.toString();
    }
}
