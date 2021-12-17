package Tarea1;

public class MainSintonizador {
    public static void main(String[] args) {
        Sintonizador s1 = new Sintonizador();

        for (int i = 0; i < 57; i++) {
            System.out.println(s1.subirFrecuencia());
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(s1.bajarFrecuencia());
        }
    }
}
