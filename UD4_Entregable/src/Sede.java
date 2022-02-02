import java.util.Arrays;
import java.util.Objects;

public class Sede {
    private String codigo;
    private Ciudad ciudad;
    private int capacidad;
    private Opositor[] opositores;

    public Sede(String codigo, Ciudad ciudad, int capacidad) {
        this.codigo = codigo;
        this.ciudad = ciudad;
        this.capacidad = capacidad;
        this.opositores = new Opositor[0];
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Opositor[] getOpositores() {
        return opositores;
    }

    public void setOpositores(Opositor[] opositores) {
        this.opositores = opositores;
    }

    public boolean addOpositor(Opositor opositor) {
        if (this.opositores.length < this.capacidad && !estaOpositor(opositor)) {
            Opositor[] result = Arrays.copyOf(opositores, opositores.length + 1);
            result[result.length - 1] = opositor;
            opositores = result;
            return true;
        }
        return false;
    }

    public boolean removeOpositor(Opositor opositor) {
        if (opositores.length > 0 && estaOpositor(opositor)) {
            Opositor[] result = new Opositor[0];

            for (int i = 0; i < opositores.length; i++) {
                if (!opositores[i].equals(opositor)) {
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = opositores[i];
                }
            }
            opositores = result;
            return true;
        }
        return false;
    }

    private boolean estaOpositor(Opositor opositor) {
        for (Opositor opo : opositores) {
            if (opo.equals(opositor)) {
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
        return "Sede{" +
                "codigo='" + codigo + '\'' +
                ", ciudad=" + ciudad +
                ", capacidad=" + capacidad +
                ", opositores=" + Arrays.toString(opositores) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sede sede = (Sede) o;
        return Objects.equals(codigo, sede.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
