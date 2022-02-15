package Empresa_ATRIOS;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Juego
        Juego juego1 = new Juego(2020, "Sevilla");
        System.out.println(juego1);

//        Participantes
        Atleta a1 = new Atleta("Atleta1", 30, "Salto");
        Judoka j1 = new Judoka("Judoka1", 25, 80);
        JugadorBaloncesto jug1 = new JugadorBaloncesto("Jugador1", 35, 1.92);

        Participante[] participantes = new Participante[]{a1, j1, jug1};
        System.out.println(Arrays.toString(participantes));

//        Deportes
        Atletismo atletismo = new Atletismo("Atletismo", "Pabellon", 10);
        Judo judo = new Judo("Judo", "Pabellon", 10);
        Baloncesto baloncesto = new Baloncesto("Baloncesto", "Pabellon", 10);

        Deporte[] deportes = new Deporte[]{atletismo, judo, baloncesto};
        System.out.println(Arrays.toString(deportes));

//        Añadir deportes
        atletismo.addParticipante(a1);
        judo.addParticipante(j1);
        baloncesto.addParticipante(jug1);

        System.out.println(Arrays.toString(deportes));

//        Paises
        Pais pais1 = new Pais("España", 20);
        Pais pais2 = new Pais("Italia", 15);
        Pais pais3 = new Pais("Francia", 30);

        Pais[] paises = new Pais[]{pais1, pais2, pais3};
        System.out.println(Arrays.toString(paises));

        juego1.addPais(pais1);
        juego1.addPais(pais2);
        juego1.addPais(pais3);
        System.out.println(juego1);
    }
}
