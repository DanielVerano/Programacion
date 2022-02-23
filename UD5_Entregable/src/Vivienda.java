import java.util.Arrays;
import java.util.Calendar;

public class Vivienda extends Propiedad implements Vender {
    private int numBanios;
    private int numHabitaciones;
    private int capacidadMax;
    private double precio;
    private Persona[] personas;

    public Vivienda(int yearConstruccion, String direccion, double metrosCuadrados,
                    int numBanios, int numHabitaciones, int capacidadMax, double precio) {
        super(yearConstruccion, direccion, metrosCuadrados);
        this.numBanios = numBanios;
        this.numHabitaciones = numHabitaciones;
        this.capacidadMax = capacidadMax;
        this.precio = precio;
        this.personas = new Persona[0];
    }

    public int getNumBanios() {
        return numBanios;
    }

    public void setNumBanios(int numBanios) {
        this.numBanios = numBanios;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Persona[] getPersonas() {
        return personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }

    public boolean addPersona(Persona persona) {
        if (personas.length < capacidadMax && !existePersona(persona)) {
            Persona[] result = Arrays.copyOf(personas, personas.length + 1);
            result[result.length - 1] = persona;
            personas = result;
            return true;
        }
        return false;
    }

    public boolean removePersona(Persona persona) {
        if (existePersona(persona)) {
            Persona[] result = new Persona[0];
            for (Persona p : personas) {
                if (!p.equals(persona)) {
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = p;
                }
            }
            personas = result;
            return true;
        }
        return false;
    }

    private boolean existePersona(Persona persona) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].equals(persona)) {
                return true;
            }
        }
        return false;
    }

    @Override
    void mostrarPropiedad() {
        System.out.println("Fecha:" + Calendar.getInstance().getTime() + "\n" +
                "Clase:" + this.getClass().getSimpleName() + "\n" + this);
    }

    @Override
    public String toString() {
        return "Vivienda{" +
                "numBanios=" + numBanios +
                ", numHabitaciones=" + numHabitaciones +
                ", capacidadMax=" + capacidadMax +
                ", precio=" + precio +
                ", personas=" + Arrays.toString(personas) +
                "} " + super.toString();
    }

    @Override
    public void mostrarPrecioVenta() {
        System.out.println("Soy una Vivienda con una capacidad máxima " +
                this.getCapacidadMax() + " y valgo " + this.getPrecio());
    }
}
