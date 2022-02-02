import java.util.Arrays;
import java.util.Objects;

public class Pregunta {
    private String enunciado;
    private Opcion[] opciones;
    private int capacidad;

    public Pregunta(String enunciado) {
        this.enunciado = enunciado;
        this.opciones = new Opcion[0];
        this.capacidad = 3;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public Opcion[] getOpciones() {
        return opciones;
    }

    public void setOpciones(Opcion[] opciones) {
        this.opciones = opciones;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean addOpcion(Opcion opcion) {
        if (this.opciones.length < this.capacidad && !estaOpcion(opcion)) {
            Opcion[] result = Arrays.copyOf(opciones, opciones.length + 1);
            result[result.length - 1] = opcion;
            opciones = result;
            return true;
        }
        return false;
    }

    public boolean removeOpcion(Opcion opcion) {
        if (this.opciones.length > 0 && estaOpcion(opcion)) {
            Opcion[] result = new Opcion[0];

            for (int i = 0; i < opciones.length; i++) {
                if (!opciones[i].equals(opcion)) {
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = opciones[i];
                }
            }
            opciones = result;
            return true;
        }
        return false;
    }

    private boolean estaOpcion(Opcion opcion) {
        for (Opcion o : opciones) {
            if (o.equals(opcion)) {
                return true;
            }
        }
        return false;
    }

    public void mostrarInformacion() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Pregunta{" +
                "enunciado='" + enunciado + '\'' +
                ", opciones=" + Arrays.toString(opciones) +
                ", capacidad=" + capacidad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pregunta pregunta = (Pregunta) o;
        return capacidad == pregunta.capacidad && Objects.equals(enunciado, pregunta.enunciado) && Arrays.equals(opciones, pregunta.opciones);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(enunciado, capacidad);
        result = 31 * result + Arrays.hashCode(opciones);
        return result;
    }
}
