public class Romancero extends Agrupacion implements Callejera {
    private String tematicaCartelon;

    public Romancero(String nombre, String autor, String autor_musica, String autor_letras, String disfraz, String tematicaCartelon) {
        super(nombre, autor, autor_musica, autor_letras, disfraz);
        this.tematicaCartelon = tematicaCartelon;
    }

    public String getTematicaCartelon() {
        return tematicaCartelon;
    }

    public void setTematicaCartelon(String tematicaCartelon) {
        this.tematicaCartelon = tematicaCartelon;
    }

    @Override
    void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del Romancero con nombre " + this.getNombre());
    }

    @Override
    void hacer_tipo() {
        System.out.println("El Romancero " + this.getNombre() + " va de " + this.getDisfraz());
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha el Romancero " + this.getNombre());
    }

    @Override
    public String toString() {
        return "Romancero{" +
                "tematicaCartelon='" + tematicaCartelon + '\'' +
                "} " + super.toString();
    }
}
