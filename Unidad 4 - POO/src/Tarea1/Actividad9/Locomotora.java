package Tarea1.Actividad9;

public class Locomotora {
    private String matricula;
    private int potencia;
    private int anioFabricacion;
    private Mecanico mecanico;

    public Locomotora(String matricula, int potencia, int anioFabricacion, Mecanico mecanico) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.anioFabricacion = anioFabricacion;
        this.mecanico = mecanico;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    @Override
    public String toString() {
        return "Locomotora{" +
                "matricula='" + matricula + '\'' +
                ", potencia=" + potencia +
                ", anioFabricacion=" + anioFabricacion +
                ", mecanico=" + mecanico +
                '}';
    }
}
