package ExamenAjedrez;

public class PiezaDamas extends PiezaTablero implements Movible {

    public PiezaDamas(int posicionX, int posicionY, Color color) {
        super(posicionX, posicionY, color);
    }

    @Override
    public boolean esMovible(int x, int y) {
        return estaDentro(x, y) &&
                ((getPosicionX() - getPosicionY() == x - y) ||
                (getPosicionX() + getPosicionY() == x + y));
    }

    @Override
    public void mover(int x, int y) {
        if (esMovible(x, y)) {
            setPosicionX(x);
            setPosicionY(y);
        }
    }

    @Override
    public String toString() {
        return "PiezaDamas{ " + super.toString();
    }
}
