package Empresa_FARA;

import java.util.Arrays;
import java.util.Objects;

public class Caja {
    private int ID;
    private Prenda[] prendas;
    private final int CAPMAX = 5;

    public Caja(int ID) {
        this.ID = ID;
        this.prendas = new Prenda[0];
    }

    public int getID() {
        return ID;
    }

    public Prenda[] getPrendas() {
        return prendas;
    }

    public int getCAPMAX() {
        return CAPMAX;
    }

    public boolean addPrenda(Prenda prenda) {
//        No es necesario comparar prendas, pueden haber varias de la misma
        if (prendas.length < CAPMAX) {
            prendas = Arrays.copyOf(prendas, prendas.length + 1);
            prendas[prendas.length - 1] = prenda;
            return true;
        }
        return false;
    }

    public boolean removePrenda(Prenda prenda) {
//        Solo quitamos una prenda si coincide, las demás las dejamos
        boolean eliminada = false;

        if (existePrenda(prenda)) {
            Prenda[] result = new Prenda[0];

            for (Prenda pr : prendas) {
                if (!pr.equals(prenda) || eliminada) {
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = pr;
                } else {
                    eliminada = true;
                }
            }
            return true;
        }
        return false;
    }

    private boolean existePrenda(Prenda prenda) {
        for (Prenda pr : prendas) {
            if (pr.equals(prenda)) {
                return true;
            }
        }
        return false;
    }

    public double getPeso() {
        double result = 0;
        for (Prenda prenda : prendas) {
            result += prenda.getPeso();
        }
        return result;
    }

    @Override
    public String toString() {
        return "Caja{" +
                "ID=" + ID +
                ", prendas=" + Arrays.toString(prendas) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Caja caja = (Caja) o;
        return ID == caja.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }
}
