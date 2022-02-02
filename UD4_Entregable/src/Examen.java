import java.util.Arrays;
import java.util.Calendar;

public class Examen {
    private Calendar fecha;
    private Sede[] sedes;
    private Pregunta[] preguntas;
    private String consejeria;
    private String enlace;
    private int capacidad;

    public Examen(String consejeria, String enlace) {
        this.fecha = Calendar.getInstance();
        this.sedes = new Sede[0];
        this.preguntas = new Pregunta[0];
        this.consejeria = consejeria;
        this.enlace = enlace;
        this.capacidad = 100;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Sede[] getSedes() {
        return sedes;
    }

    public void setSedes(Sede[] sedes) {
        this.sedes = sedes;
    }

    public Pregunta[] getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(Pregunta[] preguntas) {
        this.preguntas = preguntas;
    }

    public String getConsejeria() {
        return consejeria;
    }

    public void setConsejeria(String consejeria) {
        this.consejeria = consejeria;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void addSede(Sede sede) {
        Sede[] result = Arrays.copyOf(sedes, sedes.length + 1);
        result[result.length - 1] = sede;
        sedes = result;
    }

    public void removeSede(Sede sede) {
        Sede[] result = new Sede[0];

        for (int i = 0; i < sedes.length; i++) {
            if (!sedes[i].equals(sede)) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = sedes[i];
            }
        }
        sedes = result;
    }

    public boolean addPregunta(Pregunta pregunta) {
        if (preguntas.length < capacidad) {
            Pregunta[] result = Arrays.copyOf(preguntas, preguntas.length + 1);
            result[result.length - 1] = pregunta;
            preguntas = result;
            return true;
        }
        return false;
    }

    public void removePregunta(Pregunta pregunta) {
        Pregunta[] result = new Pregunta[0];

        for (int i = 0; i < preguntas.length; i++) {
            if (!preguntas[i].equals(pregunta)) {
                result = Arrays.copyOf(result, result.length+ 1);
                result[result.length - 1] = preguntas[i];
            }
        }
        preguntas = result;
    }

    public void mostrarInformacion() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Examen{" +
                "fecha=" + fecha.getTime() +
                ", sedes=" + Arrays.toString(sedes) +
                ", preguntas=" + Arrays.toString(preguntas) +
                ", consejeria='" + consejeria + '\'' +
                ", enlace='" + enlace + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}
