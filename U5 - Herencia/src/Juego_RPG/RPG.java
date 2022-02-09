package Juego_RPG;

public class RPG {
    private Personaje[] personajes;
    private final int CAPMAX = 10;

    public RPG() {
        this.personajes = new Personaje[0];
    }

    public Personaje[] getPersonajes() {
        return personajes;
    }

    public int getCAPMAX() {
        return CAPMAX;
    }
}
