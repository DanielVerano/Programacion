package Tarea1;

public class MainTexto {
    public static void main(String[] args) {
        Texto txt1 = new Texto("Hola", 10);
        System.out.println(txt1);

        txt1.addCharStart('w');
        System.out.println(txt1);

        txt1.addCharFin('u');
        System.out.println(txt1);

        System.out.println(txt1.mostrarVocales());
    }
}
