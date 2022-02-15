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
        prendas = new PrendaColgada[0];
    }

    public PrendaColgada[] getPrendas() {
        return prendas;
    }

    public void addPrenda(PrendaColgada prenda) {
        prendas = Arrays.copyOf(prendas, prendas.length + 1);
        prendas[prendas.length - 1] = prenda;
    }

    public boolean removePrenda(PrendaColgada prenda) {

        if (existePrenda(prenda)) {
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

    private boolean existePrenda(PrendaColgada prenda) {
        for (PrendaColgada pr : prendas) {
            if (pr.equals(prenda)) {
                return true;
            }
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
