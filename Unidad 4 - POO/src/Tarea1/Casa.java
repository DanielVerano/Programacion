package Tarea1;

import java.util.Arrays;

public class Casa {
    private Bombilla[] bombillas;

    public Casa() {
        this.bombillas = new Bombilla[0];
    }

    public void mostrarBombillas() {
        for (Bombilla bombilla : bombillas) {
            System.out.println(bombilla);
        }
    }

    public void anadirBombilla(Bombilla bombilla) {
        this.bombillas = Arrays.copyOf(bombillas, bombillas.length + 1);
        this.bombillas[bombillas.length - 1] = bombilla;
    }
}
