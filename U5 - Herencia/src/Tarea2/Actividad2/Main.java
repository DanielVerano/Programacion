package Tarea2.Actividad2;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("1111111A","Pepe",33,1000);
        Cliente c2 = new Cliente("2222222B","Ana",20,1200);
        Cliente c3 = new Cliente("3333333C","Lola",17,900);
        Cliente c4 = new Cliente("4444444D","Juan",43,1600);
        Cliente c5 = new Cliente("5555555E","Victor",51,2000);

        Cliente[] clientes = new Cliente[]{c5, c3, c2, c4, c1};

        System.out.println("Orden original:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        System.out.println("Ordenados por DNI:");

        Arrays.sort(clientes);
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        System.out.println("Ordenados por nombre:");

        ClienteOrdenadosPorNombre porNombre = new ClienteOrdenadosPorNombre();
        Arrays.sort(clientes, porNombre);
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        System.out.println("Ordenados por edad:");

        ClienteOrdenadosPorEdad porEdad = new ClienteOrdenadosPorEdad();
        Arrays.sort(clientes, porEdad);
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        System.out.println("Ordenados por saldo:");
//        Ordenar con clase anónima
        Comparator<Cliente> porSaldo = new Comparator<Cliente>() {
            @Override
            public int compare(Cliente c1, Cliente c2) {
                double result = c1.getSaldo() - c2.getSaldo();

                if (result > 0) {
                    return 1;
                } else if (result < 0) {
                    return -1;
                }
                return 0;
            }
        };

        Arrays.sort(clientes, porSaldo);
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}
