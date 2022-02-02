import java.util.Objects;

public class Opcion {
    private String texto;
    private boolean esVerdadero;

    public Opcion(String texto, boolean esVerdadero) {
        this.texto = texto;
        this.esVerdadero = esVerdadero;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isEsVerdadero() {
        return esVerdadero;
    }

    public void setEsVerdadero(boolean esVerdadero) {
        this.esVerdadero = esVerdadero;
    }

    public void mostrarInformacion() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Opcion{" +
                "texto='" + texto + '\'' +
                ", esVerdadero=" + esVerdadero +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opcion opcion = (Opcion) o;
        return esVerdadero == opcion.esVerdadero && Objects.equals(texto, opcion.texto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(texto, esVerdadero);
    }
}
