package ExamenAjedrez;

public class Main {
    public static void main(String[] args) {
        PiezaDamas damas1 = new PiezaDamas(4,5, Color.BLANCO);
        Torre torre1 = new Torre(4,5, Color.NEGRO);
        PiezaTablero[] piezas = new PiezaTablero[]{damas1, torre1};

        for (PiezaTablero pieza : piezas) {
            System.out.println(pieza);
        }

        damas1.mover(3,6);
        torre1.mover(4,8);

        for (PiezaTablero pieza : piezas) {
            System.out.println(pieza);
        }
    }
}
