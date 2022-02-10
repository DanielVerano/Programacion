package Juego_RPG;

import java.util.Comparator;

public class ComparadorPorDefensa implements Comparator<Personaje> {
    @Override
    public int compare(Personaje p1, Personaje p2) {
        return p1.getCapDefensa() - p2.getCapDefensa();
    }
}
