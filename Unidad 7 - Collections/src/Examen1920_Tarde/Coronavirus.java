package Examen1920_Tarde;

import java.io.*;
import java.util.*;

public class Coronavirus {
    private HashMap<Character, Set<Paciente>> infectados;
    private final String nombre = "COVID-19";
    private final String lugarOrigen = "Wuhan";

    public Coronavirus() {
        this.infectados = new HashMap<>();
    }

    public HashMap<Character, Set<Paciente>> getInfectados() {
        return infectados;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public boolean addPaciente(Character cepa, Paciente paciente) {
        if (paciente.getCepa() != cepa) {
            return false;
        } else if (!infectados.containsKey(cepa)) {
            infectados.put(cepa, new HashSet<>());
        }
        infectados.get(cepa).add(paciente);
        return true;
    }

    public void darDeAltaPaciente(Paciente paciente) {
        if (!infectados.containsKey(paciente.getCepa())) {
            System.out.println("No existe esa cepa aún");
        } else if (!infectados.get(paciente.getCepa()).contains(paciente)) {
            System.out.println("No se ha encontrado el paciente");
        } else {
            Set<Paciente> set = infectados.get(paciente.getCepa());
            set.remove(paciente);
        }
    }

    public void pacientesDeUnDoctor(int numColegiado) {
        boolean tienePacientes = false;

        for (Set<Paciente> pacientes : infectados.values()) {
            Iterator<Paciente> it = pacientes.iterator();
            while (it.hasNext()) {
                Paciente p = it.next();
                if (p.getMedico().getNumColegiado() == numColegiado) {
                    System.out.println(p);
                    tienePacientes = true;
                }
            }
        }

        if (!tienePacientes) {
            System.out.println("Este médico/a no tiene pacientes");
        }
    }

    public void guardarPacientes() {
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream("pacientes.dat"));
            oos.writeObject(infectados);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void cargarPacientes() {
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream("pacientes.dat"));
            this.infectados = (HashMap<Character, Set<Paciente>>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void pacientesPorPeso(Character cepa) {
        List<Paciente> ordenados = new ArrayList<>(infectados.get(cepa));
        ordenados.sort(new Comparator<Paciente>() {
            @Override
            public int compare(Paciente p1, Paciente p2) {
                return Double.compare(p2.getPeso(), p1.getPeso());
            }
        });
        for (Paciente paciente : ordenados) {
            System.out.println(paciente);
        }
    }

    public void pacientesPorEdad(Character cepa) {
        List<Paciente> ordenados = new ArrayList<>(infectados.get(cepa));
        ordenados.sort(new Comparator<Paciente>() {
            @Override
            public int compare(Paciente p1, Paciente p2) {
                return p2.getEdad() - p1.getEdad();
            }
        });
        for (Paciente paciente : ordenados) {
            System.out.println(paciente);
        }
    }

    @Override
    public String toString() {
        return "Coronavirus{" +
                "infectados=" + infectados +
                ", nombre='" + nombre + '\'' +
                ", lugarOrigen='" + lugarOrigen + '\'' +
                '}';
    }
}
