package Entregable1920_Pizzeria;

import java.util.Arrays;

public class Pizzeria {
    private Pedido[] pedidos;
    private int capacidad;
    private static final int CAP_MAX = 5;

    public Pizzeria() {
        this(CAP_MAX);
    }

    public Pizzeria(int capacidad) {
        this.pedidos = new Pedido[0];
        this.capacidad = capacidad;
    }

    public Pedido[] getPedidos() {
        return pedidos;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean addPedido(Pedido pedido) {
        if (this.pedidos.length < this.capacidad) {
            Pedido[] res = Arrays.copyOf(pedidos, pedidos.length + 1);
            res[res.length - 1] = pedido;
            pedidos = res;
            return true;
        }
        return false;
    }

    public int getNumPedidos() {
        return pedidos.length;
    }

    @Override
    public String toString() {
        return "Pizzeria{" +
                "pedidos=" + Arrays.toString(pedidos) +
                ", capacidad=" + capacidad +
                '}';
    }
}
