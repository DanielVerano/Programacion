package Tarea1.Actividad9;

import java.util.Arrays;

public class Tren {
    private Locomotora locomotora;
    private Vagon[] vagones;
    private Maquinista maquinista;
    private static final int CAP_MAX = 5;

    public Tren(Locomotora locomotora, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.vagones = new Vagon[0];
        this.maquinista = maquinista;
    }

    public Locomotora getLocomotora() {
        return locomotora;
    }

    public void setLocomotora(Locomotora locomotora) {
        this.locomotora = locomotora;
    }

    public Vagon[] getVagones() {
        return vagones;
    }

    public Maquinista getMaquinista() {
        return maquinista;
    }

    public void setMaquinista(Maquinista maquinista) {
        this.maquinista = maquinista;
    }

    public boolean addVagon(Vagon v) {
        if (vagones.length < Tren.CAP_MAX) {
            Vagon[] res = Arrays.copyOf(vagones, vagones.length + 1);
            res[res.length - 1] = v;
            this.vagones = res;
            return true;
        }
        return false;
    }

    public boolean removeVagon() {
        if (vagones.length > 0) {
            Vagon[] res = new Vagon[vagones.length - 1];

            for (int i = 0; i < res.length; i++) {
                res[i] = vagones[i];
            }

            vagones = res;
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Tren{" +
                "locomotora=" + locomotora +
                ", vagones=" + Arrays.toString(vagones) +
                ", maquinista=" + maquinista +
                '}';
    }
}
