package Empresa_ATRIOS;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Juego
        Juego juego1 = new Juego(2020, "Sevilla");

//        Participantes
        Atleta a1 = new Atleta("Atleta1", 30, "Salto");
        Judoka j1 = new Judoka("Judoka1", 25, 80);
        JugadorBaloncesto jug1 = new JugadorBaloncesto("Jugador1", 35, 1.92);
        JugadorBaloncesto jug2 = new JugadorBaloncesto("Jugador2", 29, 1.88);
        JugadorBaloncesto jug3 = new JugadorBaloncesto("Jugador3", 23, 1.96);

        Participante[] participantes = new Participante[]{a1, j1, jug1};
        System.out.println("Participantes:");
        for (Participante participante : participantes) {
            System.out.println(participante);
        }

//        Deportes
        Atletismo atletismo = new Atletismo("Atletismo", "Pabellon", 10);
        Judo judo = new Judo("Judo", "Pabellon", 10);
        Baloncesto baloncesto = new Baloncesto("Baloncesto", "Pabellon", 10);

        Deporte[] deportes = new Deporte[]{atletismo, judo, baloncesto};

//        Añadir deportes
        atletismo.addParticipante(a1);
        judo.addParticipante(j1);
        baloncesto.addParticipante(jug1);
        baloncesto.addParticipante(jug2);
        baloncesto.addParticipante(jug3);

        System.out.println("Deportes:");
        for (Deporte deporte : deportes) {
            System.out.println(deporte);
        }

//        Paises
        Pais pais1 = new Pais("España", 20);
        Pais pais2 = new Pais("Italia", 15);
        Pais pais3 = new Pais("Francia", 30);

        Pais[] paises = new Pais[]{pais1, pais2, pais3};

        System.out.println("Paises:");
        for (Pais pais : paises) {
            System.out.println(pais);
        }

        juego1.addPais(pais1);
        juego1.addPais(pais2);
        juego1.addPais(pais3);
        juego1.addDeporte(atletismo);
        juego1.addDeporte(judo);
        juego1.addDeporte(baloncesto);

        juego1.mostrarPaises();
        juego1.mostrarPaisesParaCeremonia();
        baloncesto.mostrarParticipantes();
        baloncesto.mostrarJugadoresBaloncestoPorAltura();
    }
}
