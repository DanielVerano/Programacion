package Tarea1.Actividad9;

import java.util.Objects;

public abstract class Electrodomestico {
    double precioBase;
    Color color;
    Consumo consumo;
    double peso;

    public Electrodomestico(double precioBase, Color color, Consumo consumo, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Electrodomestico() {
        this(100,Color.BLANCO,Consumo.F,5);
    }

    public Electrodomestico(double precioBase, double peso) {
        this(precioBase,Color.BLANCO, Consumo.F, peso);
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public Color getColor() {
        return color;
    }

    public Consumo getConsumo() {
        return consumo;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecioFinal() {
        return getPrecioBase() + getPrecioSegunConsumo() + getPrecioSegunPeso();
    }

    private double getPrecioSegunConsumo() {
        switch (getConsumo()) {
            case A:
                return 100;
            case B:
                return 80;
            case C:
                return 60;
            case D:
                return 50;
            case E:
                return 30;
            case F:
                return 10;
            default:
                return 0;
        }
    }

    private double getPrecioSegunPeso() {
        if (getPeso() >= 80) {
            return 100;
        } else if (getPeso() >= 50 && getPeso() < 80) {
            return 80;
        } else if (getPeso() >= 30 && getPeso() < 50) {
            return 60;
        } else if (getPeso() >= 0 && getPeso() < 30) {
            return 10;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumo=" + consumo +
                ", peso=" + peso +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Electrodomestico that = (Electrodomestico) o;
        return Double.compare(that.getPrecioFinal(), this.getPrecioFinal()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(precioBase, color, consumo, peso);
    }
}
