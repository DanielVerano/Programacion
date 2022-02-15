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

        if (!existeCaja(caja) && getCarga() + caja.getPeso() <= getCargaMax()) {
//            No es necesario crear un nuevo vector para añadir
            cajas = Arrays.copyOf(cajas, cajas.length + 1);
            cajas[cajas.length - 1] = caja;
            return true;
        }
        return false;
    }

    public boolean removeCaja(Caja caja) {

        if (existeCaja(caja)) {
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

    private boolean existeCaja(Caja caja) {
        for (Caja c : cajas) {
            if (c.equals(caja)) {
                return true;
            }
        }
        return false;
    }

    public double getCarga() {
        double result = 0;
        for (Caja caja : cajas) {
            result += caja.getPeso();
        }
        return result;
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
