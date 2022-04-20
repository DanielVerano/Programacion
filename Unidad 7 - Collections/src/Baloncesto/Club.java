package Baloncesto;

import java.io.*;
import java.util.*;

public class Club {
    private Map<Altura, Set<Jugador>> jugadores;

    public Club() {
        jugadores = new HashMap<>();
    }

    public Map<Altura, Set<Jugador>> getJugadores() {
        return jugadores;
    }

    public void setJugadores(Map<Altura, Set<Jugador>> jugadores) {
        this.jugadores = jugadores;
    }

    private Altura calcularAltura(Jugador jugador) {
        Altura a;

        if (jugador.getAltura() < 180) {
            a = Altura.BAJOS;
        } else if (jugador.getAltura() >= 180 && jugador.getAltura() < 200) {
            a = Altura.MEDIANOS;
        } else {
            a = Altura.ALTOS;
        }
        return a;
    }

    public Jugador pedirJugador() {
        Scanner sc = new Scanner(System.in);
        String nombre, apellidos;
        int altura, edad;

        System.out.println("Introduce el nombre:");
        nombre = sc.nextLine();
        System.out.println("Introduce los apellidos:");
        apellidos = sc.nextLine();
        System.out.println("Introduce la altura:");
        altura = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce la edad:");
        edad = sc.nextInt();
        sc.nextLine();

        return new Jugador(nombre, apellidos, altura, edad);
    }

    public void addJugador(Jugador jugador) {
        Altura a = calcularAltura(jugador);

        if (!jugadores.containsKey(a)) {
            jugadores.put(a, new HashSet<>());
        }
        jugadores.get(a).add(jugador);
    }

    public boolean removeJugador(Jugador jugador) {
        Altura a = calcularAltura(jugador);
        boolean result;

        if (jugadores.containsKey(a)) {
            if (jugadores.get(a).contains(jugador)) {
                result = jugadores.get(a).remove(jugador);
            } else {
                System.out.println("El jugador no existe");
                result = false;
            }
        } else {
            System.out.println("No existe esa categoría de altura");
            result = false;
        }
        return result;
    }

    public void mostrarJugadores(Altura altura) {
        Set<Jugador> s = new TreeSet<>(jugadores.get(altura));
        for (Jugador jugador : s) {
            System.out.println(jugador);
        }
    }

    public void mostrarTodosXAltura() {
        Set<Jugador> porAltura = new TreeSet<>(new Comparator<Jugador>() {
            @Override
            public int compare(Jugador j1, Jugador j2) {
                return j2.getAltura() - j1.getAltura();
            }
        });
        Collection<Set<Jugador>> col = jugadores.values();
        Iterator<Set<Jugador>> it = col.iterator();

        while (it.hasNext()) {
            Set<Jugador> set = it.next();
            porAltura.addAll(set);
        }

        for (Jugador jugador : porAltura) {
            System.out.println(jugador);
        }
    }

    public void mostrarJugadoresEntreEdades(int min, int max) {
        ArrayList<Jugador> lista = new ArrayList<>();

        Collection<Set<Jugador>> col = jugadores.values();
        Iterator<Set<Jugador>> it = col.iterator();

        while (it.hasNext()) {
            Set<Jugador> set = it.next();
            for (Jugador jugador : set) {
                if (jugador.getEdad() >= min && jugador.getEdad() <= max) {
                    lista.add(jugador);
                }
            }
        }

        Collections.sort(lista);
        for (Jugador jugador : lista) {
            System.out.println(jugador);
        }
    }

    public void guardarJugadores() {
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream("src/Baloncesto/jugadores.dat"));

            Collection<Set<Jugador>> col = jugadores.values();
            Iterator<Set<Jugador>> it = col.iterator();

            while (it.hasNext()) {
                Set<Jugador> set = it.next();

                for (Jugador jugador : set) {
                    oos.writeObject(jugador);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void cargarJugadores() {
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream("src/Baloncesto/jugadores.dat"));

            while (true) {
                Jugador jugador = (Jugador) ois.readObject();
                addJugador(jugador);
            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        } catch (EOFException e) {
            System.out.println("Fin de fichero");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Club{" +
                "jugadores=" + jugadores +
                '}';
    }
}
