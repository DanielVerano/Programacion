package Empresa_ATRIOS;

public class Atleta extends Participante implements Correr {
    private String nombrePrueba;

    public Atleta(String nombre, int edad, String nombrePrueba) {
        super(nombre, edad);
        this.nombrePrueba = nombrePrueba;
    }

    public String getNombrePrueba() {
        return nombrePrueba;
    }

    public void setNombrePrueba(String nombrePrueba) {
        this.nombrePrueba = nombrePrueba;
    }

    @Override
    public void hacerJuramento() {
        System.out.println("Yo " + getNombre() + ", como atleta, juro " +
                "los valores deportivos mundiales.");
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "nombrePrueba='" + nombrePrueba + '\'' +
                "} " + super.toString();
    }
}
