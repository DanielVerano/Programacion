package ExamenAjedrez;

public abstract class PiezaTablero {
    private int posicionX;
    private int posicionY;
    private Color color;

    public PiezaTablero(int posicionX, int posicionY, Color color) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.color = color;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public Color getColor() {
        return color;
    }

    protected boolean estaDentro(int posX, int posY) {
        return posX >= 1 && posX <= 8 && posY >= 1 && posY <= 8;
    }

    @Override
    public String toString() {
        return "PiezaTablero{" +
                "posicionX=" + posicionX +
                ", posicionY=" + posicionY +
                ", color=" + color +
                '}';
    }
}
