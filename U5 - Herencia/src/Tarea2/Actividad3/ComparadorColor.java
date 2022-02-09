package Tarea2.Actividad3;

import java.util.Comparator;

public class ComparadorColor implements Comparator<Triangulo> {
    @Override
    public int compare(Triangulo t1, Triangulo t2) {
        return t1.getColor().toString().compareTo(t2.getColor().toString());
    }
}
