package Juego_RPG;

public class Elfo extends Personaje implements Atacar {
    private TipoElfo tipo;

    public Elfo(String nombre, int energia, int capAtaque, int capDefensa, TipoElfo tipo) {
        super(nombre, energia, capAtaque, capDefensa);
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
        System.out.println(this.getNombre() + " - ATACANDO A " + p.getNombre());

        if (this.getClass().equals(p.getClass()) && this.getTipo().equals(((Elfo) p).getTipo())) {
            System.out.println("No puedo atacar a un personaje de la misma clase");
            return;
        }

        if (p.isEncantado()) {
            p.setEnergia(p.getEnergia() - 2 * (this.getCapAtaque() - p.getCapDefensa()));
        } else {
            p.setEnergia(p.getEnergia() - (this.getCapAtaque() - p.getCapDefensa()));
        }
    }
}
