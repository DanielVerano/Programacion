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
        if (prendas.length < CAPMAX) {
            for (int i = 0; i < prendas.length; i++) {
                if (prendas[i].equals(prenda)) {
                    return false;
                }
            }

            Prenda[] result = Arrays.copyOf(prendas, prendas.length + 1);
            result[result.length - 1] = prenda;
            prendas = result;
            return true;
        }
        return false;
    }

    public boolean removePrenda(Prenda prenda) {
        boolean existe = false;

        for (Prenda pr : prendas) {
            if (pr.equals(prenda)) {
                existe = true;
            }
        }

        if (existe) {
            Prenda[] result = new Prenda[0];

            for (Prenda pr : prendas) {
                if (!pr.equals(prenda)) {
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = pr;
                }
            }
            return true;
        }
        return false;
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
