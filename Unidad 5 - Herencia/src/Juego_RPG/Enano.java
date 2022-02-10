package Juego_RPG;

public class Enano extends Personaje implements Atacar {
    private double altura;

    public Enano(String nombre, int energia, int capAtaque, int capDefensa, double altura) {
        super(nombre, energia, capAtaque, capDefensa);
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


    @Override
    public void atacarPersonaje(Personaje p) {
        System.out.println(this.getNombre() + " - ATACANDO A " + p.getNombre());

        if (this.getClass().equals(p.getClass())) {
            System.out.println("No puedo atacar a un personaje del mismo tipo");
            return;
        }

        if (p.isEncantado()) {
            p.setEnergia(p.getEnergia() - 2 * (this.getCapAtaque() - p.getCapDefensa()));
        }
        p.setEnergia(p.getEnergia() - (this.getCapAtaque() - p.getCapDefensa()));
    }
}
