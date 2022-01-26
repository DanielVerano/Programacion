package Libro_Conjunto;

public class Main {
    public static void main(String[] args) {
        Conjunto con1 = new Conjunto();
        Conjunto con2 = new Conjunto(5);

        for (int i = 0; i < 5; i++) {
            con1.addElemento(i);
            con2.addElemento(i + 1);
        }

        System.out.println(con1);
        System.out.println(con2);
        System.out.println(Conjunto.incluido(con1, con2));
        System.out.println(Conjunto.union(con1, con2));
        System.out.println(Conjunto.interseccion(con1, con2));
        System.out.println(Conjunto.diferencia(con1, con2));
    }
}
