package Tarea1.Actividad8;

public class MainBombilla {
    public static void main(String[] args) {
        Bombilla b1 = new Bombilla();
        Bombilla b2 = new Bombilla(true);
        Bombilla b3 = new Bombilla(true);
        Bombilla b4 = new Bombilla(true);
        Bombilla b5 = new Bombilla(true);
        Casa c1 = new Casa();
        Casa c2 = new Casa();

        c1.addBombilla(b1);
        c1.addBombilla(b5);
        c2.addBombilla(b2);
        c2.addBombilla(b3);
        c2.addBombilla(b4);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(c1);
        System.out.println(c2);

        c2.setGeneral(true);
        System.out.println(c2.isBombillaOn(0));
    }
}
