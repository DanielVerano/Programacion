package Empresa_ATRIOS;

import java.util.Arrays;
import java.util.Objects;

public abstract class Deporte {
    private String nombre;
    private String pabellon;
    private Participante[] participantes;

    public Deporte(String nombre, String pabellon) {
        this.nombre = nombre;
        this.pabellon = pabellon;
        this.participantes = new Participante[0];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPabellon() {
        return pabellon;
    }

    public void setPabellon(String pabellon) {
        this.pabellon = pabellon;
    }

    public Participante[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Participante[] participantes) {
        this.participantes = participantes;
    }

    public boolean addParticipante(Participante participante) {

        if (!existeParticipante(participante)) {
            Participante[] result = Arrays.copyOf(participantes, participantes.length + 1);
            result[result.length - 1] = participante;
            participantes = result;
            return true;
        }
        return false;
    }

    public boolean removeParticipante(Participante participante) {
        if (existeParticipante(participante)) {
            Participante[] result = new Participante[0];

            for (Participante p : participantes) {
                if (!p.equals(participante)) {
                    result = Arrays.copyOf(participantes, participantes.length + 1);
                    result[result.length - 1] = p;
                }
            }
            participantes = result;
            return true;
        }
        return false;
    }

    private boolean existeParticipante(Participante participante) {
        for (Participante p : participantes) {
            if (p.equals(participante)) {
                return true;
            }
        }
        return false;
    }

    public void mostrarParticipantes() {
        System.out.println("Participantes ordenados por edad:");
        Arrays.sort(participantes);
        for (Participante participante : participantes) {
            System.out.println(participante);
        }
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", pabellon='" + pabellon + '\'' +
                ", participantes=" + Arrays.toString(participantes) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deporte deporte = (Deporte) o;
        return Objects.equals(nombre, deporte.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
