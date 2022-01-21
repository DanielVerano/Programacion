package Entregable1920_Pizzeria;

import java.util.Arrays;

public class Pizza {
    private Tamano tamano;
    private Ingrediente[] ingredientes;
    private final int CAP_MAX = 3;

    public Pizza(Tamano tamano) {
        this.tamano = tamano;
        this.ingredientes = new Ingrediente[0];
    }

    public Pizza() {
        this(Tamano.FAMILIAR);
    }

    public Tamano getTamano() {
        return tamano;
    }

    public void setTamano(Tamano tamano) {
        this.tamano = tamano;
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }

    public int getNumIngredientes() {
        return ingredientes.length;
    }

    public boolean addIngrediente(Ingrediente ingrediente) {
        if (ingredientes.length < CAP_MAX) {
            Ingrediente[] res = Arrays.copyOf(ingredientes, ingredientes.length + 1);
            res[res.length - 1] = ingrediente;
            ingredientes = res;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "tamano=" + tamano +
                ", ingredientes=" + Arrays.toString(ingredientes) +
                ", CAP_MAX=" + CAP_MAX +
                '}';
    }
}
