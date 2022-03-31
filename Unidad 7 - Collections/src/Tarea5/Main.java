package Tarea5;

public class Main {
    public static void main(String[] args) {
        Aspirante a1 = new Aspirante("Pepe","1111A","1111");
        IntroducirAspirantes ia = new IntroducirAspirantes();
        ia.insertaAspirante();
        ia.guardarFicheros();
    }
}
