package Juego_RPG;

import java.util.Arrays;
import java.util.Comparator;

public class RPG {
    private Personaje[] personajes;
    private final int CAPMAX = 10;

    public RPG() {
        this.personajes = new Personaje[0];
    }

    public Personaje[] getPersonajes() {
        return personajes;
    }

    public int getCAPMAX() {
        return CAPMAX;
    }

    public boolean addPersonaje(Personaje p) {
        if (personajes.length < CAPMAX) {
            Personaje[] result = Arrays.copyOf(personajes, personajes.length + 1);
            result[result.length - 1] = p;
            personajes = result;
            return true;
        }
        return false;
    }

    public void borrarMuertos() {
        Personaje[] result = new Personaje[0];
        int muertos = 0;

        for (Personaje p : personajes) {
            if (p.getEnergia() > 0) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = p;
            } else {
                muertos++;
            }
        }
        personajes = result;
        System.out.println(muertos + " personajes borrados");
    }

    public void mostrarEstado() {
        Arrays.sort(personajes);

        for (Personaje personaje : personajes) {
            System.out.println(personaje);
        }
    }

    public void mostrarxAtaque() {
//        Ordenar usando una clase anónima

        Comparator<Personaje> cmpXAtaque = new Comparator<Personaje>() {
            @Override
            public int compare(Personaje p1, Personaje p2) {
                return p1.getCapAtaque() - p2.getCapAtaque();
            }
        };
        Arrays.sort(personajes, cmpXAtaque);

        for (Personaje personaje : personajes) {
            System.out.println(personaje);
        }
    }

    public void mostrarXDefensa() {
//        Ordenar usando una clase a parte

        Arrays.sort(personajes, new ComparadorPorDefensa());

        for (Personaje personaje : personajes) {
            System.out.println(personaje);
        }
    }

    public boolean hayGanador() {
        if (personajes.length == 1 && personajes[0].getEnergia() > 0) {
            System.out.println(personajes[0].getNombre() + " es el GANADOR");
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "RPG{" +
                "personajes=" + Arrays.toString(personajes) +
                ", CAPMAX=" + CAPMAX +
                '}';
    }
}
