package Entregable1920_Pizzeria;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza(Tamano.MEDIANA);
        System.out.println(pizza1);

        Ingrediente i1 = new Ingrediente();
        Ingrediente i2 = new Ingrediente("Tomate",200);
        pizza1.addIngrediente(i1);
        pizza1.addIngrediente(i2);
        System.out.println(pizza1);

        Pedido ped1 = new Pedido();
        System.out.println(ped1.getFechaPedido().getTime());

        Pizzeria pizzeria1 = new Pizzeria();
        System.out.println(pizzeria1);
        pizzeria1.addPedido(ped1);
        System.out.println(pizzeria1);
        System.out.println(pizza1);
        Pizza.getSizes();
    }
}
