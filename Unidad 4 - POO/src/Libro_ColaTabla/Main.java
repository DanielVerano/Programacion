package Libro_ColaTabla;

public class Main {
    public static void main(String[] args) {
        ColaTabla cola1 = new ColaTabla(5);

        for (int i = 0; i < 5; i++) {
            cola1.encolar(i);
        }
        System.out.println(cola1);
        System.out.println(cola1.colaLlena());

        for (int i = 0; i < 5; i++) {
            cola1.desencolar();
            System.out.println(cola1);
        }
        System.out.println(cola1.colaVacia());
    }
}
