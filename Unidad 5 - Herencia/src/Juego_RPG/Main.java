package Juego_RPG;

public class Main {
    public static void main(String[] args) {
        Elfo elfo1 = new Elfo("Legolas", 600, 90, 40, TipoElfo.BOSQUE);
        Enano enano1 = new Enano("Gimli", 900, 70, 60, 100);
        Guerrero guerrero1 = new Guerrero("Boromir", 750, 80, 75,  35);
        Mago mago1 = new Mago("Gandalf", 800, 100, 30,  30);
        Orco orco1 = new Orco("Lurtz", 100, 60, 50, 50);

        RPG juego = new RPG();
        juego.addPersonaje(elfo1);
        juego.addPersonaje(enano1);
        juego.addPersonaje(guerrero1);
        juego.addPersonaje(mago1);
        juego.addPersonaje(orco1);

        System.out.println("Ordenar por energia:");
        juego.mostrarEstado();
        System.out.println("Ordenar por ataque:");
        juego.mostrarxAtaque();
        System.out.println("Ordenar por defensa:");
        juego.mostrarXDefensa();

        mago1.encantar(orco1);
        elfo1.atacarPersonaje(orco1);
        guerrero1.atacarPersonaje(orco1);
        juego.mostrarEstado();
        juego.borrarMuertos();
        juego.mostrarEstado();
    }
}
