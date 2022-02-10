package Tarea1;

public class MainInstrumento {
    public static void main(String[] args) {
        Piano p1 = new Piano();
        Campana c1 = new Campana();

        p1.add(Nota.DO);
        c1.add(Nota.SOL);

        System.out.println(p1);
        System.out.println(c1);
    }
}
