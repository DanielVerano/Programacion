package Juego_RPG;

public class Orco extends Personaje implements Atacar {
    private double tonelaje;

    public Orco(String nombre, int energia, int capAtaque, int capDefensa, boolean estaEncantado, double tonelaje) {
        super(nombre, energia, capAtaque, capDefensa, estaEncantado);
        this.tonelaje = tonelaje;
    }

    public double getTonelaje() {
        return tonelaje;
    }

    public void setTonelaje(double tonelaje) {
        this.tonelaje = tonelaje;
    }

    @Override
    public String toString() {
        return "Orco{" +
                "tonelaje=" + tonelaje +
                "} " + super.toString();
    }

    @Override
    public void atacarPersonaje(Personaje p) {

    }
}
