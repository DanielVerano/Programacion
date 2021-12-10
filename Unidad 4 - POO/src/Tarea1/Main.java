package Tarea1;

import javax.security.auth.callback.TextOutputCallback;

public class Main {
    public static void main(String[] args) {
        /*CuentaCorriente cc1 = new CuentaCorriente("Pepe", "12345678Z");
        CuentaCorriente cc2 = new CuentaCorriente("Ana", "222222X");

        cc1.ingresarDinero(100);
        cc1.mostrar();
        cc1.sacarDinero(80);
        cc1.mostrar();

        if (!cc1.sacarDinero(100)) {
            System.out.println("Saldo insuficiente");
        }
        cc1.mostrar();*/

        /* ******************** */

        Texto txt1 = new Texto("Hola", 10);
        System.out.println(txt1);

        txt1.addCharStart('w');
        System.out.println(txt1);

        txt1.addCharFin('u');
        System.out.println(txt1);

        System.out.println(txt1.mostrarVocales());

    }
}
