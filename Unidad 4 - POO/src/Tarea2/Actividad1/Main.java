package Tarea2.Actividad1;

public class Main {
    public static void main(String[] args) {
        Lista l1 = new Lista(5);
        Lista l2 = new Lista();

        l1.addInicio(5);
        l1.addInicio(6);
        l1.addInicio(7);
        l1.addFinal(12);
        System.out.println(l1);

        l2.addFinal(11);
        l2.addFinal(13);
        l2.addFinal(15);
        l2.addInicio(1);
        System.out.println(l2);

        l2.addLista(l1);
        System.out.println(l2);

        l2.addIndex(666,4);
        System.out.println(l2);

        l2.removeNumero(4);
        System.out.println(l2);

        System.out.println(l2.obtenerNumero(3));
        System.out.println(l2.buscarNumero(12));
        System.out.println(l2.buscarNumero(1));
    }
}
