package Empresa_FARA;

import java.util.Arrays;

public class CamionPerchas extends Vehiculo implements Comparable<CamionPerchas> {
    private PrendaColgada[] prendas;

    public CamionPerchas(String matricula, double cargaMax, Conductor conductor) {
        super(matricula, cargaMax, conductor);
        this.prendas = new PrendaColgada[0];
    }

    @Override
    void descargar() {
        System.out.println("Descargando " + prendas.length + " prendas");
    }

    public PrendaColgada[] getPrendas() {
        return prendas;
    }

    public boolean addPrenda(PrendaColgada prenda) {
        if (getCarga() + prenda.getPeso() <= getCargaMax()) {
            PrendaColgada[] result = Arrays.copyOf(prendas, prendas.length + 1);
            result[result.length - 1] = prenda;
            prendas = result;
            setCarga(getCarga() + prenda.getPeso());
            return true;
        }
        return false;
    }

    public boolean removePrenda(PrendaColgada prenda) {
        boolean existe = false;

        for (PrendaColgada prendaColgada : prendas) {
            if (prendaColgada.equals(prenda)) {
                existe = true;
            }
        }

        if (existe) {
            PrendaColgada[] result = new PrendaColgada[0];

            for (PrendaColgada prendaColgada : prendas) {
                if (!prendaColgada.equals(prenda)) {
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = prenda;
                }
            }
            prendas = result;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "CamionPerchas{" +
                "prendas=" + Arrays.toString(prendas) +
                ", " + super.toString();
    }

    @Override
    public int compareTo(CamionPerchas camionPerchas) {
        return this.prendas.length - camionPerchas.getPrendas().length;
    }
}
