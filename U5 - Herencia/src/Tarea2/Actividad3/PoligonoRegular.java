package Tarea2.Actividad3;

import java.util.Objects;

public abstract class PoligonoRegular implements Figura {
    double lado;
    public Color color;
    private static int contadorPoligonos = 0;

    public PoligonoRegular(double lado, Color color) {
        this.lado = lado;
        this.color = color;
        contadorPoligonos++;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static int getContadorPoligonos() {
        return contadorPoligonos;
    }

    @Override
    public String toString() {
        return "PoligonoRegular{" +
                "lado=" + lado +
                ", color=" + color +
                '}';
    }
}
