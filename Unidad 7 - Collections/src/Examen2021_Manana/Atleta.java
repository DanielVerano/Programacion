package Examen2021_Manana;

public class Atleta {
    private int numDorsal;
    private String nombre;
    private String pais;
    private int marca;
    private Categoria categoria;
    private boolean finisher;
    private static int numAtletas = 1;

    public Atleta(String nombre, String pais, Categoria categoria) {
        this.nombre = nombre;
        this.pais = pais;
        this.categoria = categoria;
        finisher = false;
        marca = 0;
        numDorsal = numAtletas;
        numAtletas++;
    }

    public int getNumDorsal() {
        return numDorsal;
    }

    public void setNumDorsal(int numDorsal) {
        this.numDorsal = numDorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public boolean isFinisher() {
        return finisher;
    }

    public void setFinisher(boolean finisher) {
        this.finisher = finisher;
    }

    public static int getNumAtletas() {
        return numAtletas;
    }

    public static void setNumAtletas(int numAtletas) {
        Atleta.numAtletas = numAtletas;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "numDorsal=" + numDorsal +
                ", nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", marca=" + marca +
                ", categoria=" + categoria +
                ", finisher=" + finisher +
                '}';
    }
}
