package Juego_RPG;

public class Elfo extends Personaje implements Atacar {
    private TipoElfo tipo;

    public Elfo(String nombre, int energia, int capAtaque, int capDefensa, boolean estaEncantado, TipoElfo tipo) {
        super(nombre, energia, capAtaque, capDefensa, estaEncantado);
        this.tipo = tipo;
    }

    public TipoElfo getTipo() {
        return tipo;
    }

    public void setTipo(TipoElfo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Elfo{" +
                "tipo=" + tipo +
                "} " + super.toString();
    }

    @Override
    public void atacarPersonaje(Personaje p) {
        System.out.println(this.getNombre() + " - ATACANDO");

        if (!this.getClass().equals(p.getClass())) {
            if (p.isEncantado()) {
                int newEnergy = p.getEnergia() - 2 * (this.getCapAtaque() - p.getCapDefensa());
            }
            int newEnergy = p.getEnergia() - (this.getCapAtaque() - p.getCapDefensa());
            p.setEnergia(newEnergy);
        }
    }
}
