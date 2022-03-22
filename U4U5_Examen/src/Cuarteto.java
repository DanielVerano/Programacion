public class Cuarteto extends AgrupacionOficial implements Callejera {
    private int numMiembros;

    public Cuarteto(String nombre, String autor, String autor_musica, String autor_letras, String disfraz, int puntos, int numMiembros) {
        super(nombre, autor, autor_musica, autor_letras, disfraz, puntos);
        this.numMiembros = numMiembros;
    }

    public int getNumMiembros() {
        return numMiembros;
    }

    public void setNumMiembros(int numMiembros) {
        this.numMiembros = numMiembros;
    }

    @Override
    void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del Cuarteto con nombre " + this.getNombre());
    }

    @Override
    void hacer_tipo() {
        System.out.println("El Cuarteto " + this.getNombre() + " va de " + this.getDisfraz());
    }

    @Override
    void caminito_del_falla() {
        System.out.println("El Cuarteto " + this.getNombre() + " va caminito del falla");
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha el Cuarteto " + this.getNombre());
    }

    @Override
    public String toString() {
        return "Cuarteto{" +
                "numMiembros=" + numMiembros +
                "} " + super.toString();
    }
}
