package Juego_RPG;

public class Orco extends Personaje implements Atacar {
    private double tonelaje;

    public Orco(String nombre, int energia, int capAtaque, int capDefensa, double tonelaje) {
        super(nombre, energia, capAtaque, capDefensa);
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
        System.out.println(this.getNombre() + " - ATACANDO A " + p.getNombre());

        if (this.getClass().equals(p.getClass())) {
            System.out.println("No puedo atacar a un personaje de la misma clase");
            return;
        }

        if (p.isEncantado()) {
            p.setEnergia(p.getEnergia() - 2 * (this.getCapAtaque() - p.getCapDefensa()));
        }
        p.setEnergia(p.getEnergia() - (this.getCapAtaque() - p.getCapDefensa()));
    }
}
