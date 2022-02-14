package ExamenAjedrez;

public class Torre extends PiezaAjedrez implements Movible {

    public Torre(int posicionX, int posicionY, Color color) {
        super(posicionX, posicionY, color);
    }

    @Override
    public boolean esMovible(int x, int y) {
        return estaDentro(x, y) &&
                ((x == getPosicionX() && y != getPosicionY()) ||
                (x != getPosicionX() && y == getPosicionY()));
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
        return "Torre{ " + super.toString();
    }
}
