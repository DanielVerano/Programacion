public class Plato {
    private String nombre;
    private double precio;
    private int calorias;

    public Plato(String nombre, double precio, int calorias) {
        this.nombre = nombre;
        this.precio = precio;
        this.calorias = calorias;
    }

    public Plato() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "Plato{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", calorias=" + calorias +
                '}';
    }
}
