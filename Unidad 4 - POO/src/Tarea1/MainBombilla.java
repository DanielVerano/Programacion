package Tarea1;

public class MainBombilla {
    public static void main(String[] args) {
        Bombilla b1 = new Bombilla("Pasillo");
        Bombilla b2 = new Bombilla("Comedor");
        Bombilla b3 = new Bombilla("Baño");
        Casa c1 = new Casa();
        c1.anadirBombilla(b1);
        c1.anadirBombilla(b2);
        c1.anadirBombilla(b3);
        c1.mostrarBombillas();
        b2.encenderBombilla();
        c1.mostrarBombillas();
    }
}
