package ExamenAjedrez;

public class Peon extends PiezaAjedrez {

    public Peon(int posicionX, int posicionY, Color color) {
        super(posicionX, posicionY, color);
    }

    @Override
    public String toString() {
        return "Peon{} " + super.toString();
    }
}
