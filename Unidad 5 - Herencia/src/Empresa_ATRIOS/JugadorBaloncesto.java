package Empresa_ATRIOS;

public class JugadorBaloncesto extends Participante implements Encestar {
    private double altura;

    public JugadorBaloncesto(String nombre, int edad, double altura) {
        super(nombre, edad);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void hacerJuramento() {
        System.out.println("Yo " + getNombre() + ", como jugador de baloncesto, " +
                "juro los valores deportivos mundiales.");
    }

    @Override
    public String toString() {
        return "JugadorBaloncesto{" +
                "altura=" + altura +
                "} " + super.toString();
    }
}
