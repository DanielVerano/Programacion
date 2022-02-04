package ExamenAjedrez;

public abstract class PiezaAjedrez extends PiezaTablero implements Movible {

    public PiezaAjedrez(int posicionX, int posicionY, Color color) {
        super(posicionX, posicionY, color);
    }

    @Override
    public String toString() {
        return "PiezaAjedrez{} " + super.toString();
    }

    @Override
    public boolean esMovible(int x, int y) {
        return false;
    }

    @Override
    public void mover(int x, int y) {

    }
}
