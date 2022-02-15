package Empresa_ATRIOS;

import java.util.Arrays;
import java.util.Comparator;

public class Baloncesto extends Deporte {
    private int numEquipos;

    public Baloncesto(String nombre, String pabellon, int numEquipos) {
        super(nombre, pabellon);
        this.numEquipos = numEquipos;
    }

    public int getNumEquipos() {
        return numEquipos;
    }

    public void setNumEquipos(int numEquipos) {
        this.numEquipos = numEquipos;
    }

    @Override
    public boolean addParticipante(Participante participante) {
//        Si el participante no es un jugador de baloncesto no lo añadimos, lo mismo para los demás deportes
        if (participante instanceof JugadorBaloncesto) {
            return super.addParticipante(participante);
        }
        System.out.println("No puedes añadir un participante de otra competición");
        return false;
    }

    public void mostrarJugadoresBaloncestoPorAltura() {
        System.out.println("Jugadores de baloncesto ordenados por su altura:");
        Arrays.sort(getParticipantes(), new Comparator<Participante>() {
            @Override
            public int compare(Participante p1, Participante p2) {
                JugadorBaloncesto jug1 = (JugadorBaloncesto) p1;
                JugadorBaloncesto jug2 = (JugadorBaloncesto) p2;
                return Double.compare(jug1.getAltura(), jug2.getAltura());
            }
        });
        for (Participante participante : getParticipantes()) {
            System.out.println(participante);
        }
    }

    @Override
    public String toString() {
        return "Baloncesto{" +
                "numEquipos=" + numEquipos +
                "} " + super.toString();
    }
}
