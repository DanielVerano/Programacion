public class Chirigota extends AgrupacionOficial implements Callejera {
    private int numCuples;

    public Chirigota(String nombre, String autor, String autor_musica, String autor_letras, String disfraz, int puntos, int numCuples) {
        super(nombre, autor, autor_musica, autor_letras, disfraz, puntos);
        this.numCuples = numCuples;
    }

    public int getNumCuples() {
        return numCuples;
    }

    public void setNumCuples(int numCuples) {
        this.numCuples = numCuples;
    }

    @Override
    void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la Chirigota con nombre " + this.getNombre());
    }

    @Override
    void hacer_tipo() {
        System.out.println("La Chirigota " + this.getNombre() + " va de " + this.getDisfraz());
    }

    @Override
    void caminito_del_falla() {
        System.out.println("La Chirigota " + this.getNombre() + " va caminito del falla");
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha la Chirigota " + this.getNombre());
    }

    @Override
    public String toString() {
        return "Chirigota{" +
                "numCuples=" + numCuples +
                "} " + super.toString();
    }
}
