package Tarea1.Actividad8;

import java.util.Arrays;

public class Casa {
    private Bombilla[] bombillas;
    private boolean general;

    public Casa() {
        this.bombillas = new Bombilla[0];
        this.general = false;
    }

    public boolean isGeneral() {
        return general;
    }

    public void setGeneral(boolean general) {
        this.general = general;
    }

    public void addBombilla(Bombilla bombilla) {
        this.bombillas = Arrays.copyOf(bombillas, bombillas.length + 1);
        this.bombillas[bombillas.length - 1] = bombilla;
    }

    public boolean removeBombilla(int posicion) {
        if (posicion >= 0 && posicion < this.bombillas.length) {
            Bombilla[] resultado = new Bombilla[0];

            for (int i = 0; i < this.bombillas.length; i++) {
                if (i != posicion) {
                    resultado = Arrays.copyOf(bombillas, bombillas.length + 1);
                    resultado[resultado.length - 1] = this.bombillas[i];
                }
            }
            this.bombillas = resultado;
            return true;
        }
        return false;
    }

    public boolean isBombillaOn(int posicion) {
        if (!this.general || (posicion < 0 || posicion >= this.bombillas.length)) {
            return false;
        }

        return this.bombillas[posicion].isEncendida();
    }

    @Override
    public String toString() {
        return "Casa{" +
                "bombillas=" + Arrays.toString(bombillas) +
                ", general=" + general +
                '}';
    }
}
