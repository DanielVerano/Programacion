package Libro_ColaLista;

public class Main {
    public static void main(String[] args) {
        ColaLista cola1 = new ColaLista();
        ColaLista cola2 = new ColaLista(5);
        System.out.println(cola1);
        System.out.println(cola2);

        System.out.println("Encolar números:");
        for (int i = 0; i < 10; i++) {
            cola1.encolar(i * 10);
            cola2.encolar(i * 5);
        }
        System.out.println(cola1);
        System.out.println(cola2);

        System.out.println("Desencolar números:");
        for (int i = 0; i < 5; i++) {
            cola1.desencolar();
            cola2.desencolar();
        }
        System.out.println(cola1);
        System.out.println(cola2);
    }
}
