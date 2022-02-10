package Tarea1.Actividad9;

public class Lavadora extends Electrodomestico {
    private double carga;
    private final int CARGA_INICIAL = 5;

    public Lavadora(double precioBase, Color color, Consumo consumo, double peso, double carga) {
        super(precioBase, color, consumo, peso);
        this.carga = carga;
    }

    public Lavadora() {
        super();
        this.carga = CARGA_INICIAL;
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = CARGA_INICIAL;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public double getPrecioFinal() {
        if (getCarga() >= 30) {
            return super.getPrecioFinal() + 50;
        }
        return super.getPrecioFinal();
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "carga=" + carga +
                ", precioFinal=" + getPrecioFinal() +
                "} " + super.toString();
    }
}
