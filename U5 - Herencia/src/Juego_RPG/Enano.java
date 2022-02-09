package Juego_RPG;

public class Enano extends Personaje {
    private double altura;

    public Enano(String nombre, int energia, int capAtaque, int capDefensa, boolean estaEncantado, double altura) {
        super(nombre, energia, capAtaque, capDefensa, estaEncantado);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Enano{" +
                "altura=" + altura +
                "} " + super.toString();
    }
}
