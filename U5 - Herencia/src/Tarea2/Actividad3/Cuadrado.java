package Tarea2.Actividad3;

public class Cuadrado extends PoligonoRegular {

    public Cuadrado(double lado, Color color) {
        super(lado, color);
    }

    public Cuadrado() {
        this(10, Color.AZUL);
    }

    @Override
    public double getArea() {
        return Math.pow(this.getLado(), 2);
    }

    @Override
    public String toString() {
        return "Cuadrado{} " + super.toString();
    }
}
