package Tarea1.Actividad9.Maquinaria;

import Tarea1.Actividad9.Personal.Maquinista;

import java.util.Arrays;

public class Tren {
    private Locomotora locomotora;
    private Vagon[] vagones;
    private Maquinista maquinista;

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

    public boolean addVagon(Vagon v) {
        if (vagones.length < 5) {
            Vagon[] res = Arrays.copyOf(vagones, vagones.length + 1);
            res[res.length - 1] = v;
            this.vagones = res;
            return true;
        }
        return false;
    }

    public Maquinista getMaquinista() {
        return maquinista;
    }

    public void setMaquinista(Maquinista maquinista) {
        this.maquinista = maquinista;
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
