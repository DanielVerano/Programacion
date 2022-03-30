package Tarea3.Map_I;

public class Ejer4Main {
    public static void main(String[] args) {
        Traductor traductor = new Traductor("diccionario.txt");

        System.out.println(traductor.traducir("hola"));
        System.out.println(traductor.traducir("mundo"));
        System.out.println(traductor.traducir("gracias"));
        System.out.println(traductor.traducir("adios"));

        System.out.println(traductor.getDiccionario());
    }
}
