package ModificandoDOM;

public class Persona {
    private String nombre;
    private int edad, id;
    private static int numPersonas = 1;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        id = numPersonas;
        numPersonas++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public static int getNumPersonas() {
        return numPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", id=" + id +
                '}';
    }
}
