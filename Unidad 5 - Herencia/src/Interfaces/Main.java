package Interfaces;

public class Main {
    public static void main(String[] args) {
        Perro p = new Perro("A",4,"M","A");
        Gato g = new Gato("B",4,"M","A");
        Caracol c = new Caracol("C",0,"C",2);

        p.voz();
        g.voz();
        p.morir();
        g.morir();
        c.morir();
    }
}
