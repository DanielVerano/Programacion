package Tarea2.Actividad2;

import java.util.Comparator;

public class ClienteOrdenadosPorSaldo implements Comparator<Cliente> {
    @Override
    public int compare(Cliente c1, Cliente c2) {
        double result = c1.getSaldo() - c2.getSaldo();

        if (result > 0) {
            return 1;
        } else if (result < 0) {
            return -1;
        }
        return 0;
    }
}
