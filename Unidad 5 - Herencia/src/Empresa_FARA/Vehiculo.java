package Empresa_FARA;

public abstract class Vehiculo {
    private String matricula;
    private double cargaMax;
    private double cargaInicial;
    private Conductor conductor;

    public Vehiculo(String matricula, double cargaMax, Conductor conductor) {
        this.matricula = matricula;
        this.cargaMax = cargaMax;
        this.conductor = conductor;
        this.cargaInicial = 0;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getCargaMax() {
        return cargaMax;
    }

    public double getCargaInicial() {
        return cargaInicial;
    }

    public void setCargaInicial(double cargaInicial) {
        this.cargaInicial = cargaInicial;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    abstract void descargar();

    @Override
    public String toString() {
        return "matricula='" + matricula + '\'' +
                ", cargaMax=" + cargaMax +
                ", cargaInicial=" + cargaInicial +
                ", conductor=" + conductor +
                '}';
    }
}
