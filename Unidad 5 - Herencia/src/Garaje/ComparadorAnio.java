package Garaje;

import java.util.Comparator;

public class ComparadorAnio implements Comparator<VehiculoTerrestre> {
    @Override
    public int compare(VehiculoTerrestre v1, VehiculoTerrestre v2) {
        return v1.getAnio() - v2.getAnio();
    }
}
