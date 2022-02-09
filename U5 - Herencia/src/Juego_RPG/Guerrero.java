package Juego_RPG;

public class Guerrero extends Hombre {
    private int edad;

    public Guerrero(String nombre, int energia, int capAtaque, int capDefensa, boolean estaEncantado, int edad) {
        super(nombre, energia, capAtaque, capDefensa, estaEncantado);
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
}
