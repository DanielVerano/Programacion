package Tarea2.Actividad2;

public class Main {
    public static void main(String[] args) {
        PilaTabla pila1 = new PilaTabla();
        pila1.apilar(5);
        pila1.apilar(6);
        pila1.apilar(8);
        pila1.desapilar();
        System.out.println(pila1.cima());
        System.out.println(pila1);
    }
}
