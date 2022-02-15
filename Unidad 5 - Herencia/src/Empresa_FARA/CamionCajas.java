package Empresa_FARA;

import java.util.Arrays;

public class CamionCajas extends Vehiculo implements Comparable<CamionCajas> {
    private Caja[] cajas;

    public CamionCajas(String matricula, double cargaMax, Conductor conductor) {
        super(matricula, cargaMax, conductor);
        this.cajas = new Caja[0];
    }

    @Override
    void descargar() {
        int cajas = getCajas().length;
        int prendas = 0;

        for (Caja caja : getCajas()) {
            prendas += caja.getPrendas().length;
        }

        System.out.println("Descargando " + cajas + " cajas y " + prendas + " prendas");
        this.cajas = new Caja[0];
    }

    public Caja[] getCajas() {
        return cajas;
    }

    public boolean addCaja(Caja caja) {
        for (Caja c : cajas) {
            if (c.equals(caja)) {
                return false;
            }
        }

        double peso = 0;

        for (Prenda prenda : caja.getPrendas()) {
            peso += prenda.getPeso();
        }

        if (getCarga() + peso <= getCargaMax()) {
//            No es necesario crear un nuevo vector para añadir
            Caja[] result = Arrays.copyOf(cajas, cajas.length + 1);
            result[result.length - 1] = caja;
            cajas = result;
            setCarga(getCarga() + peso);
            return true;
        }
        return false;
    }

    public boolean removeCaja(Caja caja) {
        boolean existe = false;

        for (Caja c : cajas) {
            if (c.equals(caja)) {
                existe = true;
            }
        }

        if (existe) {
            Caja[] result = new Caja[0];

            for (Caja c : cajas) {
                if (!c.equals(caja)) {
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = caja;
                }
            }
            cajas = result;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "CamionCajas{" +
                "cajas=" + Arrays.toString(cajas) +
                ", " + super.toString();
    }

    @Override
    public int compareTo(CamionCajas camionCajas) {
        return this.getCajas().length - camionCajas.getCajas().length;
    }
}
