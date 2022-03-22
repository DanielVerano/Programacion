public class Coro extends AgrupacionOficial {
    private int numBandurrias;
    private int numGuitarras;

    public Coro(String nombre, String autor, String autor_musica, String autor_letras, String disfraz, int puntos, int numBandurrias, int numGuitarras) {
        super(nombre, autor, autor_musica, autor_letras, disfraz, puntos);
        this.numBandurrias = numBandurrias;
        this.numGuitarras = numGuitarras;
    }

    public int getNumBandurrias() {
        return numBandurrias;
    }

    public void setNumBandurrias(int numBandurrias) {
        this.numBandurrias = numBandurrias;
    }

    public int getNumGuitarras() {
        return numGuitarras;
    }

    public void setNumGuitarras(int numGuitarras) {
        this.numGuitarras = numGuitarras;
    }

    @Override
    void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del Coro con nombre " + this.getNombre());
    }

    @Override
    void hacer_tipo() {
        System.out.println("El Coro " + this.getNombre() + " va de " + this.getDisfraz());
    }

    @Override
    void caminito_del_falla() {
        System.out.println("El Coro " + this.getNombre() + " va caminito del falla");
    }

    @Override
    public String toString() {
        return "Coro{" +
                "numBandurrias=" + numBandurrias +
                ", numGuitarras=" + numGuitarras +
                "} " + super.toString();
    }
}
