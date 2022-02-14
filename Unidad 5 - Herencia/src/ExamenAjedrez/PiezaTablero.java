package ExamenAjedrez;

public abstract class PiezaTablero {
    private int posicionX;
    private int posicionY;
    private Color color;

    public PiezaTablero(int posicionX, int posicionY, Color color) {
        if (estaDentro(posicionX, posicionY)) {
            this.posicionX = posicionX;
            this.posicionY = posicionY;
        } else {
            throw new IllegalArgumentException("Posición no válida");
        }
        this.color = color;
    }

    public int getPosicionX() {
        return posicionX;
    }

    protected void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    protected void setPosicionY(int posicionY) {
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
        return "posicionX=" + posicionX +
                ", posicionY=" + posicionY +
                ", color=" + color +
                '}';
    }
}
