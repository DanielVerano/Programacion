package Tarea2.Actividad2;

import java.util.Comparator;

public class ClienteOrdenadosPorEdad implements Comparator<Cliente> {
    @Override
    public int compare(Cliente c1, Cliente c2) {
        return c1.getEdad() - c2.getEdad();
    }
}
