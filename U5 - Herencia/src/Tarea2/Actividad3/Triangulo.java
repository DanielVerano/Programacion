package Tarea2.Actividad3;

import java.util.Objects;

public class Triangulo extends PoligonoRegular implements Comparable {

    private double altura;

    public Triangulo(double lado, Color color, double altura) {
        super(lado, color);
        this.altura = altura;
    }

    public Triangulo(double lado, Color color) {
        this(10, Color.AZUL, 10);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return this.getLado() * this.getAltura() / 2;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "altura=" + altura +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Triangulo triangulo = (Triangulo) o;
        return Double.compare(triangulo.altura, altura) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), altura);
    }

    @Override
    public int compareTo(Object o) {
        Triangulo t = (Triangulo) o;
        return (int) (this.lado - t.altura);
    }
}
