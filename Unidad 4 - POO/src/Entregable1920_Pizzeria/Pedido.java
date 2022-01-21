package Entregable1920_Pizzeria;

import java.util.Calendar;

public class Pedido {
    private Pizza pizza;
    private Calendar fechaPedido;

    public Pedido(Pizza pizza) {
        this.pizza = pizza;
        this.fechaPedido = Calendar.getInstance();
    }

    public Pedido() {
        Ingrediente i1 = new Ingrediente("Jamón ibérico", 300);
        Ingrediente i2 = new Ingrediente("Queso", 250);
        this.pizza = new Pizza();
        this.pizza.addIngrediente(i1);
        this.pizza.addIngrediente(i2);
        this.fechaPedido = Calendar.getInstance();
    }

    public Pizza getPizza() {
        return pizza;
    }

    public Calendar getFechaPedido() {
        return fechaPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "pizza=" + pizza + '\n' +
                ", fechaPedido=" + fechaPedido.getTime() +
                '}';
    }
}
