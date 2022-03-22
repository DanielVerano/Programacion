import java.util.Arrays;

public abstract class AgrupacionOficial extends Agrupacion {
    private int puntos;
    private Integrante[] integrantes;

    public AgrupacionOficial(String nombre, String autor, String autor_musica, String autor_letras, String disfraz, int puntos) {
        super(nombre, autor, autor_musica, autor_letras, disfraz);
        this.puntos = puntos;
        this.integrantes = new Integrante[0];
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void insertar_integrante(Integrante i) {
        this.integrantes = Arrays.copyOf(integrantes, integrantes.length + 1);
        this.integrantes[integrantes.length - 1] = i;
    }

    public boolean eliminar_integrante(Integrante i) {
        if (estaIntegrante(i)) {
            Integrante[] result = new Integrante[0];

            for (int j = 0; j < integrantes.length; j++) {
                if (!integrantes[j].equals(i)) {
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = integrantes[j];
                }
            }
            integrantes = result;
            return true;
        }
        return false;
    }

    private boolean estaIntegrante(Integrante i) {
        for (int j = 0; j < integrantes.length; j++) {
            if (integrantes[j].equals(i)) {
                return true;
            }
        }
        return false;
    }

    abstract void caminito_del_falla();

    @Override
    public String toString() {
        return "puntos=" + puntos +
                ", integrantes=" + Arrays.toString(integrantes) +
                "} " + super.toString();
    }
}
