package Tarea1.Actividad10;

public class Main {
    public static void main(String[] args) {
        Hora h1 = new Hora(23,59,59);
        h1.incrementar(60*60*24);
        System.out.println(h1);

        for (int i = 0; i < 60; i++) {
            h1.incrementar(1);
            System.out.println(h1);
        }
    }
}
