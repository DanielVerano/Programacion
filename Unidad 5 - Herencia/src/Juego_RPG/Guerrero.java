package Juego_RPG;

public class Guerrero extends Hombre implements Atacar {
    private int edad;

    public Guerrero(String nombre, int energia, int capAtaque, int capDefensa, int edad) {
        super(nombre, energia, capAtaque, capDefensa);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Guerrero{" +
                "edad=" + edad +
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
