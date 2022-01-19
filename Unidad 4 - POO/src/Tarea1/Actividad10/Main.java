package Tarea1.Actividad10;

public class Main {
    public static void main(String[] args) {
        Hora h1 = new Hora(23,59,59);
        h1.incrementar(60*60*24);
        System.out.println(h1);
        h1.incrementar(2);
        System.out.println(h1);
    }
}
