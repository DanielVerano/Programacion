public class Comparsa extends AgrupacionOficial {
    private String empresaAtrezzo;

    public Comparsa(String nombre, String autor, String autor_musica, String autor_letras, String disfraz, int puntos, String empresaAtrezzo) {
        super(nombre, autor, autor_musica, autor_letras, disfraz, puntos);
        this.empresaAtrezzo = empresaAtrezzo;
    }

    public String getEmpresaAtrezzo() {
        return empresaAtrezzo;
    }

    public void setEmpresaAtrezzo(String empresaAtrezzo) {
        this.empresaAtrezzo = empresaAtrezzo;
    }

    @Override
    void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la Comparsa con nombre " + this.getNombre());
    }

    @Override
    void hacer_tipo() {
        System.out.println("La Comparsa " + this.getNombre() + " va de " + this.getDisfraz());
    }

    @Override
    void caminito_del_falla() {
        System.out.println("La Comparsa " + this.getNombre() + " va caminito del falla");
    }

    @Override
    public String toString() {
        return "Comparsa{" +
                "empresaAtrezzo='" + empresaAtrezzo + '\'' +
                "} " + super.toString();
    }
}
