package Empresa_FARA;

public class PrendaColgada extends Prenda implements Colgar {
    private int altura;

    public PrendaColgada(double precio, String nombre, String codigo, double peso, int altura) {
        super(precio, nombre, codigo, peso);
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "PrendaColgada{" +
                "altura=" + altura +
                "} " + super.toString();
    }

    @Override
    public void colgar() {
        System.out.println("La prenda " + getNombre() + " está colgada");
    }

    @Override
    public void doblar() {
        System.out.println("La prenda " + getNombre() + " no se puede doblar");
    }
}
