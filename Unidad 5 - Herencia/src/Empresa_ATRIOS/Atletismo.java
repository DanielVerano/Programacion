package Empresa_ATRIOS;

public class Atletismo extends Deporte {
    private int numPruebas;

    public Atletismo(String nombre, String pabellon, int numPruebas) {
        super(nombre, pabellon);
        this.numPruebas = numPruebas;
    }

    public int getNumPruebas() {
        return numPruebas;
    }

    public void setNumPruebas(int numPruebas) {
        this.numPruebas = numPruebas;
    }

    @Override
    public boolean addParticipante(Participante participante) {
        if (participante instanceof Atleta) {
            return super.addParticipante(participante);
        }
        System.out.println("No puedes añadir un participante de otra competición");
        return false;
    }

    @Override
    public String toString() {
        return "Atletismo{" +
                "numPruebas=" + numPruebas +
                "} " + super.toString();
    }
}
