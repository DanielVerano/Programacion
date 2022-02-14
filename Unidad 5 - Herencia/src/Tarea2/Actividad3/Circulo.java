package Tarea2.Actividad3;

import java.util.Objects;

public class Circulo extends PoligonoRegular implements Comparable {
    private double radio;

    public Circulo(double lado, Color color, double radio) {
        super(lado, color);
        this.radio = radio;
    }

    public Circulo(double lado, Color color) {
        this(10, Color.AZUL, 10);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                "} " + super.toString();
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.getRadio(), 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circulo circulo = (Circulo) o;
        return Double.compare(circulo.radio, radio) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radio);
    }

    @Override
    public int compareTo(Object o) {
        Circulo c = (Circulo) o;
        return Double.compare(this.getRadio(), c.getRadio());
    }
}
