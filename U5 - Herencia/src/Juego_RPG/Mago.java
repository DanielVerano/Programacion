package Juego_RPG;

public class Mago extends Hombre {
    private int longitudBarba;

    public Mago(String nombre, int energia, int capAtaque, int capDefensa, boolean estaEncantado, int longitudBarba) {
        super(nombre, energia, capAtaque, capDefensa, estaEncantado);
        this.longitudBarba = longitudBarba;
    }

    public int getLongitudBarba() {
        return longitudBarba;
    }

    public void setLongitudBarba(int longitudBarba) {
        this.longitudBarba = longitudBarba;
    }

    @Override
    public String toString() {
        return "Mago{" +
                "longitudBarba=" + longitudBarba +
                "} " + super.toString();
    }
}
